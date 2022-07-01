package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {

        int counter = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    counter++;
                    if(counter == 2) {
                        break;
                    }
                }
            }

            if(counter == 1) {
                return nums[i];
            }
            counter = 0;
        }

        return 0;
    }
}
