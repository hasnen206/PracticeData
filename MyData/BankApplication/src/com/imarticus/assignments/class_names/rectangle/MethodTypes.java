package com.imarticus.assignments.class_names.rectangle;

public class MethodTypes {
	
	int length;
	int breadth;
	public float  calculateArea(MethodTypes value)
	{
		this.length=value.length;
		this.breadth=value.length;
		float area=length*breadth;
		calculatePerimeter();
		return area;
	}
	public float calculatePerimeter()
	{
		
		float perimeter=2*(length+breadth);
		return perimeter;
	}

}
