package com.craking_the_coding_itw.arrays_and_strings;

/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0.
 *
 * @author fabienrecco
 *
 */
public class MatrixSet0 {

    /**
     * solution en O(n^2)
     * @param matrix
     */
    public void set0(final int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] rows = new boolean[m];
        boolean[] columns = new boolean[n];

        // We check where are the 0, and with columns and rows has to be set to 0
        for(int i=0; i<m; ++i) {
            for(int j=0; j<n; ++j) {
                if(matrix[i][j] == 0) {
                    rows[i] = true;
                    columns[j] = true;
                }
            }
        }

        // We set rows to 0
        for(int i=0; i<m; ++i) {
            if(rows[i]) {
                for(int j=0; j<n; ++j) {
                    matrix[i][j] = 0;
                }
            }
        }

        // We set columns to 0
        for(int i=0; i<n; ++i) {
            if(columns[i]) {
                for(int j=0; j<m; ++j) {
                    matrix[j][i] = 0;
                }
            }
        }

    }

}
