package com.codility.lessons.maximum_slice_problem;

public class MaxProfit {

    public int solution(final int[] A) {
        int maxProfit = 0;
        int solution = 0;

        for (int i=1; i < A.length; ++i) {
            maxProfit = Math.max(0, maxProfit + A[i] - A[i-1]);
            solution = Math.max(solution, maxProfit);
        }

        return solution;
    }

    public int trivialSolution(final int[] A) {
        int solution = 0;

        if(A != null && A.length > 0) {
            for(int i=0; i<A.length - 1; ++i) {
                for(int j=i+1; j<A.length; ++j) {
                    solution = Math.max(A[j] - A[i], solution);
                }
            }
        }

        return solution;
    }

}
