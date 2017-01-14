package com.cracking_the_coding_itw.arrays_and_strings;

import org.junit.Assert;
import org.junit.Test;

import com.craking_the_coding_itw.arrays_and_strings.Rotation;

public class RotationTest {

    private Rotation rotation = new Rotation();

    @Test
    public void rotation_test() {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        boolean isRotation = rotation.solution(s1, s2);
        Assert.assertTrue(isRotation);
    }

    @Test
    public void no_rotation_test() {
        String s1 = "waterbottle";
        String s2 = "erbottleaat";
        boolean isRotation = rotation.solution(s1, s2);
        Assert.assertFalse(isRotation);
    }

}
