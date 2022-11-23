package com.blz;

public class MaximumNumber<E extends Comparable<E>> {

	E a, b, c;

	public MaximumNumber(E a, E b, E c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public static void main(String[] args) {
		System.out.println("The maximum number between 3 integer is : " + findMaximum(12, 20, 9));
		System.out.println("The maximum number between 3 float numbers  is : " + findMaximum(15.5f, 12.2f, 9.5f));
		System.out.println("The maximum between 3 String is : " + findMaximum("Java", "Springboot", "Gitbash"));
	}

	public static <E extends Comparable<E>> E findMaximum(E a, E b, E c) {
		E max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		return max;
	}
}
