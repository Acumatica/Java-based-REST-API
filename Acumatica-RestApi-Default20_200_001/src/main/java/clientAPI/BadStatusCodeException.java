package clientAPI;

public class BadStatusCodeException extends Exception{
	public BadStatusCodeException(String errorMessage) {
		super(errorMessage);
	}

}
