package com.capgemini.pythagorean;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
 * which, a2 + b2 = c2 For example, 32 + 42 = 9 + 16 = 25 = 52. For example, 3^2
 * + 4^2 = 9 + 16 = 25 = 5^2.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find
 * the product abc.
 */
public class Pythagorean {
	
	public boolean pythagorean(int a, int b, int c){
		boolean result = false;
		double aPow = Math.pow(a, 2);
		double bPow = Math.pow(b, 2);
		double cPow = Math.pow(c, 2);
		
		if(a<b && b<c){
			if((aPow + bPow)==cPow){
				result = true;
			}
		}
		
		return result;
	}
}
