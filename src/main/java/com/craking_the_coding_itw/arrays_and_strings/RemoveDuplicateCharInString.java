package com.craking_the_coding_itw.arrays_and_strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Design an algorithm and write code to remove the duplicate characters in a string without using any additionnal buffer
 * @author fabienrecco
 *
 */
public class RemoveDuplicateCharInString {

    /**
     * Solution en O(n^3) sans structure de données
     * @param A
     */
    public void solution(final char[] A) {
        if(A != null && A.length > 0) {
            int nbrRemoves = 0;
            char emptyChar = '\u0000';
            for(int i=0; i<A.length-1; ++i) {
                if(A[i] != emptyChar) {
                    for(int j=i+1; j<A.length; ++j) {
                        if(A[i] == A[j]) {
                            for(int k=j; k<A.length-1; k++) {
                                A[k] = A[k+1];
                            }
                            A[A.length - ++nbrRemoves] = emptyChar;
                        }
                    }
                }
            }
        }
    }

    /**
     * Solution en O(n) avec HashSet
     * @param s
     * @return
     */
    public String solution(final String s) {
        String solution = null;
        if(s != null && s.length() > 0) {
            Set<Character> set = new HashSet<Character>();
            char[] charArray = new char[s.length()];
            int i=0;
            if(s != null) {
                for(char c : s.toCharArray()) {
                    if(set.add(c)) {
                        charArray[i++] = c;
                    }
                }
                solution = new String(charArray, 0, i);
            }
        }
        return solution;
    }

}
