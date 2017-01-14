package com.codility.lessons.prime_and_composite_numbers;

public class MinPerimeterRectangle {

    public int solution(final int N) {
        int solution = Integer.MAX_VALUE;

        for(int A=1; A<=Math.sqrt(N); ++A) {
            if(N%A == 0) {
                int B = N/A;
                int perimetre = 2*(A+B);
                solution = Math.min(solution, perimetre);
            }
        }

        return solution;
    }

}
