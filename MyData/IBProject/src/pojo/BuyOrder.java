package pojo;

public class BuyOrder {
	private int brokerId;
private String secName;
private double rate;
private long quantity;
private String direction;

public BuyOrder(int brokerId, String secName, double rate, long quantity,String direction) {
	this.brokerId = brokerId;
	this.secName = secName;
	this.rate = rate;
	this.quantity = quantity;
	this.direction=direction;
}
public BuyOrder() {
	// TODO Auto-generated constructor stub
}
public int getBrokerId() {
	return brokerId;
}
public void setBrokerId(int brokerId) {
	this.brokerId = brokerId;
}
public String getSecName() {
	return secName;
}
public void setSecName(String secName) {
	this.secName = secName;
}
public double getRate() {
	return rate;
}
public void setRate(double rate) {
	this.rate = rate;
}
public long getQuantity() {
	return quantity;
}
public void setQuantity(long quantity) {
	this.quantity = quantity;
}
public String getDirection() {
	return direction;
}
@Override
public String toString() {
	return "BuyOrder [brokerId=" + brokerId + ", secName=" + secName
			+ ", rate=" + rate + ", quantity=" + quantity + ", direction="
			+ direction + "]";
}




}
