package com.crt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThreeSum {

    /*
     * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
     * Find all unique triplets in the array which gives the sum of zero.
     *
     * For example, given array S = {-1 0 1 2 -1 -4},
       A solution set is:
       (-1, 0, 1)
       (-1, -1, 2)
     */

    /**
     * Solution en O(n^3)
     * @param A
     * @return
     */
    public Set<Triplet> basicSolution(final int[] A) {
        Set<Triplet> triplets = new HashSet<Triplet>();

        if(A.length > 3) {
            Arrays.sort(A);
            for(int i=0; i<A.length-2; i++) {
                for(int j=i+1; j<A.length-1; j++) {
                    for(int k=j+1; k<A.length; k++) {
                        if(A[i] + A[j] + A[k] == 0) {
                            Triplet triplet = new Triplet(A[i], A[j], A[k]);
                            triplets.add(triplet);
                        }
                    }
                }
            }
        }

        return triplets;
    }

    /**
     * Meilleure solution en O(n^2)
     * @param A
     * @return
     */
    public Set<Triplet> solution(final int[] A) {
        Set<Triplet> triplets = new HashSet<Triplet>();
        if(A.length > 3) {
            Arrays.sort(A);
            for (int i = 0; i < A.length - 2; i++) {
                int start = i + 1;
                int end = A.length - 1;
                while (start < end) {
                    if (A[i] + A[start] + A[end] == 0) {
                        Triplet triplet = new Triplet(A[i], A[start], A[end]);
                        triplets.add(triplet);
                        start++;
                        end--;
                    } else {
                        if (A[i] + A[start] + A[end] < 0) {
                            start++;
                        }
                        else {
                            end--;
                        }
                    }
                }
            }
        }
        return triplets;
    }

}
