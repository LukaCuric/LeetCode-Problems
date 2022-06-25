package com.company;

public class Main {

    public static void main(String[] args) {
	    String haystack = "hello";
        String needle = "";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if(haystack.indexOf(needle) >= 0) {
            return haystack.indexOf(needle);
        } else {
            return -1;
        }
    }
}
