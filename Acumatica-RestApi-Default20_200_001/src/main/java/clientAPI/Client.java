package clientAPI;

import java.io.UnsupportedEncodingException;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public class Client extends Request{

	private CloseableHttpClient httpClient;
	private String path = "http://localhost/MyStoreInstance/entity/";
	private String version = "Default/20.200.001/";
	private String username;
	private String password;
	private BasicCookieStore cookieStore;
	
	public Client(String pUsername, String pPassword) {
		this.username=pUsername;
		this.password=pPassword;
		cookieStore = new BasicCookieStore(); 
		httpClient = HttpClientBuilder.create().setDefaultCookieStore(cookieStore).build();
	}
	public CloseableHttpClient getHttpClient() {
		return httpClient;
	}
	
	public void setHttpClient(CloseableHttpClient pHttpClient) {
		this.httpClient= pHttpClient;
	}
	public String getPath() {
		return path;
	}
	public String getVersion() {
		return version;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public BasicCookieStore getCookieStore() {
		return cookieStore;
	}
	

	@Override
	public Class getTypeName() {
		// TODO Auto-generated method stub
		return this.getClass();
	}
	
	
	
	
}
