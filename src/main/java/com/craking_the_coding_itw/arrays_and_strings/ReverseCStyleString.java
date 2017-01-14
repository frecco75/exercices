package com.craking_the_coding_itw.arrays_and_strings;

/**
 * Write code to reverse a C-Style String
 * @author fabienrecco
 *
 */
public class ReverseCStyleString {

    /**
     * Solution en O(n), n = taille de la chaîne de caractères
     * @param s
     * @return
     */
    public String solution(final String s) {
        String reverseString = null;
        if(s != null && s.length() > 0) {
            char[] tmp = new char[s.length()];
            int i=0;
            for(char c : s.toCharArray()) {
                tmp[s.length()-++i] = c;
            }
            reverseString = new String(tmp);
        }
        return reverseString;
    }

}
