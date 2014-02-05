package hotelthread;

public class Waiter extends Thread{

	String itemlist[]={"Pizza","Dosa","Burger"};
	FoodItem item=null;
	public Waiter(FoodItem item)
	{
		this.item=item;
	}
	
	int length=itemlist.length;
	
	@Override
	public void run() {
		for(int i=0;i<itemlist.length;i++)
		{
			try {
				item.serve(itemlist[i]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
