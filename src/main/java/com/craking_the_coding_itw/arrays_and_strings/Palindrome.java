package com.craking_the_coding_itw.arrays_and_strings;

public class Palindrome {

    public boolean checkPalindrome(final String s) {
        boolean isPalindrome = false;
        if(s != null) {
            StringBuilder sb = new StringBuilder(s);
            String reverseString = sb.reverse().toString();
            isPalindrome = s.equals(reverseString);
        }
        return isPalindrome;
    }

    public boolean fastCheckPalindrome(final String s) {
        boolean isPalindrome = false;
        if(s != null) {
            int length = s.length();
            isPalindrome = true;
            for(int i = 0; i<length/2; ++i) {
                if(s.charAt(i) != s.charAt(length-1-i)) {
                    isPalindrome = false;
                    break;
                }
            }
        }
        return isPalindrome;
    }

}
