package com.capgemini.pythagorean;

import org.junit.Test;

import junit.framework.Assert;

public class Pythagorean2Test {

	Pythagorean2 instance = new Pythagorean2();

	@Test
	public void test() {
		// given
		int sum = 12;

		// when
		boolean result = instance.pythagorean(sum);
		// then
		Assert.assertEquals(true, result);
	}

	@Test
	public void test2() {
		// given
		int sum = 55;

		// when
		boolean result = instance.pythagorean(sum);
		// then
		Assert.assertEquals(false, result);
	}

	@Test
	public void test3() {
		// given
		int sum = 1000;

		// when
		boolean result = instance.pythagorean(sum);
		// then
		Assert.assertEquals(true, result);
	}

	@Test
	public void test4() {
		// given
		int sum = 0;

		// when
		boolean result = instance.pythagorean(sum);
		// then
		Assert.assertEquals(false, result);
	}

	@Test
	public void test5() {
		// given
		int sum = 100;

		// when
		boolean result = instance.pythagorean(sum);
		// then
		Assert.assertEquals(false, result);
	}

}
