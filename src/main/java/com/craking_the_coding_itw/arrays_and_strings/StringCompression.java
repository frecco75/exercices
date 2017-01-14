package com.craking_the_coding_itw.arrays_and_strings;

/**
 * Implement a method to perform basic string compression using the count of repeated characters.
 * For example, the string "aabcccccaaa" would become "a2bc5a3".
 * If the compressed string would not become smaller than the original string, your method shoud return the original string.
 * You can assume the string has only uppercase and lowercase letters (a-z)
 *
 * @author fabienrecco
 *
 */
public class StringCompression {

    public String compress(final String s) {
        String compressedString = null;

        StringBuilder sb = new StringBuilder();
        char current = '\u0000';
        int count = 0;
        for(char c : s.toCharArray()) {
            if(c != current) {
                addElement(sb, current, count);
                current = c;
                count = 0;
            }
            count++;
        }

        addElement(sb, current, count);

        compressedString = sb.toString();

        return compressedString.length() < s.length() ? compressedString : s;
    }

    private void addElement(final StringBuilder sb, final char current, final int count) {
        if(current != '\u0000') {
            sb.append(current);
            if(count > 1) {
                sb.append(count);
            }
        }
    }

}
