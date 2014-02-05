package hotelthread;

public class FoodItem {
	private String itemName;
	boolean isServe=false;
	
	public synchronized String eat(String i)throws InterruptedException
	{
		if(!isServe)
			wait();
		
		System.out.println("\t\tItem Eaten " + i);
		isServe=false;
		notify();
		return itemName;
	}
	
	public synchronized void serve(String i) throws InterruptedException
	{
		if(isServe)
			
			wait();
		isServe=true;
		System.out.println("Item Served" + i);
		notify();
	}
}
