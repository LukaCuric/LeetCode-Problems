package com.company;

public class Main {

    public static void main(String[] args) {
	    int x = 1;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        double t;
        double sqrtroot = x / 2;

        if(x == 0)
            return 0;
        if(x == 1)
            return 1;

        do {
            t = sqrtroot;
            sqrtroot = (t+(x/t))/2;
        } while((t-sqrtroot) != 0);

        return (int)sqrtroot;
    }
}
