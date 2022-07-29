package clientAPI;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import model.Action;
import model.Customer;
import model.Entity;
import model.FileLink;

public class EntityApiPrivate {
	private static Client client;
	
	public void LoginHtppCall(Client pClient) throws IOException {
		try {
			client = pClient;
			HttpPost request = new HttpPost(client.getPath() + "auth/login");
			StringEntity params = new StringEntity("{\"name\":\""+client.getUsername()+"\",\"password\":\""+client.getPassword()+"\", "
		    		+ "\"tenant\":\"MyStore\", \"branch\":\"MYSTORE\"} ");
			request.setEntity(params);
			HttpCall(client, request, HeaderContentType.Json);
		} catch (Exception ex) {}
	}
	
	public void LogoutHttpCall() throws IOException {
		try {
			HttpPost request = new HttpPost(client.getPath()+"auth/logout");
			HttpCall(client, request, HeaderContentType.Json);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
		    client.getHttpClient().close();
		}
	}
	
	protected ApiResponse getListHttpCall(HashMap<String, String> parameters, HeaderContentType type, Class<Entity> className) throws IOException {
		try {
			HttpGet request = new HttpGet(client.getPath() + client.getVersion() + className.getSimpleName());		
			addParameters(parameters, request);
			ApiResponse response =HttpCall(client, request, type);
			String responseString = response.getResponseJson();		
			
			//Type listType = new TypeToken<ArrayList<Entity>>(){}.getType();
			//List<Entity> entityResult = new Gson().fromJson(responseString, listType);
			ObjectMapper mapper = new ObjectMapper();
			mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
			List<Entity> entityResult = mapper.readValue(responseString, new TypeReference<List<Entity>>(){});
			
			response.setListofData(entityResult);
			return response;
			
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		} 
	}
	
	protected ApiResponse getByKeysHttpCall(List<String> ID, HashMap<String, String> parameters, HeaderContentType type, Class<Entity> className){
		try {
			String urlString = client.getPath()+client.getVersion()+className.getSimpleName();
			for(String s : ID) {
				urlString += "/"+ s;
			}
			HttpGet request = new HttpGet(urlString);
			addParameters(parameters, request);
			ApiResponse response = HttpCall(client, request, type);
			String responseString = response.getResponseJson();
			//Entity entityResult =  new Gson().fromJson(responseString, Entity.class);
			/*
			 * ObjectMapper mapper = new ObjectMapper();
			mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
			Entity entityResult = mapper.readValue(responseString, );
			 */
			
			response.setData(DeserializeObject(responseString, className));
			return response;
			
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		} 
	}


	protected ApiResponse CreateOrUpdateHttpCall(Entity entity, HashMap<String, String> parameters, HeaderContentType type) {
		try {
			HttpPut request = new HttpPut(client.getPath()+client.getVersion()+entity.getClass().getSimpleName());
			addParameters(parameters, request);
			StringEntity body = new StringEntity(new Gson().toJson(entity));
			request.setEntity(body);
			ApiResponse response = HttpCall(client, request, type);
			String responseString = response.getResponseJson();
			
			//Entity entityResult = new Gson().fromJson(responseString, Entity.class);
			/*
			 * ObjectMapper mapper = new ObjectMapper();
			mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
			Entity entityResult = mapper.readValue(responseString, entity.getClass());
			
			 */
			
			
			response.setData(DeserializeObject(responseString, entity.getClass()));
			return response;
			
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	protected ApiResponse removeByKeysHttpCall(Entity entity, String ID, HeaderContentType type) {
		try {
			HttpDelete request = new HttpDelete(client.getPath()+client.getVersion()+entity.getClass().getSimpleName() + "/"+ ID);
			ApiResponse response = HttpCall(client, request, type);
			String responseString = response.getResponseJson();
			
			//Entity entityResult = new Gson().fromJson(responseString, Entity.class);
			/*
			 * ObjectMapper mapper = new ObjectMapper();
			mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
			Entity entityResult = mapper.readValue(responseString, entity.getClass());
			
			 */
			
			response.setData(DeserializeObject(responseString, entity.getClass()));
			return response;
			
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	protected ApiResponse attachFileHttpCall(Entity entity, String endpointID, File file, HashMap<String, String> parameters, HeaderContentType type) {
		try {
			
			HttpPut request = new HttpPut(client.getPath()+client.getVersion()+entity.getClass().getSimpleName() + "/"+ endpointID + "/"+ "files/"+  file.getName());
			addParameters(parameters, request);
			HttpEntity fileEntity = MultipartEntityBuilder.create().addBinaryBody(file.getName(), file, ContentType.APPLICATION_OCTET_STREAM, file.getName())	
	        .build();
	        request.setEntity(fileEntity);
			
	        ApiResponse response = HttpCall(client, request, type);
			String responseString = response.getResponseJson();
			
			response.setData(DeserializeObject(responseString, entity.getClass()));
			
			return response;
			
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	protected ApiResponse retrieveFileLinkHttpCall(String ID, HashMap<String, String> parameters, HeaderContentType type, String path) {
		try {
			HttpGet request = new HttpGet(client.getPath()+client.getVersion()+ path + "/"+ ID);
			addParameters(parameters, request);
			ApiResponse response = HttpCall(client,request, type);
			String responseString = response.getResponseJson();

			Entity entityResult = DeserializeObject(responseString, Entity.class);
			response.setData(entityResult);
			List<FileLink> filelinks = entityResult.getFiles();
			response.setFiles(filelinks);
			
			
			/*
			if(response.getStatusCode()==200) {
				for(FileLink f : filelinks) {
					HttpGet requestFile = new HttpGet("http://localhost"+f.getHref());
					ApiResponse apiresponseFile = HttpCall(client, requestFile, type);
					apiresponseFile.get
				}
			}
			*/
			
			
			return response;
		}
			
		 catch (Exception ex) {
			ex.printStackTrace();
			return null;
		} 
	}
	
	protected ApiResponse invokeHttpCall(Entity entity, Action action, HeaderContentType type) {
		try {
			HttpPost request = new HttpPost(client.getPath()+client.getVersion()+entity.getClass().getSimpleName()+ "/"+ action.getClass().getSimpleName());
			StringEntity body = new StringEntity(new Gson().toJson(action));
			request.setEntity(body);
			ApiResponse apiresponse = HttpCall(client, request, type);
			//String responseString = apiresponse.getResponseJson();
			return apiresponse;
			
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	protected ApiResponse monitorStatusHttpCall(ApiResponse status, HeaderContentType type) {
		try {
			 
			HttpGet request = new HttpGet("http://localhost" + status.getLocation());
			ApiResponse apiresponse = HttpCall(client, request, type);
			while(apiresponse.getStatusCode() != 204) {
				apiresponse = HttpCall(client, request, type);
			}
			return apiresponse; 
			
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}


	
	private Entity DeserializeObject(String responseString, Class<? extends Entity> class1) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		Entity entityResult;
		
		if(responseString != null) {
			entityResult = mapper.readValue(responseString, class1);
		}
		else {
			//What can be done when there is no Json Response  (for ex, put method for file)
			entityResult=null;
		}
		
		return entityResult;
	}

	private static void composeContentHeaders(HttpRequest request, HeaderContentType contentTypes) {
		HashMap<String, String> headers = ComposeHeadersArray(contentTypes);
		for(Entry<String, String> entry: headers.entrySet()) {
			request.addHeader(entry.getKey(),entry.getValue());
		    }
	}

	 private static HashMap<String, String> ComposeHeadersArray(HeaderContentType contentTypes)
	 {
	     HashMap<String, String> headers = new HashMap<String, String>();
	     if ((contentTypes) == HeaderContentType.Json)
	     {
	    	 headers.put("Accept", "application/json");
	    	 headers.put("Content-type", "application/json");
	     }
	     if ((contentTypes) == HeaderContentType.Xml)
	     {
	    	 headers.put("Accept", "application/xml");
	    	 headers.put("Content-type", "application/xml");
	     }
	     
	     if ((contentTypes) == HeaderContentType.OctetStream)
	     {
	    	 headers.put("Accept", "application/json"); //should it be related to octetstream?
	         headers.put("Content-type", "application/octet-stream");
	     }
	     
	     return headers;
	 }
	
	private void addParameters(HashMap<String, String> parameters, HttpRequest request) {
		URIBuilder uri = new URIBuilder(((HttpRequestBase) request).getURI());
		try {
			if(parameters!=null) {
				for(Entry<String, String> entry: parameters.entrySet()) {
					uri.setParameter(entry.getKey(),entry.getValue());
				    }
				URI RequestURI = uri.build();
				((HttpRequestBase) request).setURI(RequestURI);
			}
		} catch (URISyntaxException e) {
			e.printStackTrace();
			
		}
		
	}
	
	private ApiResponse HttpCall(Client client, HttpRequest request, HeaderContentType contentTypes) throws BadStatusCodeException {
	    composeContentHeaders(request, contentTypes);
	    try {
	    	CloseableHttpResponse response = client.getHttpClient().execute((HttpUriRequest) request);
	    	ApiResponse apiresponse = new ApiResponse(response);
	    	
			if(response.getStatusLine().getStatusCode() >= 400 && apiresponse.getStatusCode() < 500) {
				throw new BadStatusCodeException("Client error:" + response.getStatusLine().toString());
			}
			if(response.getStatusLine().getStatusCode() >= 500) {
				//return the content too (why it failed)
				throw new BadStatusCodeException("Server error:" + response.getStatusLine().toString()); 
			}
			HttpEntity entity = response.getEntity();
			ArrayList<byte[]> bytearray = new ArrayList<>();
			apiresponse.setEntity(entity);
			
			if(entity!=null) {
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				entity.writeTo(baos);
			    
				byte[] bytes =  baos.toByteArray();
				bytearray.add(bytes);
				apiresponse.setBytearray(bytearray);
				String responseString= new String(bytes, StandardCharsets.UTF_8);
				apiresponse.setResponseJson(responseString);
			}
			return apiresponse;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
}
	
	

	
	

}
