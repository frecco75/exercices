package com.crt;

import org.junit.Assert;
import org.junit.Test;

import com.crt.RansomNote;


public class RansomNoteTest {

    RansomNote ransomNote = new RansomNote();

    @Test
    public void checkTrue() {
        char[] ransomNote = new char[] { 'a', 'd', 'r' };
        char[] magazine = new char[] { 'a', 'b', 'c', 'd', 'r' };

        boolean canBeBuilt = this.ransomNote.canBeBuilt(ransomNote, magazine);
        Assert.assertTrue(canBeBuilt);
    }

    @Test
    public void checkFalse() {
        char[] ransomNote = new char[] { 'a', 'd', 'e', 'r' };
        char[] magazine = new char[] { 'a', 'b', 'c', 'd', 'r' };

        boolean canBeBuilt = this.ransomNote.canBeBuilt(ransomNote, magazine);
        Assert.assertFalse(canBeBuilt);
    }

    @Test
    public void checkTrue2() {
        String ransomNote = "ramsonnote";
        String magazine = "ramsonteno";

        boolean canBeBuilt = this.ransomNote.canBeBuilt(ransomNote, magazine);
        Assert.assertTrue(canBeBuilt);
    }

    @Test
    public void checkFalse2() {
        String ransomNote = "ramsonnote";
        String magazine = "ramsonte";

        boolean canBeBuilt = this.ransomNote.canBeBuilt(ransomNote, magazine);
        Assert.assertFalse(canBeBuilt);
    }

}
