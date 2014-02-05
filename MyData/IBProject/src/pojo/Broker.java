package pojo;

import java.io.Serializable;

import ordermgmt.CurrentPosition;
import ordermgmt.OrderManagment;

public class Broker{
public int BrokerId;
public String brokerName;
public double brokerage;

public Broker(int brokerId, String brokerName, double brokerage) {
	
	BrokerId = brokerId;
	this.brokerName = brokerName;
	this.brokerage = brokerage;
	
}
public Broker() {
	// TODO Auto-generated constructor stub
}
public int getBrokerId() {
	return BrokerId;
}
public void setBrokerId(int brokerId) {
	BrokerId = brokerId;
}
public String getBrokerName() {
	return brokerName;
}
public void setBrokerName(String brokerName) {
	this.brokerName = brokerName;
}
public double getBrokerage() {
	return brokerage;
}
public void setBrokerage(double brokerage) {
	this.brokerage = brokerage;
}
@Override
public String toString() {
	return "Broker [BrokerId=" + BrokerId + ", brokerName=" + brokerName
			+ ", brokerage=" + brokerage + "]";
}

}