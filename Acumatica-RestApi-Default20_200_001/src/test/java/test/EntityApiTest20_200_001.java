package test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpRequest;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;
import org.mockito.ArgumentMatchers ;

import com.google.gson.Gson;

import clientAPI.ApiResponse;
import clientAPI.BadStatusCodeException;
import clientAPI.Client;
import clientAPI.EntityApiPrivate;
import clientAPI.HeaderContentType;
import model.Action;
import model.Customer;
import model.Entity;

public class EntityApiTest20_200_001 {
	private Client client;
	 private CloseableHttpClient httpClient;
	  private CloseableHttpResponse expectedResponse;
	  private StatusLine statusline;
	  private EntityApiPrivate request;

	  @Before
	  public void setUp() throws Exception {
	    this.httpClient = mock(CloseableHttpClient.class);
	    this.expectedResponse = mock(CloseableHttpResponse.class);
	    this.statusline = mock(StatusLine.class);
	    this.request = new EntityApiPrivate();
	    this.client = new Client("admin", "123", "MyStoreInstance", "Default/20.200.001/");
	  }
	
	
	private void helper(int statuscode) throws IOException {
		when(this.statusline.getStatusCode()).thenReturn(statuscode);
	    when(this.expectedResponse.getStatusLine()).thenReturn(this.statusline);
	    when(this.expectedResponse.getEntity()).thenReturn(new StringEntity("{\"message\":\"success\"}","UTF-8"));
		client.setHttpClient(httpClient);
		request.LoginHtppCall(client);

		
	}
/*	
	private void setMockEntity() throws IOException {
		request.LoginHtppCall(client);
		when(expectedResponse.getEntity()).thenReturn(
		        new InputStreamEntity(
		          new ByteArrayInputStream(
		           "{\"message\":\"success\"}".getBytes())));
			client.setHttpClient(httpClient);
	}
*/	
	private String getMockJsonResponse() throws IOException {
		ArrayList<byte[]> bytearray = new ArrayList<>();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		this.expectedResponse.getEntity().writeTo(baos);
		
		byte[] bytes =  baos.toByteArray();
		bytearray.add(bytes);
		String responseString= new String(bytes, StandardCharsets.UTF_8);
		
		//System.out.print(responseString);
		return responseString;
		//when(( this.expectedResponse).getResponseJson()).thenReturn(responseString);
	}
	 
	private String get2CustomersJsonString() {
		return new String("[\r\n"
	    		+ "    {\r\n"
	    		+ "        \"id\": \"fbf11cfb-e8e1-ec11-8702-28dfebb71e4c\",\r\n"
	    		+ "        \"rowNumber\": 1,\r\n"
	    		+ "        \"note\": {\r\n"
	    		+ "            \"value\": \"\"\r\n"
	    		+ "        },\r\n"
	    		+ "        \"CustomerClass\": {\r\n"
	    		+ "            \"value\": \"DEFAULT\"\r\n"
	    		+ "        },\r\n"
	    		+ "        \"CustomerID\": {\r\n"
	    		+ "            \"value\": \"<NEW>\"\r\n"
	    		+ "        },\r\n"
	    		+ "        \"CustomerName\": {\r\n"
	    		+ "            \"value\": \"Johnny Smith\"\r\n"
	    		+ "        },\r\n"
	    		+ "        \"MainContact\": {\r\n"
	    		+ "            \"id\": \"7cb4c881-0b22-4421-8fd0-d40659037848\",\r\n"
	    		+ "            \"rowNumber\": 1,\r\n"
	    		+ "            \"note\": null,\r\n"
	    		+ "            \"Address\": {\r\n"
	    		+ "                \"id\": \"5d6fae9f-b0cf-446c-be55-8bc640ab1408\",\r\n"
	    		+ "                \"rowNumber\": 1,\r\n"
	    		+ "                \"note\": null,\r\n"
	    		+ "                \"AddressLine1\": {},\r\n"
	    		+ "                \"AddressLine2\": {},\r\n"
	    		+ "                \"City\": {},\r\n"
	    		+ "                \"PostalCode\": {},\r\n"
	    		+ "                \"State\": {},\r\n"
	    		+ "                \"custom\": {}\r\n"
	    		+ "            },\r\n"
	    		+ "            \"Email\": {},\r\n"
	    		+ "            \"Phone1\": {},\r\n"
	    		+ "            \"custom\": {}\r\n"
	    		+ "        },\r\n"
	    		+ "        \"custom\": {}\r\n"
	    		+ "    },\r\n"
	    		+ "    {\r\n"
	    		+ "        \"id\": \"e43d3c1c-8765-e411-a267-e06995c86014\",\r\n"
	    		+ "        \"rowNumber\": 2,\r\n"
	    		+ "        \"note\": {\r\n"
	    		+ "            \"value\": \"\"\r\n"
	    		+ "        },\r\n"
	    		+ "        \"CustomerClass\": {\r\n"
	    		+ "            \"value\": \"DEFAULT\"\r\n"
	    		+ "        },\r\n"
	    		+ "        \"CustomerID\": {\r\n"
	    		+ "            \"value\": \"C000000001\"\r\n"
	    		+ "        },\r\n"
	    		+ "        \"CustomerName\": {\r\n"
	    		+ "            \"value\": \"Jersey Central Office Equip\"\r\n"
	    		+ "        },\r\n"
	    		+ "        \"MainContact\": {\r\n"
	    		+ "            \"id\": \"23420928-3171-44a7-8690-d54880dc5d2a\",\r\n"
	    		+ "            \"rowNumber\": 1,\r\n"
	    		+ "            \"note\": null,\r\n"
	    		+ "            \"Address\": {\r\n"
	    		+ "                \"id\": \"a74190cb-810c-4b07-92ba-eecebfc9795f\",\r\n"
	    		+ "                \"rowNumber\": 1,\r\n"
	    		+ "                \"note\": null,\r\n"
	    		+ "                \"AddressLine1\": {\r\n"
	    		+ "                    \"value\": \"1 De Villiers & Harrison St, 11-th Flr.\"\r\n"
	    		+ "                },\r\n"
	    		+ "                \"AddressLine2\": {},\r\n"
	    		+ "                \"City\": {\r\n"
	    		+ "                    \"value\": \"Johannesburg\"\r\n"
	    		+ "                },\r\n"
	    		+ "                \"PostalCode\": {},\r\n"
	    		+ "                \"State\": {},\r\n"
	    		+ "                \"custom\": {}\r\n"
	    		+ "            },\r\n"
	    		+ "            \"Email\": {\r\n"
	    		+ "                \"value\": \"jersey-equip@mail.con\"\r\n"
	    		+ "            },\r\n"
	    		+ "            \"Phone1\": {\r\n"
	    		+ "                \"value\": \"+1 (777) 283-0414\"\r\n"
	    		+ "            },\r\n"
	    		+ "            \"custom\": {}\r\n"
	    		+ "        },\r\n"
	    		+ "        \"custom\": {}\r\n"
	    		+ "    }]");
	}


	private String setAndGetExampleCustomer() throws UnsupportedEncodingException {
		String json = "{\r\n"
	    		+ "        \"id\": \"c01087ca-7281-e511-80c0-00155d012302\",\r\n"
	    		+ "        \"rowNumber\": 1,\r\n"
	    		+ "        \"note\": {\r\n"
	    		+ "            \"value\": \"\"\r\n"
	    		+ "        },\r\n"
	    		+ "        \"CustomerID\": {\r\n"
	    		+ "            \"value\": \"C000000003\"\r\n"
	    		+ "        },\r\n"
	    		+ "        \"CustomerOrder\": {\r\n"
	    		+ "            \"value\": \"SO180-009-01\"\r\n"
	    		+ "        },\r\n"
	    		+ "        \"Date\": {\r\n"
	    		+ "            \"value\": \"2015-10-28T00:00:00-04:00\"\r\n"
	    		+ "        },\r\n"
	    		+ "        \"Details\": [\r\n"
	    		+ "            {\r\n"
	    		+ "                \"id\": \"a7d978fb-7281-e511-80c0-00155d012302\",\r\n"
	    		+ "                \"rowNumber\": 1,\r\n"
	    		+ "                \"note\": {\r\n"
	    		+ "                    \"value\": \"\"\r\n"
	    		+ "                },\r\n"
	    		+ "                \"InventoryID\": {\r\n"
	    		+ "                    \"value\": \"AAMACHINE1\"\r\n"
	    		+ "                },\r\n"
	    		+ "                \"OrderQty\": {\r\n"
	    		+ "                    \"value\": 1.000000\r\n"
	    		+ "                },\r\n"
	    		+ "                \"UnitPrice\": {\r\n"
	    		+ "                    \"value\": 2200.000000\r\n"
	    		+ "                },\r\n"
	    		+ "                \"custom\": {}\r\n"
	    		+ "            }\r\n"
	    		+ "        ],\r\n"
	    		+ "        \"OrderedQty\": {\r\n"
	    		+ "            \"value\": 1.000000\r\n"
	    		+ "        },\r\n"
	    		+ "        \"OrderNbr\": {\r\n"
	    		+ "            \"value\": \"000001\"\r\n"
	    		+ "        },\r\n"
	    		+ "        \"OrderTotal\": {\r\n"
	    		+ "            \"value\": 2200.0000\r\n"
	    		+ "        },\r\n"
	    		+ "        \"OrderType\": {\r\n"
	    		+ "            \"value\": \"SO\"\r\n"
	    		+ "        },\r\n"
	    		+ "        \"Shipments\": [\r\n"
	    		+ "            {\r\n"
	    		+ "                \"id\": \"93a3e001-951c-4582-873e-b967f6d56b1e\",\r\n"
	    		+ "                \"rowNumber\": 1,\r\n"
	    		+ "                \"note\": null,\r\n"
	    		+ "                \"InvoiceNbr\": {},\r\n"
	    		+ "                \"ShipmentNbr\": {\r\n"
	    		+ "                    \"value\": \"000001\"\r\n"
	    		+ "                },\r\n"
	    		+ "                \"custom\": {}\r\n"
	    		+ "            }\r\n"
	    		+ "        ],\r\n"
	    		+ "        \"custom\": {}\r\n"
	    		+ "    }";
		when(expectedResponse.getEntity()).thenReturn(
		        new StringEntity(json));
		return json;
		
	}


	private StringEntity getMockFileResponse() throws UnsupportedEncodingException {
		return new StringEntity("{\r\n"
				+ "    \"id\": \"2acd2eed-1614-e511-9b82-c86000dddf0b\",\r\n"
				+ "    \"rowNumber\": 1,\r\n"
				+ "    \"note\": {\r\n"
				+ "        \"value\": \"\"\r\n"
				+ "    },\r\n"
				+ "    \"InventoryID\": {\r\n"
				+ "        \"value\": \"AAMACHINE1\"\r\n"
				+ "    },\r\n"
				+ "    \"custom\": {},\r\n"
				+ "    \"files\": [\r\n"
				+ "        {\r\n"
				+ "            \"id\": \"9be45eb7-f97d-400b-96a5-1c4cf82faa96\",\r\n"
				+ "            \"filename\": \"Stock Items (AAMACHINE1)\\\\T2MCRO.jpg\",\r\n"
				+ "            \"href\": \"/MyStoreInstance/entity/Default/20.200.001/files/9be45eb7-f97d-400b-96a5-1c4cf82faa96\"\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}");
	}


	@Test
	public void HttpCallTestWhenStatusCode202EntityNull() throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, BadStatusCodeException {
				  
		HttpGet requestGet = new HttpGet("http://localhost/example");
		helper(202);
	    when(httpClient.execute(ArgumentMatchers.any(HttpGet.class))).thenReturn(expectedResponse);
	    when(this.expectedResponse.getEntity()).thenReturn(null);
		Method httpcall = EntityApiPrivate.class.getDeclaredMethod("HttpCall", Client.class, HttpRequest.class, HeaderContentType.class);
	    httpcall.setAccessible(true);
		ApiResponse responseResult = (ApiResponse) httpcall.invoke(request, client, requestGet, HeaderContentType.Json);	
	    assertEquals(responseResult.getEntity(), null); 
	}
	
	@Test
	public void HttpCallTestWhenStatusCode200EntityIsNotNull() throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, BadStatusCodeException {
				  
		HttpGet requestGet = new HttpGet("http://localhost/example");
		helper(200);
	   
	    when(httpClient.execute(ArgumentMatchers.any(HttpGet.class))).thenReturn(expectedResponse);
	    String responseString = getMockJsonResponse();

		Method httpcall = EntityApiPrivate.class.getDeclaredMethod("HttpCall", Client.class, HttpRequest.class, HeaderContentType.class);
	    httpcall.setAccessible(true);
		ApiResponse actualResponse = (ApiResponse) httpcall.invoke(request, client, requestGet, HeaderContentType.Json);		    
	    assertEquals(actualResponse.getEntity(), expectedResponse.getEntity());
	    assertEquals(responseString, actualResponse.getResponseJson());
	}
	
	@Test
	public void TestBadStatusCodeExceptionWhen400Response() throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, BadStatusCodeException {
				  
		HttpGet requestGet = new HttpGet("http://localhost/example");
		helper(400);
	    when(httpClient.execute(ArgumentMatchers.any(HttpGet.class))).thenReturn(expectedResponse);
		
		Method httpcall = EntityApiPrivate.class.getDeclaredMethod("HttpCall", Client.class, HttpRequest.class, HeaderContentType.class);
	    httpcall.setAccessible(true);
	    
	    Throwable exception=null;
	    
	    try{
	    	httpcall.invoke(request, client, requestGet, HeaderContentType.Json);
	    }
	    catch(InvocationTargetException e)
	    {
	    	exception = e.getCause();
	    } 
	    assertEquals(clientAPI.BadStatusCodeException.class, exception.getClass());
	 
	}
	
	
	@Test
	public void TestGetListOfCustomersJsonResponse() throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, BadStatusCodeException {
		
		helper(200);
	    when(httpClient.execute(ArgumentMatchers.any(HttpGet.class))).thenReturn(expectedResponse);
	    when(expectedResponse.getEntity()).thenReturn(
		        new StringEntity("[{\"id\":\"fbf11cfb-e8e1-ec11-8702-28dfebb71e4c\",\"rowNumber\":1,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"<NEW>\"},\"CustomerName\":{\"value\":\"Johnny Smith\"},\"MainContact\":{\"id\":\"3fb50b9d-f5bd-41ef-a51e-6ca9bb8a5cc8\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"77f70719-ebb0-4bc1-a339-fc6b5b1427f8\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{},\"AddressLine2\":{},\"City\":{},\"PostalCode\":{},\"State\":{},\"custom\":{}},\"Email\":{},\"Phone1\":{},\"custom\":{}},\"custom\":{}},{\"id\":\"e43d3c1c-8765-e411-a267-e06995c86014\",\"rowNumber\":2,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000001\"},\"CustomerName\":{\"value\":\"Jersey Central Office Equip\"},\"MainContact\":{\"id\":\"c8cc089f-9743-41d5-bcb5-cfc3536381b3\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"abe0c93d-fba1-4492-a558-65a0132d3d67\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"1 De Villiers & Harrison St, 11-th Flr.\"},\"AddressLine2\":{},\"City\":{\"value\":\"Johannesburg\"},\"PostalCode\":{},\"State\":{},\"custom\":{}},\"Email\":{\"value\":\"jersey-equip@mail.con\"},\"Phone1\":{\"value\":\"+1 (777) 283-0414\"},\"custom\":{}},\"custom\":{}},{\"id\":\"f03d3c1c-8765-e411-a267-e06995c86014\",\"rowNumber\":3,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000002\"},\"CustomerName\":{\"value\":\"Microchip Restaurant\"},\"MainContact\":{\"id\":\"8a519cd6-733f-4ebd-8911-10f2fa921970\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"c97db0dc-8b15-4967-9b1e-eceb18392a80\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"1 Kalisa Way\"},\"AddressLine2\":{},\"City\":{\"value\":\"Paramus\"},\"PostalCode\":{},\"State\":{\"value\":\"NJ\"},\"custom\":{}},\"Email\":{},\"Phone1\":{\"value\":\"+1 (777) 459-4255\"},\"custom\":{}},\"custom\":{}},{\"id\":\"fc3d3c1c-8765-e411-a267-e06995c86014\",\"rowNumber\":4,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000003\"},\"CustomerName\":{\"value\":\"Jevy Computers\"},\"MainContact\":{\"id\":\"9b16076d-24ce-4b38-831e-159a6cd31ead\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"5da8eb27-0522-4a17-bba4-7efde840ec19\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"1000 Pennsylvania Ave\"},\"AddressLine2\":{},\"City\":{\"value\":\"San Francisco\"},\"PostalCode\":{\"value\":\"94107-3479\"},\"State\":{\"value\":\"CA\"},\"custom\":{}},\"Email\":{\"value\":\"info@jevy-comp.con\"},\"Phone1\":{\"value\":\"+1 (777) 380-0089\"},\"custom\":{}},\"custom\":{}},{\"id\":\"083e3c1c-8765-e411-a267-e06995c86014\",\"rowNumber\":5,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000004\"},\"CustomerName\":{\"value\":\"KRK Consulting Service\"},\"MainContact\":{\"id\":\"7e31734c-9ac5-4888-b209-08d7361ad76b\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"866dc29d-2c58-44d3-8782-f63fa7e8653a\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"1 Penn Plz\"},\"AddressLine2\":{},\"City\":{\"value\":\"New York\"},\"PostalCode\":{\"value\":\"10119\"},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"consulting@krk.con\"},\"Phone1\":{\"value\":\"+1 (777) 829-6988\"},\"custom\":{}},\"custom\":{}},{\"id\":\"143e3c1c-8765-e411-a267-e06995c86014\",\"rowNumber\":6,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000005\"},\"CustomerName\":{\"value\":\"Wright Corner\"},\"MainContact\":{\"id\":\"fd01aafb-5dcd-4758-8cbf-bdc3dc5bcb25\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"795582d1-13fe-4ed4-8d5f-1a1e0f6680b6\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"1 W 89TH St\"},\"AddressLine2\":{},\"City\":{\"value\":\"New York\"},\"PostalCode\":{\"value\":\"10024\"},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"mail@wright-corner.con\"},\"Phone1\":{\"value\":\"+1 (777) 513-9166\"},\"custom\":{}},\"custom\":{}},{\"id\":\"203e3c1c-8765-e411-a267-e06995c86014\",\"rowNumber\":7,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000006\"},\"CustomerName\":{\"value\":\"NETCAFE NY\"},\"MainContact\":{\"id\":\"c381520f-c5bc-4b08-9ff3-eb6ff3f9a9e2\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"faa5f31f-75ce-4ff8-8165-8ef5c6999ff1\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"1011 High Ridge Rd\"},\"AddressLine2\":{},\"City\":{\"value\":\"Stamford\"},\"PostalCode\":{},\"State\":{\"value\":\"CT\"},\"custom\":{}},\"Email\":{\"value\":\"ny@netvafe.con\"},\"Phone1\":{\"value\":\"+1 (777) 673-7392\"},\"custom\":{}},\"custom\":{}},{\"id\":\"2c3e3c1c-8765-e411-a267-e06995c86014\",\"rowNumber\":8,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000007\"},\"CustomerName\":{\"value\":\"Bestype Image\"},\"MainContact\":{\"id\":\"cd3f1d12-f059-4559-819b-e9a46eebd18b\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"f7415a8b-b9ae-4b79-9a93-e87f7aef3b72\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"105 Cecil St\"},\"AddressLine2\":{},\"City\":{\"value\":\"Singapore\"},\"PostalCode\":{},\"State\":{},\"custom\":{}},\"Email\":{},\"Phone1\":{\"value\":\"+1 (777) 966-6886\"},\"custom\":{}},\"custom\":{}},{\"id\":\"383e3c1c-8765-e411-a267-e06995c86014\",\"rowNumber\":9,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000008\"},\"CustomerName\":{\"value\":\"Digitech Printers\"},\"MainContact\":{\"id\":\"12ac2ab4-f107-457b-ad7f-2b15f4370844\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"a9403632-fcc5-4d79-856a-d5be587f1d31\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"11 Chiswick Park\"},\"AddressLine2\":{},\"City\":{\"value\":\"Cape town\"},\"PostalCode\":{},\"State\":{},\"custom\":{}},\"Email\":{\"value\":\"Printers@Digitech.con\"},\"Phone1\":{\"value\":\"+1 (777) 623-6150\"},\"custom\":{}},\"custom\":{}},{\"id\":\"443e3c1c-8765-e411-a267-e06995c86014\",\"rowNumber\":10,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000009\"},\"CustomerName\":{\"value\":\"Precision Photos\"},\"MainContact\":{\"id\":\"cf88f218-4d7b-4f23-9bd3-e83218968fcc\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"1931ea07-1cfb-49e6-ae55-36db674f591b\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"11 US Air Terminal Ste 1413\"},\"AddressLine2\":{},\"City\":{\"value\":\"Flushing\"},\"PostalCode\":{},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{},\"Phone1\":{\"value\":\"+1 (777) 302-2756\"},\"custom\":{}},\"custom\":{}},{\"id\":\"75fce62d-8765-e411-a267-e06995c86014\",\"rowNumber\":11,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000013\"},\"CustomerName\":{\"value\":\"WFAN Radio\"},\"MainContact\":{\"id\":\"b2ef2fd9-0688-4ef0-8dd3-83233e5b7f77\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"f09066ba-3437-4ac7-9442-bdc71a3a3ea1\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"1188-1210, Wellstock Street\"},\"AddressLine2\":{},\"City\":{\"value\":\"London\"},\"PostalCode\":{},\"State\":{},\"custom\":{}},\"Email\":{\"value\":\"info@wfan.con\"},\"Phone1\":{\"value\":\"+1 (777) 754-7690\"},\"custom\":{}},\"custom\":{}},{\"id\":\"a5fce62d-8765-e411-a267-e06995c86014\",\"rowNumber\":12,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000017\"},\"CustomerName\":{\"value\":\"New York Cares\"},\"MainContact\":{\"id\":\"dc070bbb-3049-4e0c-88f0-5b881d34437d\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"25bcbc0a-965f-42bc-8413-7dd5df8a987d\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"1201 Airport Fwy Ste 170\"},\"AddressLine2\":{},\"City\":{\"value\":\"Euless\"},\"PostalCode\":{},\"State\":{\"value\":\"TX\"},\"custom\":{}},\"Email\":{\"value\":\"help@ny-cares.con\"},\"Phone1\":{\"value\":\"+1 (777) 243-5004\"},\"custom\":{}},\"custom\":{}},{\"id\":\"dc18f53a-8765-e411-a267-e06995c86014\",\"rowNumber\":13,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000020\"},\"CustomerName\":{\"value\":\"Institute of Culinary Education, The\"},\"MainContact\":{\"id\":\"f53d4069-92ab-42dc-94ce-1f5798f4b1a4\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"a514dbf9-680d-4c82-9761-6667c3c2d89e\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"123 any street\"},\"AddressLine2\":{},\"City\":{\"value\":\"Any City\"},\"PostalCode\":{},\"State\":{\"value\":\"DC\"},\"custom\":{}},\"Email\":{\"value\":\"dean@culinary-education.con\"},\"Phone1\":{\"value\":\"+1 (777) 961-2433\"},\"custom\":{}},\"custom\":{}},{\"id\":\"0019f53a-8765-e411-a267-e06995c86014\",\"rowNumber\":14,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000023\"},\"CustomerName\":{\"value\":\"New York International Beauty School Ltd\"},\"MainContact\":{\"id\":\"92993b8f-ee33-48c6-a246-a2ebf7f38c75\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"ca45fc22-2008-4c06-bbea-28e364402083\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"12447, The Green\"},\"AddressLine2\":{},\"City\":{\"value\":\"Richmond\"},\"PostalCode\":{},\"State\":{},\"custom\":{}},\"Email\":{\"value\":\"Bart@megamail.con\"},\"Phone1\":{\"value\":\"+1 (777) 868-7171\"},\"custom\":{}},\"custom\":{}},{\"id\":\"0c19f53a-8765-e411-a267-e06995c86014\",\"rowNumber\":15,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000024\"},\"CustomerName\":{\"value\":\"Alphabetland School Center\"},\"MainContact\":{\"id\":\"5ab2992d-0dbc-46e6-bf11-fb6052f58c5e\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"1c6736a0-69a2-45a6-909d-977ed07af5cf\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"1255 Bay St\"},\"AddressLine2\":{},\"City\":{\"value\":\"Staten Island\"},\"PostalCode\":{\"value\":\"10305-3111\"},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"alph@sch.com\"},\"Phone1\":{\"value\":\"+1 (777) 826-9338\"},\"custom\":{}},\"custom\":{}},{\"id\":\"1819f53a-8765-e411-a267-e06995c86014\",\"rowNumber\":16,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000025\"},\"CustomerName\":{\"value\":\"Winston Personnel\"},\"MainContact\":{\"id\":\"32861669-9ad5-4bf8-8bb6-63b437690246\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"8e52229f-83fb-4a32-85ec-054da835e83b\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"12603 Kitsap Way\"},\"AddressLine2\":{},\"City\":{\"value\":\"Bremerton\"},\"PostalCode\":{},\"State\":{\"value\":\"WA\"},\"custom\":{}},\"Email\":{\"value\":\"info@winston.con\"},\"Phone1\":{\"value\":\"+1 (777) 554-5530\"},\"custom\":{}},\"custom\":{}},{\"id\":\"2419f53a-8765-e411-a267-e06995c86014\",\"rowNumber\":17,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000026\"},\"CustomerName\":{\"value\":\"Active Staffing Service\"},\"MainContact\":{\"id\":\"20e2d00f-e9e8-4f12-8534-b611ef783e09\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"1d0dc4d1-725c-45f2-8cb3-0468f96ae0b2\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"1300 Flushing Ave\"},\"AddressLine2\":{},\"City\":{\"value\":\"Brooklyn\"},\"PostalCode\":{\"value\":\"11237-2303\"},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"info@active-staffing.con\"},\"Phone1\":{\"value\":\"+1 (777) 244-6544\"},\"custom\":{}},\"custom\":{}},{\"id\":\"183a8749-8765-e411-a267-e06995c86014\",\"rowNumber\":18,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000027\"},\"CustomerName\":{\"value\":\"Personnel Express\"},\"MainContact\":{\"id\":\"70e66c2e-6797-45ef-a19b-4e74d5479fab\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"e83b79c6-d578-4b15-8e57-c0c79088d21d\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"1317 3RD Ave Ste 100\"},\"AddressLine2\":{},\"City\":{\"value\":\"New York\"},\"PostalCode\":{\"value\":\"10021\"},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"Pers-exp@mail.con\"},\"Phone1\":{\"value\":\"+1 (777) 818-9030\"},\"custom\":{}},\"custom\":{}},{\"id\":\"243a8749-8765-e411-a267-e06995c86014\",\"rowNumber\":19,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000028\"},\"CustomerName\":{\"value\":\"N R Westport LLC\"},\"MainContact\":{\"id\":\"5f640031-c335-4e04-9c59-15b0c3d82b64\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"dc90eb76-49cd-49d0-b647-164787e2e923\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"132 Tibbits Ave\"},\"AddressLine2\":{},\"City\":{\"value\":\"White Plains\"},\"PostalCode\":{},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"westport@usamail.con\"},\"Phone1\":{\"value\":\"+1 (777) 345-1352\"},\"custom\":{}},\"custom\":{}},{\"id\":\"543a8749-8765-e411-a267-e06995c86014\",\"rowNumber\":20,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000032\"},\"CustomerName\":{\"value\":\"NEP Personnel Unit\"},\"MainContact\":{\"id\":\"3dea3273-63d6-48d0-92ff-75ccd490889f\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"69925e91-37ab-448c-afc6-259c759073c2\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"1441 Broadway\"},\"AddressLine2\":{},\"City\":{\"value\":\"New York\"},\"PostalCode\":{\"value\":\"10018\"},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"nep@mail.con\"},\"Phone1\":{\"value\":\"+1 (777) 446-3073\"},\"custom\":{}},\"custom\":{}},{\"id\":\"783a8749-8765-e411-a267-e06995c86014\",\"rowNumber\":21,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000035\"},\"CustomerName\":{\"value\":\"Cocciatari Pizza\"},\"MainContact\":{\"id\":\"0d27ddb5-22fb-4b24-903b-2407be2acf1a\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"1bb7f988-0bd6-456a-b2b7-2e7685d19311\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"15213 SW Durham Road\"},\"AddressLine2\":{},\"City\":{\"value\":\"Tigerd\"},\"PostalCode\":{},\"State\":{\"value\":\"OR\"},\"custom\":{}},\"Email\":{\"value\":\"pizza@Cocciatari.con\"},\"Phone1\":{\"value\":\"+1 (777) 623-5001\"},\"custom\":{}},\"custom\":{}},{\"id\":\"843a8749-8765-e411-a267-e06995c86014\",\"rowNumber\":22,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000036\"},\"CustomerName\":{\"value\":\"Chocolate By Design Incorporated\"},\"MainContact\":{\"id\":\"46fab7aa-388f-4c18-8773-729b4247887c\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"7c1a6561-03d3-47c3-921e-5cf60ffa0cce\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"1542 55TH Ave\"},\"AddressLine2\":{},\"City\":{\"value\":\"New York\"},\"PostalCode\":{\"value\":\"11219\"},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"CBDI@mail.com\"},\"Phone1\":{\"value\":\"+1 (777) 737-0034\"},\"custom\":{}},\"custom\":{}},{\"id\":\"903a8749-8765-e411-a267-e06995c86014\",\"rowNumber\":23,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000037\"},\"CustomerName\":{\"value\":\"Marlin Office Beverage Service\"},\"MainContact\":{\"id\":\"11ceb3ef-7998-4fe9-a13f-18362b7ba554\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"f86d5feb-362a-49ec-9a59-04e06a28a40a\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"1551 Kittle Rd\"},\"AddressLine2\":{},\"City\":{\"value\":\"Chappaqua\"},\"PostalCode\":{},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"Marlin@googmail.con\"},\"Phone1\":{\"value\":\"+1 (212) 673-3166\"},\"custom\":{}},\"custom\":{}},{\"id\":\"9c3a8749-8765-e411-a267-e06995c86014\",\"rowNumber\":24,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000038\"},\"CustomerName\":{\"value\":\"Antun's of Westchester\"},\"MainContact\":{\"id\":\"6cc2da1c-3212-48e4-adc9-39c8311b9904\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"8141cd33-68b0-4907-ab88-d52852156a20\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"156-534 Broadway\"},\"AddressLine2\":{},\"City\":{\"value\":\"Fair Lawn\"},\"PostalCode\":{},\"State\":{\"value\":\"NJ\"},\"custom\":{}},\"Email\":{\"value\":\"Antun@megamail.con\"},\"Phone1\":{\"value\":\"+1 (777) 592-5260\"},\"custom\":{}},\"custom\":{}},{\"id\":\"a83a8749-8765-e411-a267-e06995c86014\",\"rowNumber\":25,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000039\"},\"CustomerName\":{\"value\":\"Crabtree Kittle House Inn\"},\"MainContact\":{\"id\":\"829b22cf-63ba-4198-8885-595568f00ca8\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"90f163a3-470e-4cfb-93c4-64d6f602a79f\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"1604 Broadway\"},\"AddressLine2\":{},\"City\":{\"value\":\"New York\"},\"PostalCode\":{\"value\":\"10019\"},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"Kittle@Crabtree.con\"},\"Phone1\":{\"value\":\"+1 (777) 666-8044\"},\"custom\":{}},\"custom\":{}},{\"id\":\"d83a8749-8765-e411-a267-e06995c86014\",\"rowNumber\":26,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000043\"},\"CustomerName\":{\"value\":\"Premiere Dermatology and Surgery\"},\"MainContact\":{\"id\":\"b83c85dc-2bd0-485a-a7f3-b30f418f5bb5\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"bb2a33ba-81ba-4f0c-8828-38e426b7ac60\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"17575 Newbridge Rd\"},\"AddressLine2\":{},\"City\":{\"value\":\"North Bellmore\"},\"PostalCode\":{},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{},\"Phone1\":{\"value\":\"+1 (777) 344-2450\"},\"custom\":{}},\"custom\":{}},{\"id\":\"e43a8749-8765-e411-a267-e06995c86014\",\"rowNumber\":27,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000044\"},\"CustomerName\":{\"value\":\"Rich Vision\"},\"MainContact\":{\"id\":\"2a679e07-0850-438a-8aca-d3c913a96dd0\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"e8b227ea-cb54-49f8-a326-651895dfeb4c\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"178-01 Hillside Ave Jamaica Estates\"},\"AddressLine2\":{},\"City\":{\"value\":\"Boston\"},\"PostalCode\":{},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"consulting@richvision.con\"},\"Phone1\":{\"value\":\"+1 (777) 325-3400\"},\"custom\":{}},\"custom\":{}},{\"id\":\"143b8749-8765-e411-a267-e06995c86014\",\"rowNumber\":28,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000048\"},\"CustomerName\":{\"value\":\"Safe Credit Union\"},\"MainContact\":{\"id\":\"e4b0c66c-6390-472b-b826-8357ab88a4b5\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"f870d0a8-7c93-4701-9a51-3e2061128cf5\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"19 W 45th St\"},\"AddressLine2\":{},\"City\":{\"value\":\"New york\"},\"PostalCode\":{\"value\":\"10036\"},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"info@safe-credit.con\"},\"Phone1\":{\"value\":\"+1 (777) 934-7533\"},\"custom\":{}},\"custom\":{}},{\"id\":\"383b8749-8765-e411-a267-e06995c86014\",\"rowNumber\":29,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000051\"},\"CustomerName\":{\"value\":\"Brass Key Bar\"},\"MainContact\":{\"id\":\"1af8ff9a-6741-4bcd-b0cf-cce9f34e51ae\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"6de57714-f286-4cab-a674-5cc6f0c06b9b\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"2030 Ave Of The Americas\"},\"AddressLine2\":{},\"City\":{\"value\":\"New York\"},\"PostalCode\":{},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"Livernois@brass-key.con\"},\"Phone1\":{\"value\":\"+1  (777) 898-0326\"},\"custom\":{}},\"custom\":{}},{\"id\":\"443b8749-8765-e411-a267-e06995c86014\",\"rowNumber\":30,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000052\"},\"CustomerName\":{\"value\":\"Streamray Incorporated\"},\"MainContact\":{\"id\":\"1a5e6222-a11a-4a92-88a3-ae590c309132\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"0c59ac17-df6c-4e92-af7e-cb852a0f1b9d\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"210 Canal St Ste 312\"},\"AddressLine2\":{},\"City\":{\"value\":\"New York\"},\"PostalCode\":{},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"mail@Streamray.con\"},\"Phone1\":{\"value\":\"+1 (777) 307-5243\"},\"custom\":{}},\"custom\":{}},{\"id\":\"503b8749-8765-e411-a267-e06995c86014\",\"rowNumber\":31,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000053\"},\"CustomerName\":{\"value\":\"Silver Springs Water\"},\"MainContact\":{\"id\":\"b2d8dea8-f356-4fed-826f-0af48e66610e\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"c15de9ee-9308-4114-8995-b57456c226a9\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"212W 23rd St\"},\"AddressLine2\":{},\"City\":{\"value\":\"New York\"},\"PostalCode\":{},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"silver-water@mail.con\"},\"Phone1\":{\"value\":\"+1 (702) 897-4854\"},\"custom\":{}},\"custom\":{}},{\"id\":\"5c3b8749-8765-e411-a267-e06995c86014\",\"rowNumber\":32,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000054\"},\"CustomerName\":{\"value\":\"Logical Information Solutions\"},\"MainContact\":{\"id\":\"4c6f0cc8-9a81-4351-821e-4182c39bc482\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"f6c36642-c317-4f38-bb0f-18cd0dbc4aae\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"21831 Queens Blvd Ste 610\"},\"AddressLine2\":{},\"City\":{\"value\":\"Flushing\"},\"PostalCode\":{},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"lis@usa-mail.con\"},\"Phone1\":{\"value\":\"+1 (777) 837-2455\"},\"custom\":{}},\"custom\":{}},{\"id\":\"8c3b8749-8765-e411-a267-e06995c86014\",\"rowNumber\":33,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000058\"},\"CustomerName\":{\"value\":\"Westin Galleria Houston\"},\"MainContact\":{\"id\":\"19286aa7-5264-45dd-a9d5-2b529d88c90d\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"cfb92c78-b91f-4bb8-a08f-0ab37cd73ca1\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"2234 East 14th Street\"},\"AddressLine2\":{},\"City\":{\"value\":\"New York\"},\"PostalCode\":{},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"Westin@texasmail.con\"},\"Phone1\":{\"value\":\"+1 (777) 839-5636\"},\"custom\":{}},\"custom\":{}},{\"id\":\"983b8749-8765-e411-a267-e06995c86014\",\"rowNumber\":34,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000059\"},\"CustomerName\":{\"value\":\"Boulder Couriers Denver\"},\"MainContact\":{\"id\":\"b3564c50-5afc-4775-8fee-0292f76cfe6e\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"aa650fcc-d270-4f52-a497-ff9ec2568c1e\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"2256 Avenue Of The Americas\"},\"AddressLine2\":{},\"City\":{\"value\":\"New York\"},\"PostalCode\":{},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"denver@b-couriers.com\"},\"Phone1\":{\"value\":\"+1 (777) 571-5719\"},\"custom\":{}},\"custom\":{}},{\"id\":\"c83b8749-8765-e411-a267-e06995c86014\",\"rowNumber\":35,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000063\"},\"CustomerName\":{\"value\":\"LaserWorks, The\"},\"MainContact\":{\"id\":\"174558aa-bc60-430d-adb0-1773ef2bd7fc\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"c3b26184-73a1-4915-ab43-dd7a552b8175\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"2335 Allgood Rd Ste 53\"},\"AddressLine2\":{},\"City\":{\"value\":\"Marietta\"},\"PostalCode\":{},\"State\":{\"value\":\"GA\"},\"custom\":{}},\"Email\":{\"value\":\"laserwork@canadamail.con\"},\"Phone1\":{\"value\":\"+1 (777) 421-1574\"},\"custom\":{}},\"custom\":{}},{\"id\":\"d43b8749-8765-e411-a267-e06995c86014\",\"rowNumber\":36,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000064\"},\"CustomerName\":{\"value\":\"Etelligent Solutions\"},\"MainContact\":{\"id\":\"e04a90aa-c07c-48f2-aacd-df4dca2a7aed\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"d92f08f1-1231-4367-a895-eef4bef14f07\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"234 W 429th St\"},\"AddressLine2\":{},\"City\":{\"value\":\"New York\"},\"PostalCode\":{},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"info@etelligent.con\"},\"Phone1\":{\"value\":\"+1 (777) 985-3853\"},\"custom\":{}},\"custom\":{}},{\"id\":\"e03b8749-8765-e411-a267-e06995c86014\",\"rowNumber\":37,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000065\"},\"CustomerName\":{\"value\":\"Data Recovery Services\"},\"MainContact\":{\"id\":\"b3ff153f-f767-4331-87fa-82d7f9a296cd\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"af771b3a-5524-4a44-ba74-df10d409cca3\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"23410 Ramp Way\"},\"AddressLine2\":{},\"City\":{\"value\":\"Sacramento\"},\"PostalCode\":{},\"State\":{\"value\":\"CA\"},\"custom\":{}},\"Email\":{\"value\":\"service@data-recovery.con\"},\"Phone1\":{\"value\":\"+44 (2211) 2470074\"},\"custom\":{}},\"custom\":{}},{\"id\":\"ec3b8749-8765-e411-a267-e06995c86014\",\"rowNumber\":38,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000066\"},\"CustomerName\":{\"value\":\"HD Technical Services Limited\"},\"MainContact\":{\"id\":\"852a3aca-d32e-4461-a1bc-3141c77cb283\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"6b656b47-e700-4dd5-a962-a75e1692e751\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"2342 S Macarthur Blvd\"},\"AddressLine2\":{},\"City\":{\"value\":\"Coppell\"},\"PostalCode\":{},\"State\":{\"value\":\"TX\"},\"custom\":{}},\"Email\":{\"value\":\"tech@hd-services.con\"},\"Phone1\":{\"value\":\"+44 (2211) 8620299\"},\"custom\":{}},\"custom\":{}},{\"id\":\"f83b8749-8765-e411-a267-e06995c86014\",\"rowNumber\":39,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000067\"},\"CustomerName\":{\"value\":\"Portmeirion Hotel Int.\"},\"MainContact\":{\"id\":\"54ec8e34-9848-4771-9603-f562926c9997\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"ef4b4cd2-47e8-4738-8660-b093e331617b\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"23441 Hampshire Gate,\"},\"AddressLine2\":{},\"City\":{\"value\":\"Oakville\"},\"PostalCode\":{},\"State\":{\"value\":\"ON\"},\"custom\":{}},\"Email\":{\"value\":\"inn@portmeirion.con\"},\"Phone1\":{\"value\":\"+44 (2211) 0272115\"},\"custom\":{}},\"custom\":{}},{\"id\":\"043c8749-8765-e411-a267-e06995c86014\",\"rowNumber\":40,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000068\"},\"CustomerName\":{\"value\":\"Mak System France\"},\"MainContact\":{\"id\":\"3bd1b026-e27f-40ec-bce9-c4f078dbaed4\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"f41ceddd-3a29-45ca-8494-d2f117bfa21d\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"23455 Pattullo\"},\"AddressLine2\":{},\"City\":{\"value\":\"Woodstock\"},\"PostalCode\":{},\"State\":{\"value\":\"ON\"},\"custom\":{}},\"Email\":{\"value\":\"mail@mak.system.con\"},\"Phone1\":{\"value\":\"+33 (777) 863-3454\"},\"custom\":{}},\"custom\":{}},{\"id\":\"103c8749-8765-e411-a267-e06995c86014\",\"rowNumber\":41,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000069\"},\"CustomerName\":{\"value\":\"Caribbean Secretary Online\"},\"MainContact\":{\"id\":\"4b4a4c47-347b-4063-8658-22e690db1840\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"41ba49bc-03d1-4d65-8f89-1e7d4773890a\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"23940 Hillside Ave\"},\"AddressLine2\":{},\"City\":{\"value\":\"Jamaica\"},\"PostalCode\":{},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"secretary@email.con\"},\"Phone1\":{\"value\":\"+33 (777) 05 76 87 7\"},\"custom\":{}},\"custom\":{}},{\"id\":\"1c3c8749-8765-e411-a267-e06995c86014\",\"rowNumber\":42,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000070\"},\"CustomerName\":{\"value\":\"Nautilus Bar SABL\"},\"MainContact\":{\"id\":\"c77eeaa1-2e7f-44c1-bcdf-e9d921ee5870\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"6bbed571-794a-47ea-bfea-9a2524bc50f1\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"247 W 37th St\"},\"AddressLine2\":{},\"City\":{\"value\":\"New York\"},\"PostalCode\":{},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"bar@Nautilus.con\"},\"Phone1\":{\"value\":\"+33 (777) 672-2505\"},\"custom\":{}},\"custom\":{}},{\"id\":\"283c8749-8765-e411-a267-e06995c86014\",\"rowNumber\":43,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000071\"},\"CustomerName\":{\"value\":\"ROTON IT-Service\"},\"MainContact\":{\"id\":\"1c0df8ee-72fe-4fe2-a701-03da1be2e4f7\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"5100cbc4-ca42-4e11-8820-790bc17a7d56\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"25 W 35th St\"},\"AddressLine2\":{},\"City\":{\"value\":\"New York\"},\"PostalCode\":{},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"roton@email.con\"},\"Phone1\":{\"value\":\"+ 49 (99111) 1450787\"},\"custom\":{}},\"custom\":{}},{\"id\":\"4c3c8749-8765-e411-a267-e06995c86014\",\"rowNumber\":44,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000074\"},\"CustomerName\":{\"value\":\"THE LEARNING CENTER OF TUSCANY\"},\"MainContact\":{\"id\":\"d01db412-14c6-4ab9-8648-ad85148d7d22\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"37d4c9f3-11f9-4e4f-828d-527548ccee01\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"26 West 44th St\"},\"AddressLine2\":{},\"City\":{\"value\":\"New York\"},\"PostalCode\":{},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"Tuscany@italymail.com\"},\"Phone1\":{\"value\":\"+39 (777) 0515035\"},\"custom\":{}},\"custom\":{}},{\"id\":\"583c8749-8765-e411-a267-e06995c86014\",\"rowNumber\":45,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000075\"},\"CustomerName\":{\"value\":\"MUSIC AREA\"},\"MainContact\":{\"id\":\"4c896eeb-f14b-4c65-8e7d-abe99d41b21b\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"23f1fd8d-494d-418e-9631-a2ec78b7bc11\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"265 Callan Ave Ste 142\"},\"AddressLine2\":{},\"City\":{\"value\":\"San Leandro\"},\"PostalCode\":{},\"State\":{\"value\":\"CA\"},\"custom\":{}},\"Email\":{\"value\":\"info@music-area.con\"},\"Phone1\":{\"value\":\"+39 (777) 0456756\"},\"custom\":{}},\"custom\":{}},{\"id\":\"643c8749-8765-e411-a267-e06995c86014\",\"rowNumber\":46,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000076\"},\"CustomerName\":{\"value\":\"CHENGDU RONGYI WATER PROCESSING\"},\"MainContact\":{\"id\":\"5aebc5e4-f3ea-42e0-85ec-092a5729b5dd\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"4e49c266-cf82-4778-ab9a-51f06f72dee5\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"266 W 47th St\"},\"AddressLine2\":{},\"City\":{\"value\":\"New York\"},\"PostalCode\":{},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"water-proc@chinamail.con\"},\"Phone1\":{\"value\":\"+86 (7777) 6546776\"},\"custom\":{}},\"custom\":{}},{\"id\":\"703c8749-8765-e411-a267-e06995c86014\",\"rowNumber\":47,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000077\"},\"CustomerName\":{\"value\":\"DA CITY CONSTRUCT SUPERVISE TEAM\"},\"MainContact\":{\"id\":\"c9f7c418-d36b-48c5-aa36-a41aaf175aba\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"8c4a77b0-ed8f-4d7b-b165-1f60343ee310\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"267 W. 77th Street 45th Floor\"},\"AddressLine2\":{},\"City\":{\"value\":\"New York\"},\"PostalCode\":{},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"mail@supervise-team.con\"},\"Phone1\":{\"value\":\"+86 (7777) 7677376\"},\"custom\":{}},\"custom\":{}},{\"id\":\"7c3c8749-8765-e411-a267-e06995c86014\",\"rowNumber\":48,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000078\"},\"CustomerName\":{\"value\":\"AMRO Bank N.V.\"},\"MainContact\":{\"id\":\"be9915f6-ab2a-4262-bb5a-6314b2573b60\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"97c23dcc-4c45-41c7-9b2b-c5504e7405c2\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"2734 Spring St.\"},\"AddressLine2\":{},\"City\":{\"value\":\"Elizabeth\"},\"PostalCode\":{},\"State\":{\"value\":\"NJ\"},\"custom\":{}},\"Email\":{\"value\":\"bank@amro.con\"},\"Phone1\":{\"value\":\"+81 (777) 443-4657\"},\"custom\":{}},\"custom\":{}},{\"id\":\"883c8749-8765-e411-a267-e06995c86014\",\"rowNumber\":49,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000079\"},\"CustomerName\":{\"value\":\"Asahi Sun Tours\"},\"MainContact\":{\"id\":\"117912d3-e7ef-498b-99de-847b428af877\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"c723d631-5d05-41cc-b96a-ce5d27af9cb9\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"293 Brighton 99th St\"},\"AddressLine2\":{},\"City\":{\"value\":\"Brooklyn\"},\"PostalCode\":{},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"Asahi@japan-mail.con\"},\"Phone1\":{\"value\":\"+81 (777) 434-4679\"},\"custom\":{}},\"custom\":{}},{\"id\":\"943c8749-8765-e411-a267-e06995c86014\",\"rowNumber\":50,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000080\"},\"CustomerName\":{\"value\":\"Ajigasawa Prince Hotel\"},\"MainContact\":{\"id\":\"fbc81484-6e11-4fdc-bce1-7efde67a6602\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"a1bbefcf-e710-4b9f-99bc-0020d735a1e4\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"29300 W Alabama St.\"},\"AddressLine2\":{},\"City\":{\"value\":\"Houston\"},\"PostalCode\":{},\"State\":{\"value\":\"TX\"},\"custom\":{}},\"Email\":{\"value\":\"mail@Ajigasawa.con\"},\"Phone1\":{\"value\":\"+81 (777) 434-4234\"},\"custom\":{}},\"custom\":{}},{\"id\":\"a03c8749-8765-e411-a267-e06995c86014\",\"rowNumber\":51,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000081\"},\"CustomerName\":{\"value\":\"Artcages Co.\"},\"MainContact\":{\"id\":\"eb493278-7503-4d97-92af-0d5e4c8b6882\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"c1c64f0f-1cad-469b-908d-7c4ba1ef7741\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"299 Nathaniel Place\"},\"AddressLine2\":{},\"City\":{\"value\":\"Englewood\"},\"PostalCode\":{},\"State\":{\"value\":\"NJ\"},\"custom\":{}},\"Email\":{},\"Phone1\":{\"value\":\"+1 (777) 252-6488\"},\"custom\":{}},\"custom\":{}},{\"id\":\"b83c8749-8765-e411-a267-e06995c86014\",\"rowNumber\":52,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000083\"},\"CustomerName\":{\"value\":\"Kamm System France\"},\"MainContact\":{\"id\":\"65fb8777-38de-4757-b394-0a9631135a5b\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"0e3504af-b46e-4a6f-b38b-86ecb838d8e5\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"300 Madison Avenue\"},\"AddressLine2\":{},\"City\":{},\"PostalCode\":{},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{},\"Phone1\":{\"value\":\"+33 (203) 863-3454\"},\"custom\":{}},\"custom\":{}},{\"id\":\"dc3c8749-8765-e411-a267-e06995c86014\",\"rowNumber\":53,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000086\"},\"CustomerName\":{\"value\":\"YY Studio\"},\"MainContact\":{\"id\":\"00e12e68-e31c-4ffd-b896-f9313677f6ab\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"71be5b55-9cc1-433f-8dce-613761e2a9b6\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"3245 Watchogue Rd\"},\"AddressLine2\":{},\"City\":{\"value\":\"San Francisco\"},\"PostalCode\":{},\"State\":{\"value\":\"CA\"},\"custom\":{}},\"Email\":{},\"Phone1\":{},\"custom\":{}},\"custom\":{}},{\"id\":\"e83c8749-8765-e411-a267-e06995c86014\",\"rowNumber\":54,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000087\"},\"CustomerName\":{\"value\":\"Westfield Co., Ltd\"},\"MainContact\":{\"id\":\"e059f145-5d32-40ba-a61b-3833cbedd13c\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"a4e3a3d3-442b-41b0-b331-9f6c76d34dea\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"325, Camden St,\"},\"AddressLine2\":{},\"City\":{\"value\":\"North Shields\"},\"PostalCode\":{},\"State\":{},\"custom\":{}},\"Email\":{},\"Phone1\":{},\"custom\":{}},\"custom\":{}},{\"id\":\"f43c8749-8765-e411-a267-e06995c86014\",\"rowNumber\":55,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000088\"},\"CustomerName\":{\"value\":\"BronzeKey Workshop\"},\"MainContact\":{\"id\":\"5d12bc9f-39af-4bb0-ba0d-e040c18efe7f\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"ff06f242-e5de-4723-8bfb-fb60e3533e67\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"3265 Cit� Flor�al De Briant\"},\"AddressLine2\":{},\"City\":{\"value\":\"Fort de France\"},\"PostalCode\":{},\"State\":{},\"custom\":{}},\"Email\":{},\"Phone1\":{},\"custom\":{}},\"custom\":{}},{\"id\":\"003d8749-8765-e411-a267-e06995c86014\",\"rowNumber\":56,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000089\"},\"CustomerName\":{\"value\":\"Glog Consulting\"},\"MainContact\":{\"id\":\"baf8dbc1-8162-47a1-88b8-9fbfd197a3ac\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"f4fdb9af-a89c-4dc2-9045-b3bc4fe4ede7\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"329 W 49th St\"},\"AddressLine2\":{},\"City\":{\"value\":\"San Francisco\"},\"PostalCode\":{},\"State\":{\"value\":\"CA\"},\"custom\":{}},\"Email\":{},\"Phone1\":{},\"custom\":{}},\"custom\":{}},{\"id\":\"0c3d8749-8765-e411-a267-e06995c86014\",\"rowNumber\":57,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000090\"},\"CustomerName\":{\"value\":\"Digipter Svc\"},\"MainContact\":{\"id\":\"b5e63858-e923-4960-a16b-daacf56d8d08\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"688ee5fb-6d91-4de1-841d-5b41291c6fa9\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"33457 Clark Dr\"},\"AddressLine2\":{},\"City\":{\"value\":\"Henderson\"},\"PostalCode\":{},\"State\":{\"value\":\"NV\"},\"custom\":{}},\"Email\":{},\"Phone1\":{},\"custom\":{}},\"custom\":{}},{\"id\":\"7514e371-8965-e411-a267-e06995c86014\",\"rowNumber\":58,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000091\"},\"CustomerName\":{\"value\":\"Cognitive Solutions Co\"},\"MainContact\":{\"id\":\"dab5cc54-0eec-4e54-bb63-c1f4d53173ec\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"9d99cc8c-d607-4544-b7ef-0b39769f25e3\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{},\"AddressLine2\":{},\"City\":{\"value\":\"San Francisco\"},\"PostalCode\":{},\"State\":{\"value\":\"CA\"},\"custom\":{}},\"Email\":{},\"Phone1\":{},\"custom\":{}},\"custom\":{}},{\"id\":\"46e00511-d1d0-ea11-b832-00155d408001\",\"rowNumber\":59,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000092\"},\"CustomerName\":{\"value\":\"Value Bartending\"},\"MainContact\":{\"id\":\"c094683c-f576-42b6-b1ae-809460328709\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"384ab2e4-6551-4f86-9b20-b16c26316af2\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"201 Lower Notch Rd\"},\"AddressLine2\":{},\"City\":{\"value\":\"Little Falls\"},\"PostalCode\":{\"value\":\"07424\"},\"State\":{\"value\":\"NJ\"},\"custom\":{}},\"Email\":{\"value\":\"barkeep@usabartend.con\"},\"Phone1\":{\"value\":\"+1 (908) 532-9522\"},\"custom\":{}},\"custom\":{}},{\"id\":\"335f013a-d5d0-ea11-b832-00155d408001\",\"rowNumber\":60,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000093\"},\"CustomerName\":{\"value\":\"ABC Holdings Inc\"},\"MainContact\":{\"id\":\"3ff3cb8c-4469-4fb0-9ccf-39d6efc9922e\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"a33352c2-0f67-4652-8066-9b4d15aa1e33\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"65 Broadway\"},\"AddressLine2\":{},\"City\":{\"value\":\"New York\"},\"PostalCode\":{\"value\":\"10006\"},\"State\":{\"value\":\"NY\"},\"custom\":{}},\"Email\":{\"value\":\"info@abcholdings.con\"},\"Phone1\":{\"value\":\"+1 (212) 532-9522\"},\"custom\":{}},\"custom\":{}},{\"id\":\"d3010f4a-d7d0-ea11-b832-00155d408001\",\"rowNumber\":61,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000094\"},\"CustomerName\":{\"value\":\"Nautilusscape\"},\"MainContact\":{\"id\":\"f3182b71-0c32-4054-bd64-e5124ca6607f\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"adbc57e8-5c12-49ab-8242-7823cef50bc9\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"13 Rue de la Batellerie\"},\"AddressLine2\":{},\"City\":{\"value\":\"Dunkerque\"},\"PostalCode\":{\"value\":\"59140\"},\"State\":{},\"custom\":{}},\"Email\":{\"value\":\"bar@Nautilus.con\"},\"Phone1\":{\"value\":\"+33 (777) 672-2505\"},\"custom\":{}},\"custom\":{}},{\"id\":\"6913f235-d8d0-ea11-b832-00155d408001\",\"rowNumber\":62,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000095\"},\"CustomerName\":{\"value\":\"Cash Venture\"},\"MainContact\":{\"id\":\"70dd0856-626e-4349-bee8-05476254ea10\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"868873da-e14c-4ed4-92fd-ede1d8c1c27f\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"8311 Jefferson Ave\"},\"AddressLine2\":{},\"City\":{\"value\":\"Detroit\"},\"PostalCode\":{\"value\":\"48214\"},\"State\":{\"value\":\"MI\"},\"custom\":{}},\"Email\":{\"value\":\"cash@cc.con\"},\"Phone1\":{\"value\":\"+1 (313) 393-7101\"},\"custom\":{}},\"custom\":{}},{\"id\":\"32a189a0-d9d0-ea11-b832-00155d408001\",\"rowNumber\":63,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"C000000096\"},\"CustomerName\":{\"value\":\"Compureconsult, Ltd\"},\"MainContact\":{\"id\":\"cf1e2e93-0026-437b-9582-ac65582a2f6f\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"11f1e963-c395-4621-876c-126a5dc38d8b\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{\"value\":\"2525 Hampshire Gate #2b\"},\"AddressLine2\":{},\"City\":{\"value\":\"Oakville\"},\"PostalCode\":{\"value\":\"L6H 6C8\"},\"State\":{\"value\":\"ON\"},\"custom\":{}},\"Email\":{\"value\":\"mail@Compuresource.con\"},\"Phone1\":{\"value\":\"+1 (777) 829-2664\"},\"custom\":{}},\"custom\":{}},{\"id\":\"7855bf81-0cec-ec11-8702-28dfebb71e4c\",\"rowNumber\":64,\"note\":{\"value\":\"\"},\"CustomerClass\":{\"value\":\"DEFAULT\"},\"CustomerID\":{\"value\":\"JOHNNYGOOD\"},\"CustomerName\":{\"value\":\"Johnny Good\"},\"MainContact\":{\"id\":\"736463dc-4d9f-4012-91b1-9695a78d2db1\",\"rowNumber\":1,\"note\":null,\"Address\":{\"id\":\"6c8c30c1-73d9-457b-afab-5c182935cae8\",\"rowNumber\":1,\"note\":null,\"AddressLine1\":{},\"AddressLine2\":{},\"City\":{},\"PostalCode\":{},\"State\":{},\"custom\":{}},\"Email\":{},\"Phone1\":{},\"custom\":{}},\"custom\":{}}]"
		        		));
		
		
	    Method httpcall = EntityApiPrivate.class.getDeclaredMethod("getListHttpCall", HashMap.class, HeaderContentType.class, Class.class);
	    httpcall.setAccessible(true);
		ApiResponse responseResult = (ApiResponse) httpcall.invoke(request, null, HeaderContentType.Json, Customer.class);
		
		assertEquals(EntityUtils.toString(expectedResponse.getEntity(), "UTF-8"), responseResult.getResponseJson());
	}
	@Test
	public void TestGetListOfCustomersDeserialization() throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, BadStatusCodeException {
		
		helper(200);
	    when(expectedResponse.getEntity()).thenReturn(
		        new StringEntity(get2CustomersJsonString()));
	    when(httpClient.execute(ArgumentMatchers.any(HttpGet.class))).thenReturn(expectedResponse);
		
	    Method httpcall = EntityApiPrivate.class.getDeclaredMethod("getListHttpCall", HashMap.class, HeaderContentType.class, Class.class);
	    httpcall.setAccessible(true);
		ApiResponse responseResult = (ApiResponse) httpcall.invoke(request, null, HeaderContentType.Json, Customer.class);
		List<Entity> customers = responseResult.getListofData();
		assertEquals(2, customers.size());
	}
	
	@Test
	public void TestGetCustomerByKey001JsonResponse() throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, BadStatusCodeException {
		
		helper(200);
		String responseString = getMockJsonResponse();
	    when(httpClient.execute(ArgumentMatchers.any(HttpGet.class))).thenReturn(expectedResponse);
		List<String> ID = new ArrayList<>();
	    ID.add("001");
	    Method httpcall = EntityApiPrivate.class.getDeclaredMethod("getByKeysHttpCall", List.class, HashMap.class, HeaderContentType.class, Class.class);
	    httpcall.setAccessible(true);
		ApiResponse responseResult = (ApiResponse) httpcall.invoke(request, ID, null, HeaderContentType.Json, Customer.class);    
		assertEquals(responseResult.getResponseJson(), responseString);
	}
	
	@Test
	public void TestGetCustomerByKey001Deserialization() throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, BadStatusCodeException {
		
		helper(200);
		setAndGetExampleCustomer();
	    when(httpClient.execute(ArgumentMatchers.any(HttpGet.class))).thenReturn(expectedResponse);
	    
		List<String> ID = new ArrayList<>();
	    ID.add("c01087ca-7281-e511-80c0-00155d012302");
	    
	    Method httpcall = EntityApiPrivate.class.getDeclaredMethod("getByKeysHttpCall", List.class, HashMap.class, HeaderContentType.class, Class.class);
	    httpcall.setAccessible(true);
		ApiResponse responseResult = (ApiResponse) httpcall.invoke(request, ID, null, HeaderContentType.Json, Customer.class);    
		Customer customer = (Customer) responseResult.getData();
		assertEquals("c01087ca-7281-e511-80c0-00155d012302", customer.getId().toString());
	    
	}
	

	@Test
	public void Test202StatusWhenSuccesfullRemovalOfEntityByKey() throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, BadStatusCodeException {
		helper(204);
	    when(httpClient.execute(ArgumentMatchers.any(HttpUriRequest.class))).thenReturn(this.expectedResponse);
	    Method httpcall = EntityApiPrivate.class.getDeclaredMethod("removeByKeysHttpCall", Entity.class, String.class, HeaderContentType.class);
	    httpcall.setAccessible(true);
		ApiResponse responseResult = (ApiResponse) httpcall.invoke(request, new Entity(), "example", HeaderContentType.Json);
	    assertEquals(responseResult.getStatusCode(), 204);
	}
	
	@Test
	public void createUpdateJsonStringTestWhenResponse200() throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, BadStatusCodeException {
		
		helper(200);
	    when(httpClient.execute(ArgumentMatchers.any(HttpPut.class))).thenReturn(this.expectedResponse);
	    String actualJson = setAndGetExampleCustomer();
	    Method httpcall = EntityApiPrivate.class.getDeclaredMethod("CreateOrUpdateHttpCall", Entity.class, HashMap.class, HeaderContentType.class);
	    httpcall.setAccessible(true);
		ApiResponse responseResult = (ApiResponse) httpcall.invoke(request, new Entity(), null, HeaderContentType.Json);
	    assertEquals(responseResult.getStatusCode(), 200);
	    assertEquals(responseResult.getResponseJson(), actualJson);
	}
	
	@Test
	public void attachFileTestWhen204ResponseCode() throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, BadStatusCodeException {
		
		helper(204);
	    when(httpClient.execute(ArgumentMatchers.any(HttpUriRequest.class))).thenReturn(this.expectedResponse);
	    Method httpcall = EntityApiPrivate.class.getDeclaredMethod("attachFileHttpCall", Entity.class, String.class, File.class, HashMap.class, HeaderContentType.class);
	    httpcall.setAccessible(true);
		ApiResponse responseResult = (ApiResponse) httpcall.invoke(request, new Entity(),"test", new File("test"),  null, HeaderContentType.Json);
	    assertEquals(responseResult.getStatusCode(), 204);
	}
	
	@Test
	public void retrieveFileLinkTestWhen200ResponseCode() throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, BadStatusCodeException {
		
		helper(200);
		when(expectedResponse.getEntity()).thenReturn(getMockFileResponse());
	    when(httpClient.execute(ArgumentMatchers.any(HttpUriRequest.class))).thenReturn(this.expectedResponse);
	    Method httpcall = EntityApiPrivate.class.getDeclaredMethod("retrieveFileLinkHttpCall", String.class, HashMap.class, HeaderContentType.class, String.class);
	    httpcall.setAccessible(true);
		ApiResponse responseResult = (ApiResponse) httpcall.invoke(request, "ID", null, HeaderContentType.Json, "path");
	    assertEquals(responseResult.getStatusCode(), 200);
	    assertEquals(responseResult.getFiles().size(), 1);
	}
	
	
	
	@Test
	//how to check? Is location a must? Yes it is a must
	public void TestInvokeWhen202AcceptedStatus() throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, BadStatusCodeException {
		
		helper(202);
		Header[] header = {
			    new BasicHeader("Location","/MyStoreInstance/entity/Default/20.200.001/SalesInvoice/ReleaseSalesInvoice/")
			   };
		
		when(this.expectedResponse.getAllHeaders()).thenReturn(header);
	    when(httpClient.execute(ArgumentMatchers.any(HttpUriRequest.class))).thenReturn(this.expectedResponse);
	    Method httpcall = EntityApiPrivate.class.getDeclaredMethod("invokeHttpCall", Entity.class, Action.class, HeaderContentType.class);
	    httpcall.setAccessible(true);
		ApiResponse responseResult = (ApiResponse) httpcall.invoke(request, new Entity(),new Action(), HeaderContentType.Json);
	    assertEquals(responseResult.getStatusCode(), 202);
	    assertEquals(responseResult.getLocation(), "/MyStoreInstance/entity/Default/20.200.001/SalesInvoice/ReleaseSalesInvoice/");
	}
	
	

}