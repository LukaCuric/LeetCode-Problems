package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int i;
        for (i = 0; i < nums.length; i++) {
            if(nums[i] >= target) {
                return i;
            }
        }

        return i;
    }
}
