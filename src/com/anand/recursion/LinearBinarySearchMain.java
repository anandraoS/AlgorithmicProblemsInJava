package com.anand.recursion;

public class LinearBinarySearchMain {
	public static void main(String rs[]) {
		int array[] = { 1, 3, 5, 6, 8 };
		LinearBinarySearch lbs = new LinearBinarySearch(array);
		System.out.println(lbs.bs(5));
	}
}
