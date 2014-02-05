package test;

public class MaxMin {
	public int max;
	public int min;
	public MaxMin(int max,int min)
	{
		this.max=max;
		this.min=min;
	}
	
	public String toString()
	{
		return "Max:"+ max+"Min:"+min;
	}
	public boolean equals(Object obj)
	{
		MaxMin maxMin=(MaxMin)obj;
		if(maxMin.max==this.max && maxMin.min==this.min)
		
			return true;
		
		else
			return false;
	}
}