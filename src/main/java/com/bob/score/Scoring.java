package com.bob.score;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Tom",56,34));
        students.add(new Student("Bella",85,46));
        students.add(new GraduateStudent("Elsa",64,54,73));
        for(Student s:students){
            s.print();
        }


        }
    }


