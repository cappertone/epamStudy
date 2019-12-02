package com.epam.autumn.politech.ht5;

public class DupRemover {

    public  int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[count]) {
                count++;
                nums[count] = nums[j];
            }
        }
        return count + 1;
    }

    public  void printresult(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
