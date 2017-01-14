package com.codility.lessons.counting_elements;

import java.util.Arrays;

public class MissingInteger {

    public int solution(final int[] A) {
        Arrays.sort(A);
        int solution = 1;
        for(int j=0; j<A.length; ++j) {
            if(A[j]==solution) {
                solution++;
            }
            int last = j > 0 ? A[j] : A[0];
            if(A[j] != last && A[j] > 0 && solution > A[j]) {
                break;
            }
        }

        return solution;
    }

}
