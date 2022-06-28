package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    int n = 44;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        int[] dp = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            dp[i] = -1;
        }
        fib(n,dp);
        return dp[n];
    }

    public static int fib(int n, int dp[]) {
        if(n <= 1) {
            return dp[n] = 1;
        }

        if(dp[n] != -1) {
            return dp[n];
        }
        dp[n] = fib(n-1, dp) + fib(n-2, dp);
        return dp[n];
    }
}
