package com.epam.autumn.politech.ht6;

import java.util.HashMap;
import java.util.Map;

 class DuplicateDifference {

     boolean duplicateDistance(int[] nums, int key) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer duplicate = map.put(nums[i], i);
            if (duplicate != null && i - duplicate <= key) {
                return true;
            }
        }
        return false;
    }
}
