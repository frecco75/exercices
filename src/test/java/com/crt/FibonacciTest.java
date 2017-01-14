package com.crt;

import org.junit.Assert;
import org.junit.Test;

import com.crt.Fibonacci;

public class FibonacciTest {

	private Fibonacci fibonacci = new Fibonacci();

	@Test
	public void test_0() {
		int solution = fibonacci.recusiveFibo(0);
		Assert.assertEquals(0, solution);
	}

	@Test
	public void test_1() {
		int solution = fibonacci.recusiveFibo(1);
		Assert.assertEquals(1, solution);
	}

	@Test
	public void test_2() {
		int solution = fibonacci.recusiveFibo(2);
		Assert.assertEquals(1, solution);
	}

	@Test
	public void test_11() {
		int solution = fibonacci.recusiveFibo(11);
		Assert.assertEquals(89, solution);
	}

	@Test
    public void test_cache_0() {
        int solution = fibonacci.fiboWithCache(0);
        Assert.assertEquals(0, solution);
    }

    @Test
    public void test_cache_1() {
        int solution = fibonacci.fiboWithCache(1);
        Assert.assertEquals(1, solution);
    }

    @Test
    public void test_cache_2() {
        int solution = fibonacci.fiboWithCache(2);
        Assert.assertEquals(1, solution);
    }

    @Test
    public void test_cache_11() {
        int solution = fibonacci.fiboWithCache(11);
        Assert.assertEquals(89, solution);
    }

}
