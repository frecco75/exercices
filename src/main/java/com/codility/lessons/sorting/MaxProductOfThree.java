package com.codility.lessons.sorting;

import java.util.Arrays;

public class MaxProductOfThree {

    public int solution(final int[] A) {
        Arrays.sort(A);
        int maxTriplet = 0;
        int N = A.length;

        if(A[0]*A[1]>0 && A[0]<0) {
            if(A[0]*A[1]*A[N-1]>A[N-3]*A[N-2]*A[N-1]){
                maxTriplet = A[0]*A[1]*A[N-1];
            }
            else{
                maxTriplet = A[N-3]*A[N-2]*A[N-1];
            }
        }
        else{
            maxTriplet = A[N-3]*A[N-2]*A[N-1];
        }

        return maxTriplet;
    }

}
