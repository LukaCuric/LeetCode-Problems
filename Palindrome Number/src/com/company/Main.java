package com.company;

public class Main {

    public static void main(String[] args) {
	    int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        String num = Integer.toString(x);

        for (int i = 0; i < num.length()/2; i++) {
            if(num.charAt(i) != num.charAt(num.length()-i-1)) {
                return false;
            }
        }

        return true;
    }
}
