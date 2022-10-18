package api;

import clientAPI.Request;
import model.InventoryIssue;

public class InventoryIssueApi extends Request{

	@Override
	public Class getTypeName() {
		// TODO Auto-generated method stub
		return InventoryIssue.class;
	}
	
}