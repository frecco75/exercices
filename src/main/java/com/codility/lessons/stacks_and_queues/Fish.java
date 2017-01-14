package com.codility.lessons.stacks_and_queues;

import java.util.Stack;

public class Fish {

    public int solution(final int[] A, final int[] B) {
        Stack<Integer> s = new Stack<Integer>();

        for(int i = 0; i < A.length; i++){
            int size = A[i];
            int dir = B[i];
            while(! s.empty() && dir - B[s.peek()] == -1 && A[s.peek()] < size){
                s.pop();
            }
            if(s.empty() || dir - B[s.peek()] != -1) {
                s.push(i);
            }
        }
        return s.size();
    }

}
