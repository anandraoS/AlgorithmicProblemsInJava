package com.anand.recursion;

public class LinearBinarySearch {
	static int array[];

	public LinearBinarySearch(int array[]) {
		this.array = array;
	}

	public int linearSearch(int item) {
		for (int i = 0; i < array.length; i++)
			if (array[i] == item)
				return i;
		return -1;
	}

	public int bs(int item) {
		return binarySearch(0, array.length, item);
	}

	public static int binarySearch(int l, int r, int item) {
		if (l > r)
			return -1;
		int mid = l + (r - l) / 2;
		if (item == array[mid])
			return mid;
		if (item < array[mid])
			return binarySearch(l, mid - 1, item);
		else
			return binarySearch(mid + 1, r, item);
	}
}
