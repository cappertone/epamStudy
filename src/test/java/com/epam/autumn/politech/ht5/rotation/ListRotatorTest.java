package com.epam.autumn.politech.ht5.rotation;

import com.epam.autumn.politech.ht5.ListRotator;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class ListRotatorTest {
    ListRotator listRotator = new ListRotator();
    LinkedList<Integer> inputList;
    LinkedList<Integer>expectedList;
    int k;

    @Test
    public void rotate_TestTrue() {
        Integer[]arr = {1,2,3,4,5};
        Integer[]exp = {4,5,1,2,3};
        inputList = new LinkedList<>(Arrays.asList(arr));
        expectedList= new LinkedList<>(Arrays.asList(exp));
        k = 2;
        listRotator.rotate(inputList, k);
        assertEquals(inputList,expectedList);
    }
    @Test
    public void rotate_TestEmpty() {
        Integer[]arr = {};
        Integer[]exp = {};
        inputList = new LinkedList<>(Arrays.asList(arr));
        expectedList= new LinkedList<>(Arrays.asList(exp));
        k = 3;
        listRotator.rotate(inputList, k);
        assertEquals(inputList,expectedList);
    }
    @Test
    public void rotate_TestNull() {
        inputList = null;
        expectedList=null;
        k = 3;
        listRotator.rotate(inputList, k);
        assertEquals(inputList,expectedList);
    }
}