package example;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.content.FileBody;

import api.CustomerApi;
import api.SalesOrderApi;
import api.StockItemApi;
import clientAPI.ApiResponse;
import clientAPI.Client;
import clientAPI.HeaderContentType;
import clientAPI.Request;
import model.BooleanValue;
import model.Customer;
import model.Entity;
import model.ReleaseSalesInvoice;
import model.SalesInvoice;
import model.StockItem;
import model.StringValue;

public class ExampleApi {
	private static Client client= new Client("admin", "123");
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IOException {
		Request.Login(client);
		
		
		/*
		 * Get Customer by Customer Key
		 */ 
		CustomerApi customer= new CustomerApi();
		HashMap<String, String> getKeyParam = new HashMap<String, String>();
		getKeyParam.put("$expand", "MainContact,MainContact/Address");
		getKeyParam.put("$select", "CustomerID,CustomerName,CustomerClass,MainContact/Email,MainContact/Phone1,MainContact/Address/AddressLine1,MainContact/Address/AddressLine2,MainContact/Address/City,MainContact/Address/State,MainContact/Address/PostalCode");
		List<String> ID = new ArrayList<>();	
	    ID.add("C000000096");
		ApiResponse response1= customer.getByKeys(ID, getKeyParam, HeaderContentType.Json);
		Customer customer5 = (Customer) response1.getData();
		System.out.println(customer5);
		
		/*
		 *  Get list of Customers
		 */
		HashMap<String, String> getCustomerParam = new HashMap<String, String>();
		getCustomerParam.put("$expand", "MainContact,MainContact/Address");
		getCustomerParam.put("$select", "CustomerID,CustomerName,CustomerClass,MainContact/Email,MainContact/Phone1,MainContact/Address/AddressLine1,MainContact/Address/AddressLine2,MainContact/Address/City,MainContact/Address/State,MainContact/Address/PostalCode");
		ApiResponse response2=new CustomerApi().getList(getCustomerParam, HeaderContentType.Json);
		//List<Entity> customers = response2.getListofData();
		//System.out.println(cus);
		
		Customer customer2 = new Customer();
	    customer2.setCustomerClass(new StringValue().value("INTL"));
	    customer2.setBillingAddressOverride(new BooleanValue().value(true));
	    HashMap<String, String> updateParam = new HashMap<String, String>();
		updateParam.put("$filter", "MainContact/Email eq info@jevy-comp.con");
		updateParam.put("$expand", "MainContact,BillingContact");
		updateParam.put("$select", "CustomerID,CustomerClass,BillingContact/Email");
		//Request.CreateOrUpdate(customer2, updateParam, HeaderContentType.Json);
		
	    /*
		 * Get Sales Order by Key Field
		 */
		HashMap<String, String> SOParam = new HashMap<String, String>();
		SOParam.put("$expand", "Details");
		List<String> SOKeys= new ArrayList<String>();
		SOKeys.add("SO");
		SOKeys.add("000011");
		ApiResponse response3= new SalesOrderApi().getByKeys(SOKeys, SOParam, HeaderContentType.Json);		
		//System.out.println(response3.getStatusLine());
		/*
	     * retrieve file
	     */
	    HashMap<String, String> paramFile = new HashMap<String, String>();
		paramFile.put("$select", "InventoryID,files");
		paramFile.put("$expand", "files");
	    ApiResponse response4 = new StockItemApi().retrieveFile("AAMACHINE1", paramFile, HeaderContentType.Json);
	    System.out.println(response4.getFiles());
	    /*
		 * Attaches a file to a record
		 * Both Java and Postman gives error: File cannot be null
		 */
		//Creating a File object
		File file = new File("C:\\Users\\alara.ozkutucu\\Desktop\\text.txt");
		//Creating the FileBody object
		FileBody filebody = new FileBody(file, ContentType.DEFAULT_BINARY);


		ApiResponse response5 = Request.attachFile(new StockItem(),"CONGRILL", file, HeaderContentType.OctetStream);
		System.out.println(response5.getResponseJson());
		
		/* 
		 * Triggering an action. Update the request on hold from true to false. Then invoke the invoice. Then monitor the response
		 */			
		//creating a sales invoice
		SalesInvoice invoice = new SalesInvoice();
		invoice.setType(new StringValue().value("Invoice"));
		invoice.setReferenceNbr(new StringValue().value("INV000065"));
		invoice.setHold(new BooleanValue().value(false));
		Request.CreateOrUpdate(invoice, HeaderContentType.Json);
		
		//triggering the action of releasing the invoice
		ReleaseSalesInvoice release = new ReleaseSalesInvoice();
		release.setEntity(invoice);
		//ApiResponse response = Request.invoke(invoice, release, HeaderContentType.Json);
		
		//monitoring the status
		//Request.monitorStatus(response, HeaderContentType.Json);
		
		Request.Logout();
	}


}
