package com.blz;

public class MaximumNumber {
	public static void main(String[] args) {
		System.out.println("The maximum number between 3 integer is : " + findMaximumNumber(12, 20, 9));
		System.out.println("The maximum number between 3 float numbers  is : " + findMaximumNumber(15.5f, 12.2f, 9.5f));
	}

	public static int findMaximumNumber(Integer i, Integer j, Integer k) {
		Integer max = i;
		if (j.compareTo(max) > 0) {
			max = j;
		}
		if (k.compareTo(max) > 0) {
			max = k;
		}
		return max;
	}

	public static float findMaximumNumber(Float x, Float y, Float z) {
		Float max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}
}
