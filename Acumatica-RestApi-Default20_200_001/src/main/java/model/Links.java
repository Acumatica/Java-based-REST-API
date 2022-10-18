package model;

import org.apache.http.entity.StringEntity;

import com.google.gson.annotations.SerializedName;

public class Links {
	
	@SerializedName("self")
	private StringEntity self;
	
	@SerializedName("files:put")
	private StringEntity files;
	
	/**
	 * Get self
	 * @return self
	**/
	public StringEntity getSelf() {
		return this.self;
	}
	
	public void setSelf(StringEntity self) {
		this.self = self;
	}
	
	/**
	 * Get files:put
	 * @return files:put
	**/
	public StringEntity getFiles() {
		return this.files;
	}
	
	public void setFiles(StringEntity file) {
		this.files = file;
	}
	


}
