package com.crt;

public class Triplet {

    private int i;
    private int j;
    private int k;

    public Triplet(final int i, final int j, final int k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + i;
        result = prime * result + j;
        result = prime * result + k;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Triplet other = (Triplet) obj;
        if (i != other.i) {
            return false;
        }
        if (j != other.j) {
            return false;
        }
        if (k != other.k) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Triplet [i=" + i + ", j=" + j + ", k=" + k + "]";
    }

}
