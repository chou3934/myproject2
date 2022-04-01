package com.bob;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(1000);
        list.add(1500);

        System.out.println(list);
        int a=list.get(1);
        System.out.println(a);

    }
}
