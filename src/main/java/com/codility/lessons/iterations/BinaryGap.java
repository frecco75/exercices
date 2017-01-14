package com.codility.lessons.iterations;

public class BinaryGap {

    public int solution(final int N) {
        int solution = 0;
        int count = 0;
        String binary = Integer.toBinaryString(N);
        if(binary != null) {
            for(char c : binary.toCharArray()) {
                if(c == '0') {
                    count++;
                }
                else {
                    solution = Math.max(solution, count);
                    count = 0;
                }
            }
        }
        return solution;
    }

}
