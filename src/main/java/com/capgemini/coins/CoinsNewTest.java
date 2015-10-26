package com.capgemini.coins;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

@SuppressWarnings("deprecation")
public class CoinsNewTest {

	@Test
	public void test0() {
		// given
		List<Integer> coins = new ArrayList<>();
		// when
		int result = CoinsNew.solution(coins);
		// then
		Assert.assertEquals(0, result);
	}

	@Test
	public void test1() {
		// given
		List<Integer> coins = new ArrayList<>();
		coins.add(0);
		// when
		int result = CoinsNew.solution(coins);
		// then
		Assert.assertEquals(0, result);

	}

	@Test
	public void test2() {
		// given
		List<Integer> coins = new ArrayList<>();
		coins.add(1);
		// when
		int result = CoinsNew.solution(coins);
		// then
		Assert.assertEquals(0, result);

	}

	@Test
	public void test3() {
		// given
		List<Integer> coins = new ArrayList<>();
		coins.add(0);
		coins.add(1);
		// when
		int result = CoinsNew.solution(coins);
		// then
		Assert.assertEquals(1, result);

	}

	@Test
	public void test4() {
		// given
		List<Integer> coins = new ArrayList<>();
		coins.add(1);
		coins.add(1);
		// when
		int result = CoinsNew.solution(coins);
		// then
		Assert.assertEquals(0, result);

	}

	@Test
	public void test5() {
		// given
		List<Integer> coins = new ArrayList<>();
		coins.add(1);
		coins.add(0);
		coins.add(1);
		// when
		int result = CoinsNew.solution(coins);
		// then
		Assert.assertEquals(2, result);

	}

	@Test
	public void test6() {
		// given
		List<Integer> coins = new ArrayList<>();
		coins.add(1);
		coins.add(1);
		coins.add(1);
		// when
		int result = CoinsNew.solution(coins);
		// then
		Assert.assertEquals(1, result);

	}

	@Test
	public void test7() {
		// given
		List<Integer> coins = new ArrayList<>();
		coins.add(0);
		coins.add(1);
		coins.add(1);
		// when
		int result = CoinsNew.solution(coins);
		// then
		Assert.assertEquals(2, result);

	}

	@Test
	public void test8() {
		// given
		List<Integer> coins = new ArrayList<>();
		coins.add(1);
		coins.add(0);
		coins.add(0);
		// when
		int result = CoinsNew.solution(coins);
		// then
		Assert.assertEquals(2, result);

	}

	@Test
	public void test9() {
		// given
		List<Integer> coins = new ArrayList<>();
		coins.add(0);
		coins.add(0);
		coins.add(1);
		// when
		int result = CoinsNew.solution(coins);
		// then
		Assert.assertEquals(2, result);

	}

	@Test
	public void test10() {
		// given
		List<Integer> coins = new ArrayList<>();
		coins.add(1);
		coins.add(0);
		coins.add(0);
		coins.add(1);
		// when
		int result = CoinsNew.solution(coins);
		// then
		Assert.assertEquals(2, result);

	}

	@Test
	public void test11() {
		// given
		List<Integer> coins = new ArrayList<>();
		coins.add(0);
		coins.add(1);
		coins.add(0);
		coins.add(1);
		// when
		int result = CoinsNew.solution(coins);
		// then
		Assert.assertEquals(2, result);

	}

	@Test
	public void test12() {
		// given
		List<Integer> coins = new ArrayList<>();
		coins.add(0);
		coins.add(1);
		coins.add(0);
		coins.add(1);
		coins.add(1);
		coins.add(0);
		// when
		int result = CoinsNew.solution(coins);
		// then
		Assert.assertEquals(3, result);

	}

	@Test
	public void test13() {
		// given
		List<Integer> coins = new ArrayList<>();
		coins.add(0);
		coins.add(1);
		coins.add(0);
		coins.add(0);
		coins.add(1);
		coins.add(1);
		// when
		int result = CoinsNew.solution(coins);
		// then
		Assert.assertEquals(4, result);

	}

	@Test
	public void test14() {
		// given
		List<Integer> coins = new ArrayList<>();
		coins.add(1);
		coins.add(1);
		coins.add(1);
		coins.add(1);
		coins.add(1);
		coins.add(0);
		// when
		int result = CoinsNew.solution(coins);
		// then
		Assert.assertEquals(5, result);

	}

	@Test
	public void test15() {
		// given
		List<Integer> coins = new ArrayList<>();
		coins.add(1);
		coins.add(1);
		coins.add(1);
		coins.add(1);
		coins.add(1);
		coins.add(1);
		// when
		int result = CoinsNew.solution(coins);
		// then
		Assert.assertEquals(4, result);

	}

	@Test
	public void test16() {
		// given
		List<Integer> coins = new ArrayList<>();
		coins.add(0);
		coins.add(1);
		coins.add(1);
		coins.add(0);
		coins.add(1);
		coins.add(1);
		// when
		int result = CoinsNew.solution(coins);
		// then
		Assert.assertEquals(4, result);

	}

}
