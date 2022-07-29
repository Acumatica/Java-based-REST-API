package clientAPI;

import java.io.File;
import java.io.IOException;

import java.util.HashMap;
import java.util.List;


import model.Action;
import model.Entity;

 
public abstract class Request implements EntityInterface{

	
	private static Client client;
	private static EntityApiPrivate request;
	//private static CloseableHttpResponse HttpResponse;
	
	public Request() {}
	
	public static void Login(Client pClient) throws IOException {
		request = new EntityApiPrivate();
		client = pClient;
		request.LoginHtppCall(client);
	}
	

	public static void Logout() throws IOException {
		request.LogoutHttpCall();
	}
	public ApiResponse getList(HashMap<String, String> parameters, HeaderContentType type) throws IOException {
		return request.getListHttpCall(parameters, type, getTypeName());
	}
	
	public ApiResponse getList(HeaderContentType type) throws IOException {
		return request.getListHttpCall(null, type, getTypeName());
	}
	/*
	 * Returns a customer with the given ID
	 */
	public ApiResponse getByKeys(List<String> ID, HashMap<String, String> parameters, HeaderContentType type){
		return request.getByKeysHttpCall(ID, parameters, type, getTypeName());
	}
	public ApiResponse getByKeys(List<String> ID, HeaderContentType type){
		return request.getByKeysHttpCall(ID, null, type, getTypeName());
	}
	/*
	 * Updates a customer indicated by the mail and replaces the values with the given body input
	 */
	public static ApiResponse CreateOrUpdate(Entity entity, HashMap<String, String> parameters, HeaderContentType type) {
		return request.CreateOrUpdateHttpCall(entity, parameters, type);		
	}
	public static ApiResponse CreateOrUpdate(Entity entity, HeaderContentType type) {
		return request.CreateOrUpdateHttpCall(entity, null, type);	
	}
	public static ApiResponse removeByKeys(Entity entity, String ID, HeaderContentType type) {
		return request.removeByKeysHttpCall(entity, ID, type);
	}
	
	public ApiResponse retrieveFile(String ID, HashMap<String, String> parameters, HeaderContentType type) {
		return request.retrieveFileLinkHttpCall(ID, parameters, type, getTypeName().getSimpleName());
	}
	public ApiResponse retrieveFile(String ID, HeaderContentType type) {
		return request.retrieveFileLinkHttpCall(ID, null, type, getTypeName().getSimpleName());
	}
	public static ApiResponse attachFile(Entity entity, String endpointID, File file, HashMap<String, String> parameters, HeaderContentType type) {
		return request.attachFileHttpCall(entity, endpointID, file, parameters, type);
	}
	public static ApiResponse attachFile(Entity entity, String endpointID, File file, HeaderContentType type) {
		return request.attachFileHttpCall(entity, endpointID, file, null, type);
	}
	
	public static ApiResponse invoke(Entity entity, Action action, HeaderContentType type) {
		return request.invokeHttpCall(entity, action, type);
	}


	/*
	 * monitorURL should be the url of the invoke. Returns the status code
	 * checks the status and displays it to the screen when it is ready. 
	 */
	public static ApiResponse monitorStatus (ApiResponse status, HeaderContentType type) {
		return request.monitorStatusHttpCall(status, type);
	}


	

	

	
	


	
}
	
	