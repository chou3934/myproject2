package com.bob.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame  extends JFrame {



    public GuessFrame(){
        super();
        setSize(400,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        JButton button=new JButton("Hi");
        JLabel label=new JLabel("wow");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("hi");
                label.setText("yeah");
            }
        });

        setLayout(new FlowLayout());
        add(button);
    }





    public static void main(String[] args) {
        GuessFrame frame=new GuessFrame();

    }
}
