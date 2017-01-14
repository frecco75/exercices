package com.codility.lessons.stacks_and_queues;

import java.util.Stack;

public class StoneWall {

    public int solution(final int[] H) {
        int solution = 0;
        Stack<Integer> stack = new Stack<Integer>();

        for(int i=0; i<H.length; ++i) {
            int h = H[i];
            int lastH = stack.isEmpty() ? 0 : stack.peek();

            while(! stack.isEmpty() && lastH > h) {
                stack.pop();
                lastH = stack.isEmpty() ? 0 : stack.peek();
            }
            if(! stack.isEmpty() && lastH == h) {
                continue;
            }
            else {
                solution++;
                stack.push(h);
            }
        }
        return solution;
    }


    public int codilitySolution(final int[] H) {
        int solution = 0;
        int stack_num = 0;
        int[] stack = new int[H.length];

        for(int i=0; i<H.length; ++i) {
            while(stack_num > 0 && stack[stack_num - 1] > H[i]) {
                stack_num--;
            }
            if(stack_num > 0 && stack[stack_num - 1] == H[i]) {
                continue;
            }
            else {
                solution++;
                stack[stack_num] = H[i];
                stack_num++;
            }
        }
        return solution;
    }

}
