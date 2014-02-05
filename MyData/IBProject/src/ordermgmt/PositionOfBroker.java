package ordermgmt;

import java.util.ArrayList;

import pojo.OldBuyOrder;
import pojo.OldSellOrder;

public class PositionOfBroker {

	public double getPayablePosition(){
		double total=0;
		OldRecords records=new OldRecords();
		ArrayList<OldBuyOrder> buyOrders=new ArrayList<OldBuyOrder>();
		//ArrayList<OldSellOrder> sellOrders=new ArrayList<OldSellOrder>();
		buyOrders=records.getOldBuyOrders();
		//sellOrders=records.getOldSellOrders();
		for(OldBuyOrder buyOrder:buyOrders){
				if(buyOrder.getDirection().equals("BUY")){
					total=buyOrder.getQuantity()*buyOrder.getRate();
				}
			}
		return total;
	}
	
	public double getReceivablePosition(){
		double total=0;
		OldRecords records=new OldRecords();
		ArrayList<OldSellOrder> sellOrders=new ArrayList<OldSellOrder>();
		sellOrders=records.getOldSellOrders();
		for(OldSellOrder sellOrder:sellOrders){
				if(sellOrder.getDirection().equals("SELL")){
					total=sellOrder.getQuantity()*sellOrder.getRate();
				}
			}
		return total;
	}
	
	
	
}
