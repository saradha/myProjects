package com.move.all.negative;

public class MoveAllNegativeIntegers {

	int[] arrA;

	public MoveAllNegativeIntegers(int[] arrA) {
		this.arrA = arrA;
	}

	public void divideGroups(int low, int high) {
		if (low >= high)
			return;
		int mid = (low + high) / 2;
		divideGroups(low, mid);
		divideGroups(mid + 1 , high);
		merge(low, mid, high);

	}

	public void merge(int low, int mid, int high) {
		int l = low;
		int k = mid + 1;
		while (l <= mid && arrA[l] <= 0)
			l++;
		while (k <= high && arrA[k] <= 0)
			k++;
		reverse(l, mid);
		reverse(mid + 1, k - 1);
		reverse(l, k - 1);
	}

	public void reverse(int x, int y) {
		while (y > x) {
			int temp = arrA[x];
			arrA[x] = arrA[y];
			arrA[y] = temp;
			x++;
			y--;
		}
	}

	public void display() {
		for (int i = 0; i < arrA.length; i++) {
			System.out.print(" " + arrA[i]);
		}
	}

	public static void main(String args[]) {
		int[] a = {-5, 7, -3, -4, 9, 10, -1, 11 };
		MoveAllNegativeIntegers r = new MoveAllNegativeIntegers(a);
		System.out.print("Input : ");
		r.display();
		r.divideGroups(0, a.length - 1);
		System.out.println("");
		System.out.print("ReArranged Output : ");
		r.display();
	}

}
