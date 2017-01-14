package com.crt;

public class RansomNote {

    /* You need to write a ransom note by cutting letters out of the available
     * magazines and pasting them together to form a letter. Given an arbitrary
     * ransom note string and another string containing all the contents of all
     * the magazines, write a function that will return true if the ransom
     * note can be made from the magazines; otherwise, it will return false.
     * Every letter found in the magazine string can only be used once in your
     * ransom note.
     */
    public boolean canBeBuilt(final String note, final String mag) {
        int[] count = new int[mag.length()];

        boolean check = true;
        for(int i=0; i<note.length(); ++i) {
            char c = note.charAt(i);

            boolean contains = false;
            for(int j=0; j<mag.length(); ++j) {
                char m = mag.charAt(j);
                if(m == c && count[j] == 0) {
                    contains = true;
                    count[j]++;
                    break;
                }
            }

            if(! contains) {
                check = false;
                break;
            }
        }
        return check;
    }





    public boolean canBeBuilt(final char[] ransomNote, final char[] magazine) {
        boolean check = true;
        for(char c : ransomNote) {
            if(! array_contains(magazine, c)) {
                check = false;
                break;
            }
        }
        return check;
    }

    private boolean array_contains(final char[] magazine, final char c) {
        boolean contains = false;
        for(char m : magazine) {
            if(m == c) {
                contains = true;
                break;
            }
        }
        return contains;
    }

}
