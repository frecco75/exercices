package com.codility.lessons.maximum_slice_problem;

public class MaxDoubleSliceSum {

    public int solution(final int[] A) {
        int N = A.length;
        int solution = 0;

        if(A != null && N > 0) {
            int[] K1 = new int[N];
            int[] K2 = new int[N];

            for(int i=1; i<N-1; ++i){
              K1[i] = Math.max(K1[i-1] + A[i], 0);
            }

            for(int i=N-2; i>0; --i){
              K2[i] = Math.max(K2[i+1] + A[i], 0);
            }

            for(int i=1; i<N-1; ++i){
                solution = Math.max(solution, K1[i-1] + K2[i+1]);
            }
        }

        return solution;
    }

}
