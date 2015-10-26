package com.capgemini.placeToSplit;

import junit.framework.Assert;

import org.junit.Test;

public class PlaceToSplitTest {

	@Test
	public void test1() {
		// given
		int[] nums = {};
		// when
		boolean result = PlaceToSplit.canBalance(nums);

		// then
		Assert.assertEquals(false, result);
	}

	@Test
	public void test2() {
		// given
		int[] nums = { 2 };
		// when
		boolean result = PlaceToSplit.canBalance(nums);

		// then
		Assert.assertEquals(false, result);
	}

	@Test
	public void test3() {
		// given
		int[] nums = { 10 };
		// when
		boolean result = PlaceToSplit.canBalance(nums);

		// then
		Assert.assertEquals(false, result);
	}

	@Test
	public void test35() {
		// given
		int[] nums = { 10, 10 };
		// when
		boolean result = PlaceToSplit.canBalance(nums);

		// then
		Assert.assertEquals(true, result);
	}

	@Test
	public void test4() {
		// given
		int[] nums = { 2, 4, 4, 2 };
		// when
		boolean result = PlaceToSplit.canBalance(nums);

		// then
		Assert.assertEquals(true, result);
	}

	@Test
	public void test5() {
		// given
		int[] nums = { 2, 4, 2, 2 };
		// when
		boolean result = PlaceToSplit.canBalance(nums);

		// then
		Assert.assertEquals(false, result);
	}

	@Test
	public void test6() {
		// given
		int[] nums = { 2, 4, 5, 1, 3, 3, 3, 3 };
		// when
		boolean result = PlaceToSplit.canBalance(nums);

		// then
		Assert.assertEquals(true, result);
	}

	@Test
	public void test7() {
		// given
		int[] nums = { 2, 4, 5, 2, 2, 2 };
		// when
		boolean result = PlaceToSplit.canBalance(nums);

		// then
		Assert.assertEquals(false, result);
	}

	@Test
	public void test8() {
		// given
		int[] nums = { 2, 3, 5 };
		// when
		boolean result = PlaceToSplit.canBalance(nums);

		// then
		Assert.assertEquals(true, result);
	}

	@Test
	public void test9() {
		// given
		int[] nums = { 10, 2, 3, 1, 4 };
		// when
		boolean result = PlaceToSplit.canBalance(nums);

		// then
		Assert.assertEquals(true, result);
	}

	@Test
	public void test10() {
		// given
		int[] nums = { 10, 2, 3, 1, 4, 5 };
		// when
		boolean result = PlaceToSplit.canBalance(nums);

		// then
		Assert.assertEquals(false, result);
	}
}
