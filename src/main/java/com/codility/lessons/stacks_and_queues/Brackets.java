package com.codility.lessons.stacks_and_queues;

import java.util.Stack;

public class Brackets {

    public int solution(final String S) {
        int solution = 1;

        Stack<Character> stack = new Stack<Character>();
        if(S != null && S.length() >= 0) {
            for(int i=0; i<S.length(); ++i) {
                char c = S.charAt(i);

                if(isOpeningChar(c)) {
                    stack.push(c);
                }
                else if(isClosingChar(c)) {
                    if(stack.isEmpty()) {
                        solution = 0;
                        break;
                    }
                    char lastOpeningChar = stack.pop();
                    char expectedLastOpeningChar = getExpectedOpeningChar(c);
                    if(lastOpeningChar != expectedLastOpeningChar) {
                        solution = 0;
                        break;
                    }
                }
                else {
                    solution = 0;
                    break;
                }
            }
        }

        if (! stack.isEmpty()) {
            solution = 0;
        }

        return solution;
    }

    private char getExpectedOpeningChar(final char c) {
        char openingChar = 0;
        switch(c) {
            case '}' : openingChar = '{'; break;
            case ']' : openingChar = '['; break;
            case ')' : openingChar = '('; break;
        }
        return openingChar;
    }

    private boolean isOpeningChar(final char c) {
        return c == '{' || c == '[' || c == '(';
    }

    private boolean isClosingChar(final char c) {
        return c == '}' || c == ']' || c == ')';
    }

}
