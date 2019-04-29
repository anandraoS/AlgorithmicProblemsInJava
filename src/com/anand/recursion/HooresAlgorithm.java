package com.anand.recursion;

import java.util.Random;

public class HooresAlgorithm {
	static int arrray[];

	public HooresAlgorithm(int arra[]) {
		this.arrray = arra;
	}

	public int select(int k) {
		return selection(0, arrray.length - 1, k - 1);
	}

	private int selection(int indexFirst, int indexLast, int k) {
		int pivot = partition(indexFirst, indexLast);
		if (pivot > k)
			return selection(indexFirst, pivot - 1, k);
		else if (pivot < k)
			return selection(pivot + 1, indexLast, k);
		return arrray[k];
	}

	public int partition(int indexFirst, int indexLast) {
		int pivot = new Random().nextInt((indexLast - indexFirst) + 1) + indexFirst;
		swap(indexLast, pivot);
		for (int i = indexFirst; i < indexLast; i++) {
			if (arrray[i] > arrray[indexLast]) {
				swap(i, indexLast);
				indexFirst++;
			}
		}
		swap(indexFirst, indexLast);
		return indexFirst;
	}

	public void swap(int i, int j) {
		int temp = arrray[i];
		arrray[i] = arrray[j];
		arrray[j] = temp;
	}
}
