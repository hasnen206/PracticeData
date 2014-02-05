package brokeragecalc;

import java.util.ArrayList;

import ordermgmt.OrderManagment;
import pojo.Broker;
import pojo.Order;

public class BrokerageCalc {
OrderManagment managment=new OrderManagment();
	
	ArrayList<Broker> brokersList=new ArrayList<Broker>();
	
	public void getbrokerList(){
	brokersList.addAll(managment.getBrokerList());
	
	}
public double getBrokerageAmount(int broker_id){
	double amount=0;
	
	for(Broker broker:brokersList){
		double brokerage=broker.getBrokerage();
		System.out.println("hello");
		brokerage=brokerage/10000;
		if(broker.getBrokerId()==broker_id){
			broker.setCurrentPosition(managment.getCurrentPosition(broker_id));
			amount=broker.getCurrentPosition();
			amount=amount*brokerage;
		}
	}
	return amount;
}
}
