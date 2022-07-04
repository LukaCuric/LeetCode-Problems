package com.company;

public class Main {

    public static void main(String[] args) {
	    int columnNumber = 654;
        System.out.println(convertToTitle(columnNumber));
    }

    public static String convertToTitle(int columnNumber) {
        String title = "";

        while(columnNumber > 0) {
            int c = (columnNumber - 1) % 26;

            switch(c) {
                case 0: title = "A" + title; break;
                case 1: title = "B" + title; break;
                case 2: title = "C" + title; break;
                case 3: title = "D" + title; break;
                case 4: title = "E" + title; break;
                case 5: title = "F" + title; break;
                case 6: title = "G" + title; break;
                case 7: title = "H" + title; break;
                case 8: title = "I" + title; break;
                case 9: title = "J" + title; break;
                case 10: title = "K" + title; break;
                case 11: title = "L" + title; break;
                case 12: title = "M" + title; break;
                case 13: title = "N" + title; break;
                case 14: title = "O" + title; break;
                case 15: title = "P" + title; break;
                case 16: title = "Q" + title; break;
                case 17: title = "R" + title; break;
                case 18: title = "S" + title; break;
                case 19: title = "T" + title; break;
                case 20: title = "U" + title; break;
                case 21: title = "V" + title; break;
                case 22: title = "W" + title; break;
                case 23: title = "X" + title; break;
                case 24: title = "Y" + title; break;
                case 25: title = "Z" + title; break;
            }

            columnNumber = (columnNumber - 1) / 26;
        }

        return title;
    }
}
