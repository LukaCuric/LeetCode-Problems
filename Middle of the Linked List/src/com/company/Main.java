package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);

        for(int i = 0; i < a.size(); i++) {
            if(i >= a.size()/2) {
                System.out.print(a.get(i) + " ");
            }
        }
    }
}
