package com.epam.autumn.politech.HT2;

import java.util.Arrays;

public class Task5 {
    public boolean containDuplicate(int [] array){
        Arrays.sort(array);
        for (int index = 0; index < array.length-1; index++) {
           if(array[index] == array[++index]){
               return true;
           }
        }
        return false;
    }
}
