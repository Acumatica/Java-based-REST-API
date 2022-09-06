package clientAPI;

import java.io.UnsupportedEncodingException;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public class Client extends Request{

	private CloseableHttpClient httpClient;
	private String path;
	//Version is by default the latest version
	private String version = "Default/22.200.001/";
	private String username;
	private String password;
	private String tenant;
	private String branch;
	private BasicCookieStore cookieStore;
		
	
	public Client(String pUsername, String pPassword, String siteName, String tenant) {
		this.username=pUsername;
		this.password=pPassword;
		this.tenant = tenant;
		this.path = "http://localhost/" +siteName+"/entity/";
		cookieStore = new BasicCookieStore(); 
		httpClient = HttpClientBuilder.create().setDefaultCookieStore(cookieStore).build();
	}
	
	public Client(String pUsername, String pPassword, String siteName, String tenant, String version) {
		this.username=pUsername;
		this.password=pPassword;
		this.tenant = tenant;
		this.path = "http://localhost/" +siteName+"/entity/";
		this.version = version;
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
	

	

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getTenant() {
		return tenant;
	}

	public void setTenant(String tenant) {
		this.tenant = tenant;
	}
	
	@Override
	public Class getTypeName() {
		// TODO Auto-generated method stub
		return this.getClass();
	}
	
	
}
