package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        list2.add(1);
        list2.add(3);
        list2.add(4);
        System.out.println(mergeTwoLists(list1,list2));
    }

    public static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {

        List<Integer> list3 = new ArrayList<>();
        int size = list1.size() + list2.size();
        int i = 0;
        int j = 0;

        while(i + j < size) {
            if (i >= list1.size()) {
                list3.add(list2.get(j));
                j++;
            } else if (j >= list2.size()) {
                list3.add(list1.get(i));
                i++;
            } else if (list1.get(i) <= list2.get(j)) {
                list3.add(list1.get(i));
                i++;
            } else if (list2.get(j) <= list1.get(i)) {
                list3.add(list2.get(j));
                j++;
            }
        }

        return list3;
    }
}
