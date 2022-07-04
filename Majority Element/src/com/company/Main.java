package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	    int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {

        if(nums.length == 1) {
            return nums[0];
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : nums) {
            if(map.containsKey(i) && map.get(i) + 1 > nums.length / 2) {
                return i;
            } else {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }

        return -1;
    }
}
