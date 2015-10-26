package com.capgemini.pythagorean;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class PythagoreanTest {

	Pythagorean instance = new Pythagorean();
	
	@Test
	public void test() {
		//given
		int a = 3;
	    int b = 4;
	    int c = 5;
		//when
		boolean result = instance.pythagorean(a, b, c);
		//then
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void test1() {
		//given
		int a = 10;
	    int b = 4;
	    int c = 5;
		//when
		boolean result = instance.pythagorean(a, b, c);
		//then
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void test2() {
		//given
		int a = 3;
	    int b = 4;
	    int c = 6;
		//when
		boolean result = instance.pythagorean(a, b, c);
		//then
		Assert.assertEquals(false, result);
	}
}
