package threadrunnable;

public class Employee implements Runnable {

	@Override
	public void run() {
		Project pro=new Project();
		
		if(Thread.currentThread().getName().equals("hasnen"))
		{
			pro.task1();
		}
		
		if(Thread.currentThread().getName().equals("onkar"))
		{
			pro.task2();
		}
		
		if(Thread.currentThread().getName().equals("raj"))
		{
			pro.task3();
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("--------Start-------");
		Employee emp=new Employee();
		Thread t1=new Thread(emp,"hasnen");
		Thread t2=new Thread(emp,"onkar");
		Thread t3=new Thread(emp,"raj");
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-----ended------");
	}

}
