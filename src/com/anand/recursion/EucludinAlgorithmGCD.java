package com.anand.recursion;

public class EucludinAlgorithmGCD {

	public static void main(String[] args) {
		System.out.println(gcdIterative(26, 13));
		System.out.println(gcdRecursive(13, 39));
	}

	public static int gcdIterative(int n1, int n2) {
		while (n2 != 0) {
			int temp = n2;
			n2 = n1 % n2;
			n1 = temp;
		}
		return n1;
	}

	public static int gcdRecursive(int n1, int n2) {
		if (n2 == 0)
			return n1;
		return gcdRecursive(n2, n1 % n2);
	}

}
