package com.codility.lessons.prefix_sums;

public class PassingCars {

    public int solution(final int[] A) {
        int goingEast = 0;
        long passingCars = 0;
        for(int i=0; i<A.length; ++i) {
            int temp = A[i] % 2;
            if(temp == 0) {
                goingEast++;
            }
            else if(temp == 1) {
                passingCars += goingEast;
            }
            if(passingCars > 1000000000) {
                passingCars = -1;
                break;
            }
        }
        return (int) passingCars;
    }

}
