package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] prices = {1,2};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int maxProfit = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                int profit = prices[i] - min;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }
}
