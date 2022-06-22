package com.company;

public class Main {

    public static void main(String[] args) {
	    int a = 123;
        System.out.println(numberOfSteps(a));
    }

    public static int numberOfSteps(int num) {
        int number = 0;

        while (num > 0) {
            if(num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            number++;
        }

        return number;
    }
}
