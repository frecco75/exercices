package com.crt;

import org.junit.Assert;
import org.junit.Test;

import com.crt.FizzBuzz;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void test() {
        String expectedFizzBuzz15 = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz";
        String fizzBuzz15 = fizzBuzz.fizzBuzz(15);
        Assert.assertEquals(fizzBuzz15, expectedFizzBuzz15);

        String expectedFizzBuzz30 = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz";
        String fizzBuzz30 = fizzBuzz.fizzBuzz(30);
        Assert.assertEquals(fizzBuzz30, expectedFizzBuzz30);
    }

}
