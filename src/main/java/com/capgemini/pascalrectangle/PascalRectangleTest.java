package com.capgemini.pascalrectangle;

import org.junit.Test;

import junit.framework.Assert;

public class PascalRectangleTest {

	PascalRectangle instance = new PascalRectangle();
	
	@Test
	public void test() {
		//given
		int c = 0;
		int r =0;
		//when
		long result = instance.pascal(c, r);
		//then
		Assert.assertEquals(1, result);
		
	}


	
	@Test
	public void test2() {
		//given
		int c = 4;
		int r =1;
		//when
		long result = instance.pascal(c, r);
		//then
		Assert.assertEquals(4, result);
		
	}
	
	@Test
	public void test3() {
		//given
		int c = 4;
		int r = 2;
		//when
		long result = instance.pascal(c, r);
		//then
		Assert.assertEquals(6, result);
		
	}

	@Test
	public void test4() {
		// given
		int c = 6;
		int r = 0;
		// when
		long result = instance.pascal(c, r);
		// then
		Assert.assertEquals(1, result);

	}

	@Test
	public void test5() {
		// given
		int c = 7;
		int r = 3;
		// when
		long result = instance.pascal(c, r);
		// then
		Assert.assertEquals(35, result);

	}

	@Test
	public void test6() {
		// given
		int c = 9;
		int r = 5;
		// when
		long result = instance.pascal(c, r);
		// then
		Assert.assertEquals(126, result);

	}
}
