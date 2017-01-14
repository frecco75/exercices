package com.codility.lessons.stacks_and_queues;

import java.util.Stack;

public class Nesting {

    public int solution(final String S) {
        int solution = 1;

        Stack<Character> stack = new Stack<Character>();

        if(S != null && ! S.isEmpty()) {
            for(int i=0; i<S.length(); ++i) {
                char c = S.charAt(i);

                if(c == '(') {
                    stack.push(c);
                }
                else if(c == ')') {
                    if(stack.isEmpty()) {
                        solution = 0;
                        break;
                    }
                    stack.pop();
                }
                else {
                    solution = 0;
                    break;
                }
            }
        }

        if(! stack.isEmpty()) {
            solution = 0;
        }

        return solution;
    }

}
