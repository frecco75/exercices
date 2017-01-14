package com.crt;

public class FizzBuzz {

    /**
     * Fizz buzz is a group word game for children to teach them about division.
     * [1] Players take turns to count incrementally, replacing any number divisible by three with the word "fizz",
     * and any number divisible by five with the word "buzz".
     *
     * Example :
     * 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz, ...
     * @param n
     * @return
     */
    public String fizzBuzz(final int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; ++i) {
            String temp = "";
            if(i%3 == 0) {
                temp += "Fizz";
            }
            if(i%5 == 0) {
                if(temp.length() > 0) {
                    temp += " ";
                }
                temp += "Buzz";
            }
            if(temp.length() == 0) {
                temp = "" + i;
            }

            sb.append(temp);

            if(i < n) {
                sb.append(", ");
            }
        }

        return sb.toString();

    }

}
