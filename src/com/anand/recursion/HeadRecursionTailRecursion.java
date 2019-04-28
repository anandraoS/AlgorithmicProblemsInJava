package com.anand.recursion;

public class HeadRecursionTailRecursion {
	public static void headRecursion(int n) {
		if (n == 0)
			return;
		headRecursion(n - 1);
		System.out.println(n);
	}

	public static void tailRecursion(int n) {
		if (n == 0)
			return;
		System.out.println(n);
		tailRecursion(n - 1);
	}

	public static void main(String args[]) {
		headRecursion(7);
		tailRecursion(6);
	}
}
