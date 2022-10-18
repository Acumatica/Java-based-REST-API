package example;

import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.format.DateTimeFormatter;

import api.SalesOrderApi;
import api.StockItemApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.http.entity.ContentType;

import clientAPI.BadStatusCodeException;
import clientAPI.Client;
import clientAPI.HeaderContentType;
import clientAPI.Request;
import model.Bill;
import model.BillDetail;
import model.BillTaxDetail;
import model.BooleanValue;
import model.DateTimeValue;
import model.DecimalValue;
import model.InventoryIssue;
import model.InventoryIssueDetail;
import model.InventoryIssueDetailAllocation;
import model.InventoryQuantityAvailable;
import model.ItemWarehouse;
import model.PurchaseOrder;
import model.PurchaseOrderDetail;
import model.PurchaseOrderTaxDetail;
import model.SalesOrder;
import model.SalesOrderDetail;
import model.Shipment;
import model.ShipmentDetail;
import model.ShipmentDetailAllocation;
import model.StockItem;
import model.StringValue;
import model.TaxDetail;

public class ExampleApiVersion22_100_001 {
	
private static Client client= new Client("admin", "123", "22R193", "Company");
static HashMap<String, String> parameters = new HashMap<String, String>();
	
	public static void main(String[] args) throws IOException {
		try {
			client.setBranch("PRODWHOLE");
			Request.Login(client);
		
		/*
		 * the following request creates a shipment for the ABARTENDE customer
		 */
		Shipment shipment = new Shipment();
		
		parameters.put("$expand", "Details/Allocations,Packages,Packages/PackageContents");		
		shipment.setBaseCurrencyID(new StringValue().value("USD"));
		shipment.setCustomerID(new StringValue().value("ABARTENDE"));
		ShipmentDetail detail = new ShipmentDetail();
		ShipmentDetailAllocation item = new ShipmentDetailAllocation();
		item.inventoryID(new StringValue().value("AACOMPUT01"));
		item.qty(new DecimalValue().value(2.00));
		item.orderNbr(new StringValue().value("SO006778"));
		detail.addAllocationsItem(item);
		List<ShipmentDetail> listofshipment = new ArrayList<>();
		listofshipment.add(detail);
		shipment.details(listofshipment);
		//Getting error both in postman and here (500 internal)
		//Request.CreateOrUpdate(item, parameters, HeaderContentType.Json);
		
		/*
		 *  an inventory issue can be created and updated with REST API requests
		 *  the following request creates an inventory issue for the AAMACHINE1 and AACOMPUT01
		 *  Note: to repeat the example, created issue has to be deleted
		 */
		InventoryIssue inv = new InventoryIssue();	
		inv.controlAmount(new DecimalValue().value(60800.00));
		inv.controlQty(new DecimalValue().value(3.00));
		List<InventoryIssueDetail> invList = new ArrayList<>();
		
		InventoryIssueDetailAllocation allocationItem1 = new InventoryIssueDetailAllocation();
		allocationItem1.inventoryID(new StringValue().value("AAMACHINE1"));
		allocationItem1.lotSerialNbr(new StringValue().value("SRF000009"));
		allocationItem1.qty(new DecimalValue().value(1.00));
		allocationItem1.UOM(new StringValue().value("EA"));
		
		InventoryIssueDetailAllocation allocationItem2 = new InventoryIssueDetailAllocation();
		allocationItem2.inventoryID(new StringValue().value("AAMACHINE1"));
		allocationItem2.lotSerialNbr(new StringValue().value("SRF000010"));
		allocationItem2.qty(new DecimalValue().value(1.00));
		allocationItem2.UOM(new StringValue().value("EA"));
		
		InventoryIssueDetail invDetails1 = new InventoryIssueDetail();
		invDetails1.branch(new StringValue().value("PRODWHOLE"));
		
		inv.postPeriod(new StringValue().value("052022"));
		
		invDetails1.addAllocationsItem(allocationItem2);
		invDetails1.addAllocationsItem(allocationItem1);
		invDetails1.setInventoryID(new StringValue().value("AAMACHINE1"));

		invList.add(invDetails1);
		inv.details(invList);
		parameters.clear();
		parameters.put("$expand", "Details,Details/Allocations");		
		//Request.CreateOrUpdate(inv, parameters, HeaderContentType.Json);
		
		
		/*
		 * Creation of a Return Order
		 */
		SalesOrder SO = new SalesOrder();
		SO.customerID(new StringValue().value("AACUSTOMER"));
		List<SalesOrderDetail> listdetails = new ArrayList<SalesOrderDetail>();
		SalesOrderDetail det1= new SalesOrderDetail();
		det1.invoiceType(new StringValue().value("Invoice"));
		det1.invoiceNbr(new StringValue().value("AR010707"));
		det1.orderQty(new DecimalValue().value(10.0));
		det1.inventoryID(new StringValue().value("AACOMPUT01"));
		listdetails.add(det1);
		SO.details(listdetails);
		SO.locationID(new StringValue().value("MAIN"));
		SO.orderType(new StringValue().value("RC"));
		//Request.CreateOrUpdate(SO, HeaderContentType.Json);
		
		/*
		 * Creation of a Credit Memo
		 */
		
		
		
		/*
		 * Retrieval of the Available Quantity of an Inventory Item
		 * the following request retrieves the quantity of the AACOMPUT01 items
		 */
		InventoryQuantityAvailable invAv = new InventoryQuantityAvailable();
		invAv.inventoryID(new StringValue().value("AALEGO500")); 
		//error in parsin OffsetDateTime class Cannot cast Newtonsoft.Json.Linq.JObject to Newtonsoft.Json.Linq.JToken."]}}
        //OffsetDateTime offsetDT = OffsetDateTime.of(2016, 7, 16, 20, 15, 45, 345875000, ZoneOffset.of("+07:00"));
		//System.out.println(offsetDT.toString());
		//invAv.lastModifiedDateTime(new DateTimeValue().value(offsetDT));
		parameters.clear();
		parameters.put("$expand", "Results");	
		//Request.CreateOrUpdate(invAv, parameters, HeaderContentType.Json);
		
		/*
		 * Specification of Tax Details in Purchase Orders
		 */
		PurchaseOrder pOrder = new PurchaseOrder();
		pOrder.vendorID(new StringValue().value("AAVENDOR"));
		List<PurchaseOrderDetail> pOrderDet = new ArrayList<PurchaseOrderDetail>();
		PurchaseOrderDetail detail1 = new PurchaseOrderDetail();
		detail1.branchID(new StringValue().value("PRODWHOLE"));
		detail1.inventoryID(new StringValue().value("AACOMPUT01"));
		detail1.orderQty(new DecimalValue().value(1.00));
		detail1.taxCategory(new StringValue().value("TAXABLE"));
		pOrderDet.add(detail1);
		pOrder.details(pOrderDet);
		pOrder.isTaxValid(new BooleanValue().value(true));
		pOrder.vendorID(new StringValue().value("AAVENDOR"));
		pOrder.vendorTaxZone(new StringValue().value("CANADABC"));
		List<PurchaseOrderTaxDetail> taxList = new ArrayList<PurchaseOrderTaxDetail>();
		PurchaseOrderTaxDetail pOrderTax = new PurchaseOrderTaxDetail();
		pOrderTax.taxableAmount(new DecimalValue().value(1000.00));
		pOrderTax.taxID(new StringValue().value("CABCPST"));
		taxList.add(pOrderTax);
		pOrder.taxDetails(taxList);
		parameters.clear();
		parameters.put("$expand", "Details,TaxDetails");	
		//Request.CreateOrUpdate(pOrder, parameters, HeaderContentType.Json);
		
		/*
		 * Overriding of Values in the Item Warehouse Detail
		 */
		ItemWarehouse itemWH = new ItemWarehouse();	
		itemWH.inventoryID(new StringValue().value("AACOMPUT01"));
		itemWH.warehouseID(new StringValue().value("WHOLESALE"));
		itemWH.overrideInventoryAccountSubaccount(new BooleanValue().value(true));
		itemWH.overrideMaxQty(new BooleanValue().value(true));
		itemWH.overridePrice(new BooleanValue().value(false));
		itemWH.overrideProductManager(new BooleanValue().value(false));
		//Request.CreateOrUpdate(itemWH, HeaderContentType.Json);
		
		/*
		 * Multiple Conditions for the Same Field in a Filter
		 */
		parameters.clear();
		parameters.put("$filter", "OrderNbr eq 'SO006768' or OrderNbr eq 'SO006757' or OrderNbr eq 'SO003733'\r\n");	
		//new SalesOrderApi().getList(parameters, HeaderContentType.Json);
		
		
		/*
		 *  Retrieval of All Localized Values of Multi-Language Fields
		 */
		parameters.clear();
		parameters.put("$expand", "Translations");	
		//new StockItemApi().getList(parameters, HeaderContentType.Json);
		
		/*
		 * Update of Tax Details During Bill Creation or Update
		 */
		Bill bill = new Bill();
		bill.vendor(new StringValue().value("AASERVICES"));
		bill.vendorRef(new StringValue().value("001"));		
		List<BillTaxDetail> taxdetails = new ArrayList<BillTaxDetail>();
		BillTaxDetail t1 = new BillTaxDetail();
		t1.taxID(new StringValue().value("CAGST"));
		t1.taxAmount(new DecimalValue().value(150.0));
		taxdetails.add(t1);
		bill.taxDetails(taxdetails);
		parameters.clear();
		parameters.put("$expand", "TaxDetails");	
		//Request.CreateOrUpdate(bill, parameters, HeaderContentType.Json);
		
		
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			Request.Logout();
		}
	}
		
}

