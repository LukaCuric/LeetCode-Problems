package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    String[] strs = {"flow", "flow", "flow", "flow", "flow", "flow"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        String letter = "";
        boolean same;
        for (int i = 0; i < strs[0].length(); i++) {
            letter += Character.toString(strs[0].charAt(i));
            same = true;
            for (int j = 0; j < strs.length; j++) {

                if (!strs[j].startsWith(letter)) {
                    return prefix;
                }
            }

            if(same) {
                prefix = letter;
            }
        }

        return prefix;
    }
}
