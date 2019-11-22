package com.epam.autumn.politech.ht2;
import java.util.Arrays;

public class SubArrayFinder {

    public  int[] findSumSubarray(int[] nums, int target) {
        int[] n = nums.clone();
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                return new int[]{findIndex(n, nums[left]), findIndex(n, nums[right])};
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }

    public  int findIndex(int[] arr, int element) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (element == (arr[i])) {
                index = i;
                break;
            }
        }
        return index;
    }
}
