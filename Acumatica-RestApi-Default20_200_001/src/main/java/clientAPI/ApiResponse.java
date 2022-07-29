package clientAPI;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;

import model.Entity;
import model.FileLink;




//what is data? what can be its types?
public class ApiResponse{
	private CloseableHttpResponse response;
	private String JsonResponse;
	private Entity data;
	private List<Entity> listofData;
	private HttpEntity entity;
	private ArrayList<byte[]> bytearray;
	private InputStream stream;
	private List<FileLink> fileLinks;
	
	public ApiResponse(CloseableHttpResponse pResponse) {
		this.response=pResponse;
	}

	public int getStatusCode() {
		return getStatusLine().getStatusCode();
	}
	
	public StatusLine getStatusLine() {
		return response.getStatusLine();
	}


	public Header[] getHeaders() {
		return response.getAllHeaders();
	}


	public void setResponseJson(String pJsonResponse) {
		this.JsonResponse=pJsonResponse;
	}

	public String getResponseJson() {
		return this.JsonResponse;
	}
	

	public void setData(Entity data) {
		this.data = data;
	}

	public Entity getData() {
		return data;
	}

	public String getLocation() {
		for (Header m : response.getAllHeaders()) {
			if(m.getName().equals("Location")) {
				return m.getValue();
			}
		}
		return null;
	}

	public List<Entity> getListofData() {
		return listofData;
	}

	public void setListofData(List<Entity> listofData) {
		this.listofData = listofData;
	}

	public HttpEntity getEntity() {
		return entity;
	}

	public void setEntity(HttpEntity entity) {
		this.entity = entity;
	}

	public ArrayList<byte[]> getBytearray() {
		return bytearray;
	}

	public void setBytearray(ArrayList<byte[]> bytearray) {
		this.bytearray = bytearray;
	}

	public InputStream getStream() {
		return stream;
	}

	public void setStream(InputStream stream) {
		this.stream = stream;
	}

	public List<FileLink> getFiles() {
		return fileLinks;
	}

	public void setFiles(List<FileLink> files) {
		this.fileLinks = files;
	}

	
	
	
}
