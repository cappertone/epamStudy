package com.epam.autumn.politech.HT2;

public class Task2 {

    public  int modifyArray(int[] arr) {
        int length = arr.length;
        int modifiedLength = length;
        for (int i = 0; i < length; ++i) {
            if (length == arr[i]) {
                modifiedLength--;
                continue;
            }
               i++;
        }
        return modifiedLength;
    }

    public  void printArray(int []arr, int value){

        for (int i = 0; i <=modifyArray(arr); i++) {
            if (value != arr[i]) {
                System.out.print(arr[i]);
            }
                arr[i] = arr[i+1];
        }
        System.out.println();
    }
}
