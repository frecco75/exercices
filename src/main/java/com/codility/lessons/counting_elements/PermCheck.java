package com.codility.lessons.counting_elements;

import java.util.Arrays;

public class PermCheck {

    public int solution(final int[] A) {
        int solution = 1;

        Arrays.sort(A);
        for(int i=0; i<A.length; ++i) {
            if(A[i] != i+1) {
                solution = 0;
                break;
            }
        }

        return solution;
    }

}
