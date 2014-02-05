package threadrunnable;

public class Project {

	
	public void task1()
	{
		for(int i=0;i<50;i++)
		{
		System.out.println("Task1 "+ i );
		if(i==300)
		{
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}
	
	public void task2()
	{
		for(int i=0;i<50;i++)
		{
		System.out.println("Task2 "+ i );
		}
	}
	
	public void task3()
	{
		for(int i=0;i<50;i++)
		{
		System.out.println("Task3 "+ i );
		}
	}
}
