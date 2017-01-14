package com.cracking_the_coding_itw.arrays_and_strings;

import org.junit.Assert;
import org.junit.Test;

import com.craking_the_coding_itw.arrays_and_strings.Palindrome;

public class PalindromeTest {

    Palindrome palindrome = new Palindrome();

    @Test
    public void check_palindrome_test() {
        // Cas impair
        String s1 = "bob";
        boolean palindrome1 = palindrome.checkPalindrome(s1);
        Assert.assertTrue(palindrome1);

        // Cas pair
        String s2 = "elle";
        boolean palindrome2 = palindrome.checkPalindrome(s2);
        Assert.assertTrue(palindrome2);

        // Pas palindrome
        String s3 = "toto";
        boolean palindrome3 = palindrome.checkPalindrome(s3);
        Assert.assertFalse(palindrome3);
    }

    @Test
    public void fast_check_palindrome_test() {
        // Cas impair
        String s1 = "bob";
        boolean palindrome1 = palindrome.fastCheckPalindrome(s1);
        Assert.assertTrue(palindrome1);

        // Cas pair
        String s2 = "elle";
        boolean palindrome2 = palindrome.fastCheckPalindrome(s2);
        Assert.assertTrue(palindrome2);

        // Pas palindrome
        String s3 = "toto";
        boolean palindrome3 = palindrome.fastCheckPalindrome(s3);
        Assert.assertFalse(palindrome3);
    }


}
