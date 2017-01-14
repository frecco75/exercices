package com.codility.lessons.prime_and_composite_numbers;

public class CountFactors {

    public int solution(final int N) {
        int solution = 0;
        for (int i=1; i<=Math.sqrt(N); ++i) {
            if(N%i == 0) {
                solution += i*i==N ? 1 : 2;
            }
        }
        return solution;
    }

    public int trivialSolution(final int N) {
        int solution = 0;
        for(int i=1; i <= N; ++i) {
            if(N%i == 0) {
                solution++;
            }
        }
        return solution;
    }

}
