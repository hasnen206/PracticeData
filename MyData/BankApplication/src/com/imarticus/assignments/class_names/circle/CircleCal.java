package com.imarticus.assignments.class_names.circle;

public class CircleCal {
	int radius;
	static final float pi=3.14f;
	public float cirlceArea(MyCircle value)
	{
		this.radius=value.radius;
		float area=radius*radius*pi;
		return area;
	}
	public float cirlcePerimeter(MyCircle value)
	{
		this.radius=value.radius;
		float perimeter=2*(radius*pi);
		return perimeter;
	}
}
