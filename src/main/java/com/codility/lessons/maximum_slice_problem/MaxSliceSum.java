package com.codility.lessons.maximum_slice_problem;

public class MaxSliceSum {

    public int solution(final int[] A) {
        int solution = 0;

        if(A != null && A.length > 0) {
            int maxEndingHere = A[0];
            solution = A[0];
            for(int i = 1; i < A.length; i++){
                maxEndingHere = Math.max(A[i], maxEndingHere + A[i]);
                solution = Math.max(solution, maxEndingHere);
            }
        }

        return solution;
    }

}
