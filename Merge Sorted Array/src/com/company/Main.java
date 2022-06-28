package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] nums1 = {};
        int[] nums2 = {1};
        int m = 0;
        int n = 1;
        merge(nums1,m,nums2,n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;

        if(nums1.length == 0) {
            nums1 = nums2;
        } else {
            for (int i = m; i < m + n; i++) {
                nums1[i] = nums2[j++];
            }
        }

        for (int i = 0; i < m+n; i++) {
            for (int k = 0; k < m+n-1; k++) {
                if(nums1[k] > nums1[k+1]) {
                    int pom = nums1[k];
                    nums1[k] = nums1[k+1];
                    nums1[k+1] = pom;
                }
            }
        }

        for (int i = 0; i < m+n; i++)
            System.out.println(nums1[i]);
    }
}
