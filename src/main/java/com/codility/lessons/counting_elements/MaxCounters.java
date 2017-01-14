package com.codility.lessons.counting_elements;

public class MaxCounters {

    public int[] solution(final int N, final int[] A) {
        int[] counters = new int[N];
        int maxCounter = 0;
        int lastMaxCounter = 0;
        for(int i=0; i<A.length; ++i) {
            int value = A[i];
            if(value >= 1 && value <= N) {
                if(counters[value-1] < lastMaxCounter) {
                    counters[value-1] = lastMaxCounter;
                }

                counters[value-1]++;
                maxCounter = Math.max(maxCounter, counters[value-1]);
            }
            else if(value == N+1) {
                lastMaxCounter = maxCounter;
            }
        }

        for(int i=0; i<counters.length; ++i) {
            counters[i] = Math.max(counters[i], lastMaxCounter);
        }

        return counters;
    }

}
