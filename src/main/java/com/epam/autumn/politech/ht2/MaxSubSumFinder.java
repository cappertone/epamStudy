package com.epam.autumn.politech.ht2;

public class MaxSubSumFinder {

    public  int maxSubArraySumKagane(int[] array) {
        if (array.length <= 0) {
            return 0;
        }
        int tempSum = array[0];
        int sumMax = array[0];
        for (int i = 1; i < array.length; i++) {
            tempSum = Math.max(array[i], tempSum + array[i]);
            sumMax = Math.max(sumMax, tempSum);
        }
        return sumMax;
    }

    public int maxCrossingSum(int[] arr, int start, int middle, int end){
        int sum = 0;
        int left_sum = Integer.MIN_VALUE;
        for (int i = middle; i >= start; i--){
            sum = sum + arr[i];
            if (sum > left_sum) {
                left_sum = sum;
            }
        }
        sum = 0;
        int right_sum = Integer.MIN_VALUE;
        for (int i = middle + 1; i <= end; i++){
            sum = sum + arr[i];
            if (sum > right_sum) {
                right_sum = sum;
            }
        }
        return left_sum + right_sum;
    }

    public int maxSubArraySum(int[] arr, int start, int end){
        if (arr.length ==0){
            return 0;
        }else if (start == end) {
            return arr[start];
        }
        int m = (start + end)/2;
        return Math.max(Math.max(maxSubArraySum(arr, start, m), maxSubArraySum(arr, m+1, end)), maxCrossingSum(arr, start, m, end));
    }
}
