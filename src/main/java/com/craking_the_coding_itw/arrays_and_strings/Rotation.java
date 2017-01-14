package com.craking_the_coding_itw.arrays_and_strings;

/**
 * Assume you have a method isSubstring which checks if one word is a substring of another.
 * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring.
 * ie "waterbottle" is a rotation of "erbottlewat"
 *
 * @author fabienrecco
 *
 */
public class Rotation {

    public boolean solution(final String s1, final String s2) {
        boolean isRotation = false;
        if(s1 == null && s2 == null) {
            isRotation = true;
        }
        else if(s1 != null && s2 != null && s1.length() == s2.length()) {
            isRotation = isSubstring(s1, s2 + s2);
        }
        return isRotation;
    }

    private boolean isSubstring(final String s1, final String s2) {
        boolean isSubstring = false;
        if(s1 != null && s2 != null) {
            isSubstring = s2.contains(s1);
        }
        return isSubstring;
    }

}
