package com.blz;

public class MaximumNumber {
	public static void main(String[] args) {
		System.out.println("The maximum number between 3 integer is : " + findMaximumNumber(12, 20, 9));
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
}
