package com.epam.autumn.politech.HT2;

import java.util.Arrays;

public class Task4 {

    public int[] increment(int[] val) {
        for (int i = val.length - 1; i >= 0; i--) {
            if (++val[i] < 10) {
                return val;
            }
        }
        val = new int[val.length + 1];
        val[0] = 1;
        return val;
    }
}
