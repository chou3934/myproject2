package com.bob;

public class ScoringNG {
    public static void main(String[] args) {
        int[] english={55,60,74,34,90};
        int[] math={90,54,37,61,81};
        String[] name={"Tommy","Betty","Kate","Emma","Bella"};
        for (int i = 0; i < 5; i++) {
            System.out.println(name[i]+"\t"+english[i]+"\t"+math[i]+"\t"+((english[i]+math[i])/2));
        }

    }
}
