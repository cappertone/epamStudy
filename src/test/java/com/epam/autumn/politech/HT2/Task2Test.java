package com.epam.autumn.politech.HT2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

       @Test
    public void printArray() {
           Task2 modifier = new Task2();
           int[] arr1 = {3,2,2,3};
           int value1 = 3;
           int[] arr1out = {2,2};
           int[] arr2 = {0,1,2,2,3,0,4,2};
           int value2 = 2;
           int[] arr2out = {0,1,3,0,4};

          // assertEquals(modifier.printArray(arr1,value1),arr1out);

    }
}