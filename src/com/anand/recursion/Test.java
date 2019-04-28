package com.anand.recursion;

import java.util.Scanner;

public class Test {
	public static void main(String srs[]) {
		Scanner s = new Scanner(System.in);
		int testCase = s.nextInt();
		for (int k = 0; k < testCase; k++) {
			int n = s.nextInt();
			int arr[][] = new int[n][n];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					arr[i][j] = s.nextInt();
			System.out.println(getResult(arr, n));
		}
	}

	public static String getResult(int arr[][], int n) {
		String result = "YES";
		int tr[][] = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				tr[i][j] = arr[j][i];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j && arr[i][j] != 0) {
					result = "NO";
				} else {
					if (arr[i][j] != tr[i][j])
						result = "NO";
				}
			}
		}
		return result;
	}
}
