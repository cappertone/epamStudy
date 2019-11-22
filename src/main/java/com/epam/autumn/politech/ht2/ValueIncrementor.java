package com.epam.autumn.politech.ht2;

import java.util.Arrays;

public class ValueIncrementor {

    public int[] increment(int[] value) {
        for (int i = value.length - 1; i >0; i--) {
            if (++value[i] < 10) {
                return value;
            }
        }
        value = new int[value.length + 1];
        value[0] = 1;
        return value;
    }
}
