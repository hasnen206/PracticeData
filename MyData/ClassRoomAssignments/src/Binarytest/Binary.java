package Binarytest;

import java.util.Scanner;

public class Binary {
	public static int Search(int a[], int k) {
		int low = 0, high =a.length;
		int mid = 0;
		if (low > high)
			return -1;
		while (low < high) {
			mid = (low + high) / 2;
			if (k > a[mid]) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		if ((low == high) && (k == a[low])) {
			return low;
		} else
			return -1;
	}

}