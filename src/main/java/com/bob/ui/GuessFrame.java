package com.bob.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame  extends JFrame {

    JButton button=new JButton("guess");
    JLabel label=new JLabel("Guess a number from 1 to 10.");
    JTextField number=new JTextField(10);
    public GuessFrame(){
        super();
        setSize(400,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());

        add(label);
        add(number);
        add(button);

        Random r=new Random();
        int secret=r.nextInt(10);
        System.out.println("secret: "+secret);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                System.out.println("hi");
//                label.setText("yeah");
                int num= Integer.parseInt(number.getText());
                System.out.println("answer: "+num);

                if(num==secret){
                    System.out.println("You win!");
                }
                else {
                    if(num>secret){
                        System.out.println("smaller");
                    }
                    else{
                        System.out.println("bigger");
                    }
                }

            }
        });
    }

    public static void main(String[] args) {
        GuessFrame frame= new GuessFrame();
    }
}
