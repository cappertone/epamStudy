package com.epam.autumn.politech.ht5.toBTSConverter;

import java.util.Collections;

public class ArrayToBTSConverter {

    public  class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public TreeNode sortedArrayToBST(int[] nums) {
        return nodeMaker(nums, 0, nums.length - 1);
    }

    public TreeNode nodeMaker(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int middle = (start + end) / 2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = nodeMaker(nums, start, middle - 1);
        node.right = nodeMaker(nums, middle + 1, end);
        return node;
    }
    public void printSorted(int[] arr, int start,
                                    int end) {
        if(start > end)
            return;

        // print left subtree
        printSorted(arr, start*2 + 1, end);

        // print root
        System.out.print(arr[start] + " ");

        // print right subtree
        printSorted(arr, start*2 + 2, end);
    }
}
