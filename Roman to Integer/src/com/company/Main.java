package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite rimski broj: ");
        String s = scanner.nextLine();
        int a = 0;
        boolean iPovecan;

        for (int i = 0; i < s.length(); i++) {
            iPovecan = false;
            if(i < s.length() - 1) {
                if(s.charAt(i) == 'I' && s.charAt(i+1) == 'V') {
                    a += 4;
                    iPovecan = true;
                }
                if(s.charAt(i) == 'I' && s.charAt(i+1) == 'X') {
                    a += 9;
                    iPovecan = true;
                }
                if(s.charAt(i) == 'X' && s.charAt(i+1) == 'L') {
                    a += 40;
                    iPovecan = true;
                }
                if(s.charAt(i) == 'X' && s.charAt(i+1) == 'C') {
                    a += 90;
                    iPovecan = true;
                }
                if(s.charAt(i) == 'C' && s.charAt(i+1) == 'D') {
                    a += 400;
                    iPovecan = true;
                }
                if(s.charAt(i) == 'C' && s.charAt(i+1) == 'M') {
                    a += 900;
                    iPovecan = true;
                }
            }

            if(!iPovecan) {
                switch (s.charAt(i)) {
                    case 'I':
                        a += 1;
                        break;
                    case 'V':
                        a += 5;
                        break;
                    case 'X':
                        a += 10;
                        break;
                    case 'L':
                        a += 50;
                        break;
                    case 'C':
                        a += 100;
                        break;
                    case 'D':
                        a += 500;
                        break;
                    case 'M':
                        a += 1000;
                        break;
                    default:
                        break;
                }
            }

            if(iPovecan)
                i++;
            if(i >= s.length() - 1)
                break;
        }

        System.out.println(a);
    }
}
