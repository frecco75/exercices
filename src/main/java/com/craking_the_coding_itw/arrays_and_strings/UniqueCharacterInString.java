package com.craking_the_coding_itw.arrays_and_strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures
 * @author fabienrecco
 *
 */
public class UniqueCharacterInString {

    /**
     * Solution en O(n)
     * @param s
     * @return
     */
    public boolean solution(final String s) {
        boolean uniqueChar = true;
        Set<Character> set = new HashSet<Character>();
        if(s != null) {
            for(char c : s.toCharArray()) {
                if(! set.add(c)) {
                    uniqueChar = false;
                    break;
                }
            }
        }
        return uniqueChar;
    }

    /**
     * Solution en O(n^2)
     * @param s
     * @return
     */
    public boolean solutionWithoutAdditionalDataStructure(final String s) {
        boolean uniqueChar = true;
        if(s != null) {
            for(int i=0; i<s.length()-1; ++i) {
                for(int j=i+1; j<s.length(); ++j) {
                    if(s.charAt(i) == s.charAt(j)) {
                        uniqueChar = false;
                        break;
                    }
                }
                if(! uniqueChar) {
                    break;
                }
            }
        }
        return uniqueChar;
    }

}
