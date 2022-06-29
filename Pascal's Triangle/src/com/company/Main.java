package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    int numRows = 5;
        System.out.println(generate(numRows));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        int[] array;
        int[] array2 = new int[0];
        boolean needsFilling = false;

        for (int i = 1; i <= numRows; i++) {
            array = new int[i];
            array[0] = 1;
            array[i-1] = 1;

            for (int j = 0; j < i; j++) {
                if(array[j] == 0) {
                    needsFilling = true;
                }
            }

            if(needsFilling) {
                for (int k = 1; k < array.length-1; k++) {
                    if(array[k] == 0) {
                        array[k] = array2[k-1] + array2[k];
                    }
                }
                needsFilling = false;
            }

            if(!needsFilling) {
                List<Integer> list = new ArrayList<>();
                for (int k = 0; k < i; k++) {
                    list.add(array[k]);
                }
                lists.add(list);
            }

            array2 = array;
        }

        return lists;
    }
}
