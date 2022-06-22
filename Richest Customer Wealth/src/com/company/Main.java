package com.company;

public class Main {

    public static void main(String[] args) {
	    int[][] a = {{2,8,7}, {7,1,3}, {1,9,5}};
        System.out.println(maximumWealth(a));
    }

    public static int maximumWealth(int[][] accounts) {
        int rows = accounts.length;
        int sum = 0;
        int max = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < accounts[0].length; j++) {
                sum += accounts[i][j];
            }
            if(sum < max) {
                sum = 0;
            } else if (i == 0) {
                max = sum;
                sum = 0;
            } else {
                max = sum;
                sum = 0;
            }
        }

        return max;
    }
}
