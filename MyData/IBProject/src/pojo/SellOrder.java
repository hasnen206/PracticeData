package pojo;

public class SellOrder {
	private int brokerId;
	private String secName;
	private double rate;
	private long quantity;
	private String direction;
	
	public SellOrder() {
		// TODO Auto-generated constructor stub
	}

	public SellOrder(int brokerId, String secName, double rate, long quantity,String direction) {
		
		this.brokerId = brokerId;
		this.secName = secName;
		this.rate = rate;
		this.quantity = quantity;
		this.direction=direction;
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

	public void setDirection(String direction) {
		this.direction = direction;
	}

	@Override
	public String toString() {
		return "SellOrder [brokerId=" + brokerId + ", secName=" + secName
				+ ", rate=" + rate + ", quantity=" + quantity + ", direction="
				+ direction + "]";
	}
	
	
}
