package com.codility;

import java.util.Arrays;

public class IntersectingDiscs {

    /*
     * We draw N discs on a plane. The discs are numbered from 0 to N − 1. A zero-indexed array A of N non-negative integers, specifying the radiuses of the discs, is given. The J-th disc is drawn with its center at (J, 0) and radius A[J].
       We say that the J-th disc and K-th disc intersect if J ≠ K and the J-th and K-th discs have at least one common point (assuming that the discs contain their borders).

       The figure below shows discs drawn for N = 6 and A as follows:

         A[0] = 1
         A[1] = 5
         A[2] = 2
         A[3] = 1
         A[4] = 4
         A[5] = 0


       There are eleven (unordered) pairs of discs that intersect, namely:

       discs 1 and 4 intersect, and both intersect with all the other discs;
       disc 2 also intersects with discs 0 and 3.
       Write a function:

       int solution(int A[], int N);

       that, given an array A describing N discs as explained above, returns the number of (unordered) pairs of intersecting discs. The function should return −1 if the number of intersecting pairs exceeds 10,000,000.

       Given array A shown above, the function should return 11, as explained above.

       Assume that:

       N is an integer within the range [0..100,000];
       each element of array A is an integer within the range [0..2,147,483,647].
       Complexity:

       expected worst-case time complexity is O(N*log(N));
       expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
       Elements of input arrays can be modified.
     */
    /**
     * Solution en complexité O(n^2)
     * @param A
     * @return
     */
    public int intersectingDiscs(final int[] A) {
        long solution = 0;

        for(int i=0; i<A.length-1; ++i) {
            for(int j=i+1; j<A.length; ++j) {
                // Intersection
                if((long) i+ (long) A[i] >= (long) j- (long) A[j]) {
                    solution++;
                }
                if(solution > 10000000) {
                    break;
                }
            }
            if(solution > 10000000) {
                solution = -1;
                break;
            }
        }

        return (int) solution;
    }

    /**
     * Solution en O(N*log(N))
     * @param A
     * @return
     */
    public static int intersectingDiscsOptimization(final int[] A){
        int l = A.length;

        long[] A1 = new long[l];
        long[] A2 = new long[l];

        for(int i = 0; i < l; i++){
            A1[i] = (long)A[i] + i;
            A2[i] = -((long)A[i]-i);
        }

        Arrays.sort(A1);
        Arrays.sort(A2);

        long cnt = 0;

        for(int i = A.length - 1; i >= 0; i--){
            int pos = Arrays.binarySearch(A2, A1[i]);
            if(pos >= 0){
                while(pos < A.length && A2[pos] == A1[i]){
                    pos++;
                }
                cnt += pos;
            } else{ // element not there
                int insertionPoint = -(pos+1);
                cnt += insertionPoint;
            }
        }

        long sub = l*((long)l+1)/2;
        cnt = cnt - sub;

        if(cnt > 1e7) {
            return -1;
        }

        return (int) cnt;
    }
}
