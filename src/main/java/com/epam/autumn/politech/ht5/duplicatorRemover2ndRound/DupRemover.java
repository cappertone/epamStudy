package com.epam.autumn.politech.ht5.duplicatorRemover2ndRound;

import java.util.Arrays;

public class DupRemover {

    public  int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public  void printresult(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
    }


}
