package com.codility.lessons.leader;

import java.util.HashMap;
import java.util.Map;

public class EquiLeader {

    public int solution(final int[] A) {
        int solution = 0;

        Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
        Integer leader = null;
        int countLeader = 0;
        if(A != null && A.length > 0) {
            for(int i=0; i<A.length; ++i) {
                int count = incrementCount(counter, A[i]);
                if(count > A.length / 2) {
                    leader = A[i];
                }
            }

            if(leader != null) {
                countLeader = counter.get(leader);
                int count = 0;
                for(int i=0; i<A.length; ++i) {
                    if(A[i] == leader) {
                        count++;
                    }
                    if(count > (i+1)/2 && countLeader - count > (A.length - i - 1)/2) {
                        solution++;
                    }
                }
            }
        }

        return solution;
    }

    private int incrementCount(final Map<Integer, Integer> counter, final Integer i) {
        Integer count = counter.get(i);
        if(count == null) {
            count = 0;
        }
        counter.put(i, ++count);
        return count;
    }

}
