package com.epam.autumn.politech.ht5;

public class ArrayToBTSConverter {

    public  class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            value = x;
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
}
