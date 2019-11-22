package com.epam.autumn.politech.ht2;

import org.junit.Test;

public class DuplicateRemoverTest {

       @Test
    public void printArray() {
           DuplicateRemover modifier = new DuplicateRemover();
           int[] arr1 = {3,2,2,3};
           int value1 = 3;
           int[] arr1out = {2,2};
           int[] arr2 = {0,1,2,2,3,0,4,2};
           int value2 = 2;
           int[] arr2out = {0,1,3,0,4};

          // assertEquals(modifier.printArray(arr1,value1),arr1out);

    }
}