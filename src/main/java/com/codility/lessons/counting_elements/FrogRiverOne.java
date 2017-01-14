package com.codility.lessons.counting_elements;

public class FrogRiverOne {

    public int solution(final int X, final int[] A) {
        int second = -1;
        if(A.length > 0) {
            int[] leafs = new int[X];
            int temp = 0;
            for(int i=0; i<A.length; ++i) {
                int leaf = A[i];
                if(leaf <= X) {
                    if(leafs[leaf-1] == 0) {
                        leafs[leaf-1] = 1;
                        temp++;
                    }
                }
                if(temp == X) {
                    second = i;
                    break;
                }
            }
        }
        return second;
    }

}
