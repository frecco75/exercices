package com.codility.lessons.arrays;

import java.util.Arrays;

public class OddOccurrencesInArray {

    public int solution(final int[] A) {
        int solution = 0;
        Arrays.sort(A);
        for(int i=0; i<A.length; ++i) {
            if(i%2 == 1 && A[i] != solution) {
                break;
            }
            solution = A[i];
        }
        return solution;
    }

}
