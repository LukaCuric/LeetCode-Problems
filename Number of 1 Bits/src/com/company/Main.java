package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    int n = 15;
        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n) {
        int result = 0;
        while(n != 0) {
            result += (n % 2) & 1;
            n >>>= 1;
        }
        return result;
    }
}
