package com.crt;

public class Sorter {

    // Bubble sort
    //-----------------------------------------------------------

    /**
     * Tri à bulles : complexité en O(n^2)
     * Start at the beginning of an array and swap the first two elements if the first is bigger than the second.
     * Go to the next pair, etc, continuously making sweeps of the array until sorted.
     * @param A array to sort
     */
    public void bubbleSort(final int[] A) {
        if(A != null && A.length > 1) {
            for(int i=1; i<A.length-1; ++i) {
                for(int j=0; j<A.length-i; ++j) {
                    if(A[j] > A[j+1]) {
                        exchange(A, j, j+1);
                    }
                }
            }
        }
    }

    // Selection sort
    //-----------------------------------------------------------

    /**
     * Tri par insertion : complexité en O(n^2)
     * Find the smallest element using a linear scan and move it to the front.
     * Then, find the second smallest and move it, again doing a linear scan. Continue doing this until all elements are in place.
     * @param A array to sort
     */
    public void selectionSort(final int[] A) {
        if(A != null && A.length > 1) {
            for(int i=0; i<A.length; ++i) {
                int min_indice = i;
                for(int j=i+1; j<A.length; ++j) {
                    if(A[min_indice] > A[j]) {
                        min_indice = j;
                    }
                }
                exchange(A, i, min_indice);
            }
        }
    }

    // Merge sort
    //-----------------------------------------------------------

    /**
     * Tri fusion : complexité en O(n log(n)) au pire.
     * Sort each pair of elements. Then, sort every four elements by merging every two pairs. Then, sort every 8 elements etc.
     * @param A array to sort
     */
    public void mergeSort(final int[] A) {
        if(A != null && A.length > 1) {
            int[] tmp = new int[A.length];
            merge(A, tmp, 0, A.length-1);
        }
    }

    private void merge(final int[] A, final int[] tmp, final int lowerIndex, final int higherIndex) {
        if(lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            merge(A, tmp, lowerIndex, middle);
            merge(A, tmp, middle + 1, higherIndex);
            merge(A, tmp, lowerIndex, middle, higherIndex);
        }
    }

    private void merge(final int[] A, final int[] tmp, final int lowerIndex, final int middle, final int higherIndex) {
        for (int i=lowerIndex; i<=higherIndex; ++i) {
            tmp[i] = A[i];
        }

        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while(i <= middle && j <= higherIndex) {
            if(A[i] < A[j]) {
                A[k] = tmp[i++];
            } else {
                A[k] = tmp[j++];
            }
            k++;
        }

        while(i <= middle) {
            A[k++] = tmp[i++];
        }
    }


    // Quick sort
    //-----------------------------------------------------------

    /**
     * Tri rapide : complexité en O(n log(n)) attendue, O(n^2) au pire
     * Pick a random element and partition the array, such that all numbers that are less than it come before all elements that are greater than it.
     * Then do that for each half, then each quarter etc..
     * @param A array to sort
     */
    public void quickSort(final int[] A) {
        quickSort(A, 0, A.length-1);
    }

    private void quickSort(final int[] A, final int begin, final int end) {
        int idx = partition(A, begin, end);

        if(begin < idx - 1) {
            quickSort(A, begin, idx - 1);
        }

        if(end > idx) {
            quickSort(A, idx, end);
        }
    }

    private int partition(final int[] A, final int begin, final int end) {
        int left = begin;
        int right = end;
        int pivot = A[left]; // taking first element as pivot
        while (left <= right) {
            while (A[left] < pivot) {
                left++;
             }
            while (A[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int tmp = A[left];
                A[left] = A[right];
                A[right] = tmp;
                left++;
                right--;
             }
        }
        return left;
    }


    // Private methods
    //-----------------------------------------------------------

    private void exchange(final int[] A, final int i, final int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

}
