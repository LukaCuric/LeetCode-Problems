package com.company;

public class Main {

    public static void main(String[] args) {
	    String s = "Hello world";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String[] field = s.split(" ");

        return field[field.length-1].length();
    }
}
