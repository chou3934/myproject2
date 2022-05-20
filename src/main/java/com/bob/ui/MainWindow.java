package com.bob.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setLocation(400,100);
        JButton button=new JButton("ok");
        frame.add(button);
        frame.add(new JButton("no"));

        //MyActionListener listener=new MyActionListener();
        //button.addActionListener(listener);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("ok");
            }
        });

        //關閉框即停止
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //button正確邊框
        frame.setLayout(new FlowLayout());
        System.out.println("End?");
    }
}
