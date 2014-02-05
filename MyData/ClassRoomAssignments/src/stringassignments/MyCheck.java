package stringassignments;

import java.util.ArrayList;

public class MyCheck {
	ArrayList list=new ArrayList();
	
	public MyCheck(ArrayList list) {
		this.list=list;
	}
	
	public boolean equals(Object obj)
	{	MyCheck myValue=(MyCheck)obj;
		
		return this.list == myValue.list;
	}
	
	
}
