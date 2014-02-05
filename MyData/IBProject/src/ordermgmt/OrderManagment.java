package ordermgmt;

import java.util.ArrayList;

import pojo.Broker;
import pojo.BuyOrder;
import pojo.Security;
import pojo.SellOrder;

public class OrderManagment {
	
	static ArrayList<BuyOrder> buyorderList=new ArrayList<BuyOrder>();
	static ArrayList<SellOrder> sellorderList=new ArrayList<SellOrder>();
	static ArrayList<Security> securityList=new ArrayList<Security>();
	static ArrayList<Broker> brokersList=new ArrayList<Broker>();
	
	public void addBuyOrder(BuyOrder buyOrder){
		buyorderList.add(buyOrder);
		
	}
	
	public void addSellOrder(SellOrder sellOrder){
		sellorderList.add(sellOrder);
	}
	
	public void addSecurity(Security security){
		securityList.add(security);
	}
	
	public void addBroker(Broker broker){
		brokersList.add(broker);
	}
	
	public void displayOrderList(int brokerId){
		for(BuyOrder buyOrder:buyorderList){
			for(SellOrder sellOrder:sellorderList){
				if(buyOrder.getBrokerId()==brokerId && sellOrder.getBrokerId()==brokerId){
					System.out.println(sellOrder);
					System.out.println(buyOrder);
				}
			}
		}
	}
	/*public double getNetPosition(){
		double netPosition=0;
		for(Security security:securityList){
			for(Order order:orderList){
				if(security.getSecName().equals(order.getSecName())){
					if(order.getDirection().equals("BUY")){
						security.setNetPosition(security.getNetPosition()-order.getQuantity());
						netPosition=security.getNetPosition();
					
					}
					else if(order.getDirection().equals("SELL")){
						security.setNetPosition(security.getNetPosition()+order.getQuantity());
						netPosition=security.getNetPosition();
					}
				}
			}
		}
		return netPosition;
	}
	
	public double getCurrentPosition(int broker_id){
		double buyTotal=0;
		double sellTotal=0;
		double total=0;
		for(Order order:orderList){
			for(Broker broker:brokersList){
				if(broker.getBrokerId()==broker_id && order.getBrokerId()==broker_id){
					if(order.getDirection().equals("BUY")){
						buyTotal+=order.getQuantity()*order.getRate();
						
					}
					else if(order.getDirection().equals("SELL")){
						sellTotal+=order.getQuantity()*order.getRate();
					}
				}
				//break;
			}
		}
		for(Broker broker:brokersList){
			if(broker.getBrokerId()==broker_id){
				total=buyTotal+sellTotal;
				broker.setCurrentPosition(total);
			}
		}
		return total;
	}
	*/
	/*public double getBrokerageAmount(int broker_id){
		double amount=0;
		
		for(Broker broker:brokersList){
			double brokerage=broker.getBrokerage();
			
			brokerage=brokerage/10000;
			if(broker.getBrokerId()==broker_id){
				broker.setCurrentPosition(getCurrentPosition(broker_id));
				amount=broker.getCurrentPosition();
				amount=amount*brokerage;
			}
		}
		return amount;
	}*/
	
	public ArrayList<Broker> getBrokerList(){
		return brokersList;
	}
	public ArrayList<Security> getSecurityList(){
		return securityList;
	}
	public ArrayList<BuyOrder> getBuyOrderList(){
		return buyorderList;
	}
	public ArrayList<SellOrder> getSellOrderList(){
		return sellorderList;
	}
	public ArrayList<Broker> getBrokers(){
		return brokersList;
	}

}
