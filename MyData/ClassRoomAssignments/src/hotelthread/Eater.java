package hotelthread;

public class Eater extends Thread{
	FoodItem item;
	Waiter w=new Waiter(item);
	public Eater(FoodItem item) {
		this.item=item;
	}
	
	@Override
	public void run() {
		for(int i=0;i<w.length;i++)
		{
			try {
				item.eat(w.itemlist[i]);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
