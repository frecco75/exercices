package com.codility.lessons.sorting;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

    public int solution(final int[] A) {
        Set<Integer> distinctValues = new HashSet<Integer>();
        for(int i=0; i<A.length; ++i) {
            distinctValues.add(A[i]);
        }
        int solution = distinctValues.size();
        return solution;
    }

}
