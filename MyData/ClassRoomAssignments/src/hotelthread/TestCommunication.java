package hotelthread;

public class TestCommunication {

	
	public static void main(String[] args) {
		FoodItem item=new FoodItem();
		Waiter w=new Waiter(item);
		Eater e=new Eater(item);
		
		w.start();
		e.start();
		
		

	}

}
