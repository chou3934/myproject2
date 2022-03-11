package com.bob;

public class Scoring {
    public static void main(String[] args) {
        Student Tom=new Student("Tom",56,34);
        //Tom.english=57;
        //Tom.math=50;
        //Tom.name="Tom";
        Tom.print();
        Student Bella=new Student("Bella",85,46);
        Bella.print();
        GraduateStudent May=new GraduateStudent("May",69,45,86);
        May.print();
        }
    }


