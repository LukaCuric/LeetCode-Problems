package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] nums = {3,3};
        int target = 6;
        twoSum(nums, target);
    }

    public static void twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    a[0] = i;
                    a[1] = j;
                    break;
                }
            }

            if(a[0] != 0 || a[1] != 0) {
                break;
            }
        }

        for (int k = 0; k < 2; k++) {
            System.out.print(a[k] + " ");
        }
    }
}
