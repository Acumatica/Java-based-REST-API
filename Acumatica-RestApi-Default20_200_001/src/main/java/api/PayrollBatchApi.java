package api;

import clientAPI.Request;
import model.PayrollBatch;

public class PayrollBatchApi extends Request{

	@Override
	public Class getTypeName() {
		// TODO Auto-generated method stub
		return PayrollBatch.class;
	}
	
}