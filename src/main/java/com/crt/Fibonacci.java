package com.crt;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public int recusiveFibo(final int n) {
        int solution;
        if(n < 2) {
            solution = n;
        }
        else {
            solution = recusiveFibo(n - 1) + recusiveFibo(n - 2);
        }
        return solution;
    }

    private Map<Integer, Integer> cache = new HashMap<Integer, Integer>();

    public int fiboWithCache(final int n) {
        Integer solution = cache.get(n);

        if(solution == null) {
            if(n < 2) {
                solution = n;
            }
            else {
                solution = fiboWithCache(n - 1) + fiboWithCache(n - 2);
            }
            cache.put(n, solution);
        }

        return solution;
    }

}
