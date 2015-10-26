package com.capgemini.pythagorean;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
 * which, a2 + b2 = c2 For example, 32 + 42 = 9 + 16 = 25 = 52. For example, 3^2
 * + 4^2 = 9 + 16 = 25 = 5^2.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find
 * the product abc.
 */
public class Pythagorean2 {
	

	public boolean pythagorean(int sum) {
		boolean result = false;

		int a = 0;
		for (a = 1; a <= sum / 3; a++) {
			int b = 0;
			for (b = a + 1; b <= sum / 2; b++) {
				int c = sum - a - b;
				if (a * a + b * b == c * c) {
					printTripletPythagorean(sum, a, b, c);
					result = true;
				}
			}
		}
		return result;
	}

	public void printTripletPythagorean(int sum, int a, int b, int c) {
		System.out.println("Pythagorean triplet for " + sum);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println();
	}



}
