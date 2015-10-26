package com.capgemini.coins;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class CoinsTest {

	@Test
	public void test() {
		// given
		List<Integer> coins = new ArrayList<Integer>();
		coins.add(1);
		coins.add(1);
		coins.add(1);
		coins.add(1);
		coins.add(0);
		coins.add(0);
		// when
		int result = Coins.solution(coins);

		// then
		Assert.assertEquals(4, result);

	}

	@Test
	public void test1() {
		// given
		List<Integer> coins = new ArrayList<Integer>();
		coins.add(1);
		coins.add(1);
		coins.add(1);
		coins.add(1);
		coins.add(1);
		coins.add(0);
		// when
		int result = Coins.solution(coins);

		// then
		Assert.assertEquals(5, result);

	}

	@Test
	public void test2() {
		// given
		List<Integer> coins = new ArrayList<Integer>();
		coins.add(1);
		coins.add(1);
		coins.add(0);
		coins.add(1);
		coins.add(0);
		coins.add(0);
		// when
		int result = Coins.solution(coins);

		// then
		Assert.assertEquals(4, result);

	}
	
	@Test
	public void test3() {
		// given
		List<Integer> coins = new ArrayList<Integer>();
		coins.add(1);
		coins.add(0);
		coins.add(0);
		coins.add(0);
		
		// when
		int result = Coins.solution(coins);

		// then
		Assert.assertEquals(3, result);

	}
	
	@Test
	public void test4() {
		// given
		List<Integer> coins = new ArrayList<Integer>();
		coins.add(1);
		coins.add(1);
		coins.add(0);
		coins.add(0);
		coins.add(0);
		coins.add(0);
		// when
		int result = Coins.solution(coins);

		// then
		Assert.assertEquals(4, result);

	}
	
	@Test
	public void test5() {
		// given
		List<Integer> coins = new ArrayList<Integer>();
		coins.add(1);
		coins.add(0);
		coins.add(1);
		coins.add(0);
		coins.add(1);
		coins.add(0);
		// when
		int result = Coins.solution(coins);

		// then
		Assert.assertEquals(2, result);

	}

	@Test
	public void test6() {
		// given
		List<Integer> coins = new ArrayList<Integer>();
		coins.add(0);
		coins.add(0);
		coins.add(0);
		coins.add(0);
		coins.add(1);
		coins.add(1);
		// when
		int result = Coins.solution(coins);

		// then
		Assert.assertEquals(4, result);

	}

	@Test
	public void test7() {
		// given
		List<Integer> coins = new ArrayList<Integer>();
		coins.add(0);
		coins.add(0);
		coins.add(0);
		coins.add(1);
		coins.add(1);
		coins.add(1);
		// when
		int result = Coins.solution(coins);

		// then
		Assert.assertEquals(4, result);

	}

	@Test
	public void test8() {
		// given
		List<Integer> coins = new ArrayList<Integer>();
		coins.add(1);
		coins.add(0);
		coins.add(0);
		coins.add(0);
		coins.add(1);
		coins.add(1);
		coins.add(1);
		coins.add(0);
		coins.add(1);
		coins.add(0);
		// when
		int result = Coins.solution(coins);

		// then
		Assert.assertEquals(6, result);

	}

}
