package com.codility.lessons.time_complexity;

public class FrogJmp {

    public int solution(final int X, final int Y, final int D) {
        double valueExact = (Y - X) / (double) D;
        int solution = (int) Math.ceil(valueExact);
        return solution;
    }

}
