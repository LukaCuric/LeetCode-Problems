package com.company;

import javax.xml.stream.events.Characters;

public class Main {

    public static void main(String[] args) {
	    int[] digits = {9,9,9,9};
        int[] field = plusOne(digits);
        for (int i = 0; i < field.length; i++)
            System.out.print(field[i] + " ");
    }

    public static int[] plusOne(int[] digits) {
        boolean increasedAllNumbers = true;

        if(digits[digits.length-1] + 1 < 10) {
            digits[digits.length-1] += 1;
            increasedAllNumbers = false;
        } else {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] + 1 != 10) {
                    digits[i] += 1;
                    increasedAllNumbers = false;
                    break;
                } else {
                    digits[i] = 0;
                }
            }
        }

        if(increasedAllNumbers) {
            int[] field = new int[digits.length + 1];
            field[0] = 1;
            for (int j = 1; j < field.length; j++)
                field[j] = digits[j-1];

            return field;
        }

        return digits;
    }
}
