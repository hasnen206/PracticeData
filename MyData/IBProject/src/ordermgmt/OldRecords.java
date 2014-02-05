package ordermgmt;

import java.util.ArrayList;
import java.util.List;

import pojo.OldBuyOrder;
import pojo.OldSellOrder;

public class OldRecords {

	static ArrayList<OldBuyOrder> oldBuyOrders=new ArrayList<OldBuyOrder>();
	static ArrayList<OldSellOrder> oldSellOrders=new ArrayList<OldSellOrder>();
	
	public void addOldBuyOrder(OldBuyOrder buyOrder){
		oldBuyOrders.add(buyOrder);
	}
	public void addOldSellOrder(OldSellOrder sellOrder){
		oldSellOrders.add(sellOrder);
	}
	
	public ArrayList<OldBuyOrder> getOldBuyOrders(){
		return oldBuyOrders;
	}
	
	public ArrayList<OldSellOrder> getOldSellOrders(){
		return oldSellOrders;
	}
}
