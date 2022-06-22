package com.company;

public class Main {

    public static void main(String[] args) {
	    String s = "([])";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {

        while(s.contains("()") || s.contains("[]") || s.contains("{}")) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            }
            if (s.contains("[]")) {
                s = s.replace("[]", "");
            }
            if (s.contains("{}")) {
                s = s.replace("{}", "");
            }
        }

        if(s.length() != 0) {
            return false;
        } else {
            return true;
        }
    }
}
