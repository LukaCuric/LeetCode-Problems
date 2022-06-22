package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] nums = {1,1};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int k = 0;

        if(nums.length == 1)
            return 1;

        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] != nums[i+1]) {
                nums[k++] = nums[i];
            }
            if(i == nums.length-2 && k > 0) {
                if(nums[k-1] != nums[i+1]) {
                    nums[k++] = nums[++i];
                }
            }
        }

        if(nums.length > 1 && k == 0)
            return 1;

        return k;
    }
}
