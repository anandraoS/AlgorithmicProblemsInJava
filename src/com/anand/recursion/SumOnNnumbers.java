package com.anand.recursion;

public class SumOnNnumbers {
	public static void main(String args[]) {
		System.out.println(sumIteratvie(5));
		System.out.println(sumRecusrion(8));
	}

	public static int sumIteratvie(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++)
			result += i;
		return result;
	}

	public static int sumRecusrion(int N) {
		if (N == 1)
			return 1;
		return N + sumRecusrion(N - 1);
	}
}
