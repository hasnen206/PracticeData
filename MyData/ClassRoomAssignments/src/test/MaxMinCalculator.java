package test;

public class MaxMinCalculator {

	public static MaxMin getMaxMin(int[] array) {
		int largest = array[0];
		int smallest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
			if (array[i] < smallest) {
				smallest = array[i];
			}
		}
		MaxMin mobj = new MaxMin(largest, smallest);
		mobj.max = largest;
		mobj.min = smallest;
		return mobj;
	}

}
