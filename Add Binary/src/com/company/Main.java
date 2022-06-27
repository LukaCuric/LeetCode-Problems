package com.company;

public class Main {

    public static void main(String[] args) {
	    String a = "1101";
        String b = "101";
        System.out.println(addBinary(a,b));
    }

    public static String addBinary(String a, String b) {
        String c = "";
        int i = 0;
        int j = 0;

        if(a.length() > b.length()) {
            while (a.length() > b.length())
                b = "0" + b;
        } else {
            while (b.length() > a.length())
                a = "0" + a;
        }

        int pomak = 0;
        while(i < a.length()) {
            if(Character.toString(a.charAt(a.length()-i-1)).equals("0") && Character.toString(b.charAt(b.length()-j-1)).equals("0")) {
                if(pomak == 1) {
                    c = "1" + c;
                } else {
                    c = "0" + c;
                }
                pomak = 0;
            } else if (Character.toString(a.charAt(a.length()-i-1)).equals("1") && Character.toString(b.charAt(b.length()-j-1)).equals("0")) {
                if(pomak == 1) {
                    c = "0" + c;
                } else {
                    c = "1" + c;
                    pomak = 0;
                }
            } else if (Character.toString(a.charAt(a.length()-i-1)).equals("0") && Character.toString(b.charAt(b.length()-j-1)).equals("1")) {
                if(pomak == 1) {
                    c = "0" + c;
                } else {
                    c = "1" + c;
                    pomak = 0;
                }
            } else {
                if(pomak == 1) {
                    c = "1" + c;
                } else {
                    c = "0" + c;
                    pomak = 1;
                }
            }

            i++;
            j++;
        }

        if(pomak == 1)
            c = "1" + c;

        return c;
    }
}
