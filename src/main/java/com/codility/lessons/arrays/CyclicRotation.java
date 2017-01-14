package com.codility.lessons.arrays;

public class CyclicRotation {

    public int[] solution(final int[] A, final int k) {
        int[] solution = new int[A.length];

        for(int i=0; i<A.length; ++i) {
            int position = (i+k) % A.length;
            solution[position] = A[i];
        }

        return solution;
    }

}
