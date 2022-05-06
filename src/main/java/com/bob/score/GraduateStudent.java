package com.bob.score;

import com.bob.score.Student;

public class GraduateStudent extends Student {
    int thesis;
    public GraduateStudent(String name,int english,int math,int thesis) {
        super(name, english, math);
        this.thesis=thesis;

    }
    @Override
    public void print(){
        System.out.print(name+"\t"+english+"\t"+math+"\t"+getAverage());
        if(getAverage()<70 || thesis<70){
            System.out.print("*");
        }
        System.out.println();
    }


}
