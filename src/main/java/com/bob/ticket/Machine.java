package com.bob.ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Machine {

    public static void main(String[] args) {
        List<Ticket> tickets = new ArrayList<>();
        boolean a=true;

        System.out.println("Your start station(Taipei:1,Taichung=2,Kaohsiung=3)");
        Scanner scanner=new Scanner(System.in);
        int choice=Integer.parseInt(scanner.next());
        Station startStation=null;
        switch(choice){
            case 1:
                startStation=Station.TAIPEI_CITY;
                break;
            case 2:
                startStation=Station.TAICHUNG;
                break;
            case 3:
                startStation=Station.KAOHSIUNG;
                break;
        }

        System.out.println("Your destination station(Taipei:1,Taichung=2,Kaohsiung=3)");
        Scanner scanner2=new Scanner(System.in);
        int choice2=Integer.parseInt(scanner2.next());
        Station destinationStation=null;
        switch(choice2){
            case 1:
                destinationStation=Station.TAIPEI_CITY;
                break;
            case 2:
                destinationStation=Station.TAICHUNG;
                break;
            case 3:
                destinationStation=Station.KAOHSIUNG;
                break;
        }


        while(a) {
            System.out.println("Which kind of ticket do you want(normal:1,student:2,elder:3,round-trip:4)");
            Scanner s2 = new Scanner(System.in);
            int type = Integer.parseInt(s2.next());

            System.out.println("How many ticket do you want?");
            Scanner s3 = new Scanner(System.in);
            int number = Integer.parseInt(s3.next());

            switch (type) {
                case 1:
                    tickets.add(new Ticket(startStation, destinationStation, number));
                    break;
                case 2:
                    tickets.add(new StudentTicket(startStation, destinationStation, number));
                    break;
                case 3:
                    tickets.add(new ElderTicket(startStation, destinationStation, number));
                    break;
                case 4:
                    tickets.add(new RoundTripTicket(startStation, destinationStation, number));
                    break;
            }
            int money=0;
            for(Ticket t:tickets){
                t.print();
                money=money+t.price();
            }
            System.out.println("total: "+money);

            System.out.println("Anything else?(end:0)");
            Scanner s4 = new Scanner(System.in);
            int answer = Integer.parseInt(s4.next());
            if (answer == 0) {
                System.out.println("Ending.Total: "+money);
                a=false;
            }
        }


    }
}
