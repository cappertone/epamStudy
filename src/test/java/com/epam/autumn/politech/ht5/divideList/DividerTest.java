package com.epam.autumn.politech.ht5.divideList;

import com.epam.autumn.politech.ht5.rotation.ListRotator;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class DividerTest {
    Divider divider = new Divider();
    LinkedList<Integer> inputList;
    LinkedList<Integer>expectedList;
    int key;


    @Test
    public void divide_TestTrue() {
        Integer[]arr = {1,4,3,2,5,2};
        Integer[]exp = {1,2,2,4,3,5};
        inputList = new LinkedList<>(Arrays.asList(arr));
        expectedList= new LinkedList<>(Arrays.asList(exp));
        key = 3;
        divider.divide(inputList,key);
        assertEquals(inputList,expectedList);
    }
    @Test
    public void divide_TestEmpty() {
        Integer[]arr = {};
        Integer[]exp = {};
        inputList = new LinkedList<>(Arrays.asList(arr));
        expectedList= new LinkedList<>(Arrays.asList(exp));
        key = 1;
        divider.divide(inputList,key);
        assertEquals(inputList,expectedList);
    }
    @Test(expected=NullPointerException.class)
    public void divide_TestNull() {
        inputList = null;
        key =5;
        divider.divide(inputList,key);
        fail();
    }
}