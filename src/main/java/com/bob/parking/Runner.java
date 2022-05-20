package com.bob.parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id="ABC-123";
        String enterTime ="08:30";
        String exitTime="08:45";
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
        Date d=null;
        try {
            d=sdf.parse(enterTime);
        } catch (Exception e){
            System.out.println("Wrong format");
        }
        System.out.println(d);
        System.out.println(d.getTime());

        //long a=1*60*60*1000;
        //練不到15
        try {
            Date d2=sdf.parse(exitTime);
            System.out.println(d2);
            System.out.println(d2.getTime());
            long ms=d2.getTime()-d.getTime();
            int minutes=(int)ms/(1000*60);
            int hour=(int)ms/(1000*60*60);
            System.out.println(minutes);
            System.out.println(hour);

        }catch(Exception e1){

        }


    }
}
