package com.bob.score;

public class Student implements Printable{
    protected String name;
    protected int english;
    protected int math;
    public Student(String name){
        this.name=name;
    }

    public Student(String name,int english,int math){
        this(name);
        //this.name=name;
        this.english=english;
        this.math=math;
    }

    public int getAverage(){
        return (english+math)/2;
    }

    @Override
    public void print(){
        System.out.print(name+"\t"+english+"\t"+math+"\t"+getAverage());
        if(getAverage()<60){
            System.out.print("*");
        }

        System.out.println();
    }
}



