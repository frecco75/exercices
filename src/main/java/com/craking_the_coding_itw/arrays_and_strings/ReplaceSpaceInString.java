package com.craking_the_coding_itw.arrays_and_strings;

/**
 * Write a method to replace all spaces in a string with '%20'. You may assume that
 * the string has sufficient space at the end of the string to hold the additional
 * characters, and that you are given the "true" length of the string. (Note: if
 * implementing in Java, please use a character array so that you can perform this
 * operation in place.)
 *
 * EXAMPLE
 *
 * Input:   "Mr John Smith    ", 13
 * Output:  "Mr%20John%20Smith"
 *
 * @author fabienrecco
 *
 */
public class ReplaceSpaceInString {

    /**
     * Solution en O(n)
     * @param input
     * @return
     */
    public String solution(final String input) {
        String output = null;
        if(input != null) {
            output = input.trim().replaceAll(" ", "%20");
        }
        return output;
    }

    /**
     * Solution en O(n)
     * @param str
     * @param length
     * @return
     */
    public char[] urlify(final char[] str, final int length) {
        int nbrSpaces = countSpaces(str, length);
        int ptr = length - 1 + nbrSpaces * 2; // + nbrSpaces*2 car un espace ' ' est remplacé par '%','2','O'.. '%' déjà comptabilisé dans length
        for(int i=length-1; i>=0; --i) {
            if(str[i] == ' ') {
                str[ptr] = '0';
                str[ptr-1] = '2';
                str[ptr-2] = '%';
                ptr -= 3;
            }
            else {
                str[ptr] = str[i];
                ptr--;
            }
        }
        return str;
    }

    private int countSpaces(final char[] str, final int length) {
        int count = 0;
        for(int i=0; i<length; ++i) {
            if(str[i] == ' ') {
                count++;
            }
        }
        return count;
    }

}
