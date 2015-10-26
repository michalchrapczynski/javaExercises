package com.capgemini.coins;

import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class CoinsNew2Test {

	@Test
	public void test_empty_return0() {
		int expected = 0;
		runTest(expected);
	}

	@Test
	public void test_0_return0() {
		int expected = 0;
		runTest(expected, 0);
	}

	@Test
	public void test_1_return0() {
		int expected = 0;
		runTest(expected, 1);
	}

	@Test
	public void test_01_return1() {
		int expected = 1;
		runTest(expected, 0, 1);
	}

	@Test
	public void test_11_return0() {
		int expected = 0;
		runTest(expected, 1, 1);
	}

	@Test
	public void test_10_return1() {
		int expected = 1;
		runTest(expected, 1, 0);
	}

	@Test
	public void test_00_return0() {
		int expected = 0;
		runTest(expected, 0, 0);
	}

	@Test
	public void test_101_return2() {
		int expected = 2;
		runTest(expected, 1, 0, 1);
	}

	@Test
	public void test_111_return1() {
		int expected = 1;
		runTest(expected, 1, 1, 1);
	}

	@Test
	public void test_001_return2() {
		int expected = 2;
		runTest(expected, 0, 0, 1);
	}

	@Test
	public void test_011_return2() {
		int expected = 2;
		runTest(expected, 0, 1, 1);
	}

	@Test
	public void test_100_return2() {
		int expected = 2;
		runTest(expected, 1, 0, 0);
	}

	@Test
	public void test_1001_return2() {
		int expected = 2;
		runTest(expected, 1, 0, 0, 1);
	}

	@Test
	public void test_0101_return2() {
		int expected = 2;
		runTest(expected, 0, 1, 0, 1);
	}

	@Test
	public void test_010110_return3() {
		int expected = 3;
		runTest(expected, 0, 1, 0, 1, 1, 0);
	}

	@Test
	public void test_111110_return5() {
		int expected = 5;
		runTest(expected, 1, 1, 1, 1, 1, 0);
	}

	@Test
	public void test_111111_return4() {
		int expected = 4;
		runTest(expected, 1, 1, 1, 1, 1, 1);
	}

	@Test
	public void test_011011_return4() {
		int expected = 4;
		runTest(expected, 0, 1, 1, 0, 1, 1);
	}

	private void runTest(int expected, Integer... input) {
		// given
		List<Integer> coins = Arrays.asList(input);
		// when
		int result = CoinsNew2.solution(coins);
		// then
		Assert.assertEquals(expected, result);
	}

}
