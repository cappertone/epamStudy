package com.epam.autumn.politech.ht2;

import java.util.Arrays;

public class DuplicateVerifier {
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
