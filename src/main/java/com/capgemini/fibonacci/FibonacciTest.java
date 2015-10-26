package com.capgemini.fibonacci;

import junit.framework.Assert;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void test0() {
		// given
		int n = 0;
		// when
		long result = Fibonacci.fib(n);
		// then
		Assert.assertEquals(0, result);
	}

	@Test
	public void test1() {
		// given
		int n = 1;
		// when
		long result = Fibonacci.fib(n);
		// then
		Assert.assertEquals(1, result);
	}

	@Test
	public void test2() {
		// given
		int n = 2;
		// when
		long result = Fibonacci.fib(n);
		// then
		Assert.assertEquals(1, result);
	}

	@Test
	public void test3() {
		// given
		int n = 3;
		// when
		long result = Fibonacci.fib(n);
		// then
		Assert.assertEquals(2, result);
	}

	@Test
	public void test4() {
		// given
		int n = 4;
		// when
		long result = Fibonacci.fib(n);
		// then
		Assert.assertEquals(3, result);
	}

	@Test
	public void test5() {
		// given
		int n = 5;
		// when
		long result = Fibonacci.fib(n);
		// then
		Assert.assertEquals(5, result);
	}

	@Test
	public void test6() {
		// given
		int n = 6;
		// when
		long result = Fibonacci.fib(n);
		// then
		Assert.assertEquals(8, result);
	}

	@Test
	public void test10() {
		// given
		int n = 10;
		// when
		long result = Fibonacci.fib(n);
		// then
		Assert.assertEquals(55, result);
	}

	@Test
	public void test14() {
		// given
		int n = 14;
		// when
		long result = Fibonacci.fib(n);
		// then
		Assert.assertEquals(377, result);
	}

	@Test
	public void test19() {
		// given
		int n = 19;
		// when
		long result = Fibonacci.fib(n);
		// then
		Assert.assertEquals(4181, result);
	}

}
