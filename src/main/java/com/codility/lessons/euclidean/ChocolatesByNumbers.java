package com.codility.lessons.euclidean;

public class ChocolatesByNumbers {

    /**
     * Solution en O(log(N+M)) en utilisant le gcd (plus grand commun diviseur - PGCD)
     * @param N
     * @param M
     * @return
     */
    public int solution(final int N, final int M) {
        int lcm = N / gcd(N, M);
        return lcm;
    }

    private int gcd(final int a, final int b) {
        int tmp = a%b;
        if(tmp == 0) {
            return b;
        }
        return gcd(b, tmp);
    }

    /**
     * solution en O(N+M)
     * @param N
     * @param M
     * @return
     */
    public int trivialSolution(final int N, final int M) {
        int solution = 0;
        int i=0;
        int[] chocolatesEaten = new int[N];

        while(chocolatesEaten[i] == 0) {
            solution++;
            chocolatesEaten[i] = 1;
            i=(i+M)%N;
        }

        return solution;
    }

}
