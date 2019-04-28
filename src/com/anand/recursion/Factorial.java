package com.anand.recursion;

public class Factorial {
	public static void main(String args[]) {
		System.out.println(findFatcorial(2));
	}

	public static int findFatcorial(int n) {
		return factorial(1, n);
	}

	public static int factorial(int accumalator, int n) {
		if (n == 1)
			return accumalator;
		return factorial(accumalator * n, n - 1);
	}
}
