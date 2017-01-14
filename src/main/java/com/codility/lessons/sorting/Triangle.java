package com.codility.lessons.sorting;

import java.util.Arrays;

public class Triangle {

    public int solution(final int[] A) {
        int solution = 0;

        Arrays.sort(A);

        for(int i=0; i<A.length-2; ++i) {
            long ai = A[i];
            long aj = A[i+1];
            long ak = A[i+2];

            if(ai + aj > ak
                    && aj + ak > ai
                    && ak + ai > aj) {
                solution = 1;
                break;
            }
        }
        return solution;
    }

    public int trivialSolution(final int[] A) {
        for(int i=0; i<A.length-2; ++i) {
            for(int j=i+1; j<A.length-1; ++j) {
                for(int k=j+1; k<A.length; ++k) {
                    long ai = A[i];
                    long aj = A[j];
                    long ak = A[k];
                    if(ai + aj > ak
                      && aj + ak > ai
                      && ak + ai > aj) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

}
