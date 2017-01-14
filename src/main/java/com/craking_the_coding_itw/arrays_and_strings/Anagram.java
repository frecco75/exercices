package com.craking_the_coding_itw.arrays_and_strings;

/**
 * Write a method to decide if two strings are anagrams or not
 * @author fabienrecco
 *
 */
public class Anagram {

    /**
     * Solution en O(n^2)
     * @param s1
     * @param s2
     * @return
     */
    public boolean solution(final String s1, final String s2) {
        boolean anagram = false;

        if(s1 == null && s2 == null) {
            anagram = true;
        }
        else if(s1 == null && s2 != null || s1 != null && s2 == null) {
            anagram = false;
        }
        else {
            String ss1 = s1.toLowerCase();
            String ss2 = s2.toLowerCase();

            char[] charArray1 = ss1.toCharArray();
            char[] charArray2 = ss2.toCharArray();

            boolean all1in2 = allCharsExist(charArray1, charArray2);
            boolean all2in1 = allCharsExist(charArray2, charArray1);

            anagram = all1in2 && all2in1;
        }

        return anagram;
    }

    private boolean allCharsExist(final char[] charArray1, final char[] charArray2) {
        boolean allCharsExist = true;
        for(char c1 : charArray1) {
            boolean exists = false;
            for(char c2 : charArray2) {
                if(c1 == c2) {
                    exists = true;
                    break;
                }
            }
            if(! exists) {
                allCharsExist = false;
                break;
            }
        }
        return allCharsExist;
    }



}
