package threaddemo;

public class Employee extends Thread {

	@Override
	public void run() {
		
		Project pro=new Project();
		Project1 pro1=new Project1();
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
		if(Thread.currentThread().getName().equals("hero"))
		{
			pro1.task4();
		}
		
	}
	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.setName("hasnen");
		emp1.setPriority(MAX_PRIORITY);
		Employee emp2=new Employee();
		emp2.setName("onkar");
		
		Employee emp3=new Employee();
		emp3.setName("raj");
		
		Employee emp4=new Employee();
		emp4.setName("hero");
		emp1.start();
		emp2.start();
		emp3.start();
		emp4.start();
	}

}
