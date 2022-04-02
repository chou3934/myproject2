package com.bob.ticket;

public class Station {
    int id;
    String name;
    public Station(int id,String name){
        this.id=id;
        this.name=name;
    }
    public static  final  Station TAIPEI_CITY=new Station(1,"Taipei");
    public static  final  Station TAICHUNG=new Station(2,"Taichung");
    public static  final  Station KAOHSIUNG=new Station(3,"Kaohsiung");

}
