package com.anand.recursion;

public class HooreMain {
	public static void main(String srs[]) {
		int arra[] = { 4, 8, 2, -1, 9, 10 };
		HooresAlgorithm ha = new HooresAlgorithm(arra);
		System.out.println(ha.select(3));
	}
}
