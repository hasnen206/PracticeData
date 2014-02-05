package test;

import brokeragecalc.BrokerageCalc;
import ordermgmt.CurrentPosition;
import ordermgmt.OrderManagment;
import pojo.Broker;
import pojo.BuyOrder;
import pojo.Order;
import pojo.Security;
import pojo.SellOrder;

public class Tester {

	
	public static void main(String[] args) {
		OrderManagment managment=new OrderManagment();
		BrokerageCalc brokerageCalc=new BrokerageCalc();
		CurrentPosition currentPosition=new CurrentPosition();
		//Broker broker=new Broker(1,10);
		//Broker broker1=new Broker(2,10);
		BuyOrder buyOrder=new BuyOrder(1,"m",10,300,"BUY");
		//BuyOrder buyOrder1=new BuyOrder(1,"m",10,100,"BUY");
		SellOrder sellOrder=new SellOrder(2,"m",10,200,"SELL");
		//SellOrder sellOrder1=new SellOrder(2,"m",10,100,"BUY");
		BuyOrder buyOrder2=new BuyOrder(1,"c",10,100,"BUY");
		SellOrder sellOrder2=new SellOrder(2,"c",10,200,"SELL");
		managment.addBuyOrder(buyOrder);
		//managment.addBuyOrder(buyOrder1);
		managment.addSellOrder(sellOrder);
		//managment.addSellOrder(sellOrder1);
		managment.addBuyOrder(buyOrder2);
		managment.addSellOrder(sellOrder2);
		currentPosition.calcPostCurrentPosition();
		System.out.println(buyOrder);
		//System.out.println(buyOrder1);
		System.out.println(sellOrder);
		//System.out.println(sellOrder1);
		System.out.println(buyOrder2);
		System.out.println(sellOrder2);
		String securityName="m";
		System.out.println(currentPosition.getNetPosition(securityName));
		String securityName1="c";
		System.out.println(currentPosition.getNetPosition(securityName1));
	}

}
