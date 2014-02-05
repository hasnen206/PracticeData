package ordermgmt;

import java.util.ArrayList;

import pojo.Broker;
import pojo.BuyOrder;
import pojo.Order;
import pojo.Security;
import pojo.SellOrder;

public class CurrentPosition {
	OrderManagment managment=new OrderManagment();
	
	 static ArrayList<Broker> brokerlist=null;
	 static ArrayList<Security> securitylist=null;
	 static ArrayList<BuyOrder> buyorderlist=null;
	 static ArrayList<SellOrder> sellorderlist=null;
	
	 public void calcPostCurrentPosition(){
		 
		brokerlist=managment.getBrokerList();
		securitylist=managment.getSecurityList();
		buyorderlist=managment.getBuyOrderList();
		/*for(BuyOrder buyOrder:buyorderlist){
			System.out.println(buyOrder);
		}*/
		sellorderlist=managment.getSellOrderList();
		
			for(BuyOrder buyOrder:buyorderlist){
				for(SellOrder sellOrder:sellorderlist){
				if(buyOrder.getSecName().equals(sellOrder.getSecName())){
					//System.out.println("hello1");
					if(buyOrder.getBrokerId()!=sellOrder.getBrokerId()){
						//System.out.println("hello2");
						if(buyOrder.getDirection().equals("BUY")&& sellOrder.getDirection().equals("SELL")){
							//System.out.println("hello3");
							long buyQuantity=0;
							long sellQuantity=0;
							long quantity=0;
							if(buyOrder.getDirection().equals("BUY")){
								buyQuantity=buyOrder.getQuantity();
								//System.out.println("hello4");
							}
							if(sellOrder.getDirection().equals("SELL")){
								sellQuantity=sellOrder.getQuantity();
								//System.out.println("hello5");
							}
							if(sellQuantity>buyQuantity && sellQuantity!=0 && buyQuantity!=0){
								//System.out.println("hello6");
								
								sellQuantity=sellQuantity-buyQuantity;
								buyQuantity=buyQuantity-buyQuantity;
								if(buyOrder.getDirection().equals("BUY")){
									buyOrder.setQuantity(buyQuantity);
								}
								if(sellOrder.getDirection().equals("SELL")){
									sellOrder.setQuantity(sellQuantity);
								}
							}
							else if(sellQuantity<buyQuantity && sellQuantity!=0 && buyQuantity!=0){
								//System.out.println("hello7");
								buyQuantity=buyQuantity-sellQuantity;
								sellQuantity=sellQuantity-sellQuantity;
								if(buyOrder.getDirection().equals("BUY")){
									buyOrder.setQuantity(buyQuantity);
								}
								if(sellOrder.getDirection().equals("SELL")){
									sellOrder.setQuantity(sellQuantity);
								}
							
						}
							else if(sellQuantity==buyQuantity){
								//System.out.println("hello8");
								//System.out.println(sellQuantity+" "+ buyQuantity);
								quantity=buyQuantity-sellQuantity;
								sellQuantity=quantity;
								buyQuantity=quantity;
								if(buyOrder.getDirection().equals("BUY")){
									buyOrder.setQuantity(buyQuantity);
								}
								if(sellOrder.getDirection().equals("SELL")){
									sellOrder.setQuantity(sellQuantity);
								}
							
						}
					}
				}
			}
			
		}
	}
		
	 }
public double getNetPosition(String securityName){
	double netPosition=0;
	for(BuyOrder buyOrder:buyorderlist){
		for(SellOrder sellOrder:sellorderlist){
			if(buyOrder.getSecName().equals(securityName) && sellOrder.getSecName().equals(securityName)){
				//System.out.println("hello1");
			  if(buyOrder.getDirection().equals("BUY")){
				  //System.out.println("hello2");
				  netPosition-=buyOrder.getQuantity();
			  }
			  if(sellOrder.getDirection().equals("SELL")){
				  //System.out.println(netPosition);
				 // System.out.println("hello3");
				  netPosition+=sellOrder.getQuantity();
			  }
		  }
	  }
	
   }
	return netPosition;
 }

public double getPostCurrentPosition(int brokerId){
	double buyTotal=0;
	double sellTotal=0;
	double total=0;
	for(BuyOrder buyOrder:buyorderlist){
		for(SellOrder sellOrder:sellorderlist){
			if(buyOrder.getBrokerId()==brokerId && sellOrder.getBrokerId()==brokerId){
				if(buyOrder.getDirection().equals("BUY")){
					buyTotal=buyTotal-(buyOrder.getQuantity()*buyOrder.getRate());
				}
				else if(sellOrder.getDirection().equals("SELL")){
					sellTotal=sellTotal+(sellOrder.getQuantity()*sellOrder.getRate());
				}
			}
		}
	}
	return total=buyTotal+sellTotal;
}

public ArrayList<BuyOrder> getBuyOrderList(){
	return buyorderlist;
}
public ArrayList<SellOrder> getSellOrderList(){
	return sellorderlist;
}
}
