package com.anand.recursion;

public class TowersOfHanoi {
	public static void main(String sr[]) {
		solveHanoi(3, 'A', 'B', 'C');
	}

	public static void solveHanoi(int n, char fromRod, char auxilaryRod, char rodTo) {
		if (n == 1) {
			System.out.println("Plate 1 from " + fromRod + " to " + rodTo);
		}
		solveHanoi(n - 1, fromRod, rodTo, auxilaryRod);
		System.out.println("Plate " + n + " from " + fromRod + " to " + rodTo);
		solveHanoi(n - 1, auxilaryRod, fromRod, rodTo);
	}
}
