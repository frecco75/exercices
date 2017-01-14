package com.codility.lessons.leader;

import java.util.HashMap;
import java.util.Map;

public class Dominator {

    public int solution(final int[] A) {
        int solution = -1;
        Integer leader = getLeader(A);

        if(leader != null) {
            for(int i=0; i<A.length; ++i) {
                if(A[i] == leader) {
                    solution = i;
                    break;
                }
            }
        }

        return solution;
    }

    private Integer getLeader(final int[] A) {
        Map<Integer, Integer> counter = new HashMap<Integer, Integer>();

        Integer leader = null;
        if(A != null && A.length > 0) {
            for(int i=0; i<A.length; ++i) {
                int count = incrementCount(counter, A[i]);
                if(count > A.length / 2) {
                    leader = A[i];
                    break;
                }
            }
        }
        return leader;
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
