package com.codility.lessons.prefix_sums;

public class CountDiv {

    public int trivialSolution(final int A, final int B, final int K) {
        int solution = 0;

        for(int i=A; i<=B; ++i) {
            if(i%K == 0) {
                solution++;
            }
        }
        return solution;
    }

    public int solution(final int A, final int B, final int K) {
        int solution = 0;
        int offsetForLeftRange = 0;
        if(A%K == 0) {
            offsetForLeftRange++;
        }

        solution =  B/K - A/K + offsetForLeftRange;
        return solution;
    }


}
