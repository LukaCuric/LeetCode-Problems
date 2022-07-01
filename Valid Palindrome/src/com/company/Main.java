package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String palindrome = "";
        s = s.toLowerCase();

        for(int i = 0; i < s.length(); i++) {
            if((s.charAt(i) >= 48 && s.charAt(i) <= 57) || (s.charAt(i) >= 97 && s.charAt(i) <= 122)) {
                palindrome += s.charAt(i);
            }
        }

        for(int i = 0; i < palindrome.length()/2; i++) {
            if(palindrome.charAt(i) != palindrome.charAt(palindrome.length()-i-1)) {
                return false;
            }
        }

        return true;
    }
}
