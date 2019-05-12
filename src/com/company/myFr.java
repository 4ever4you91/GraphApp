package com.company;


import javax.swing.*;
import java.awt.*;


public class myFr extends JFrame {

    JTextField loginField;
    private int w;
    private int d;
    private int f;

   public myFr (String a){
       super(a);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       JPanel panel = new JPanel();
       panel.setLayout(new GridBagLayout());
       panel.add(new JButton("Result"));

       setSize(300, 300);
       setContentPane(panel);
       setVisible(true);
       Box box1 = Box.createHorizontalBox();
       JLabel loginLabel = new JLabel("Логин:");
       panel.add(loginLabel);
       loginField = new JTextField(15);
       box1.add(loginLabel);
       box1.add(Box.createHorizontalStrut(6));
       box1.add(loginField);
       panel.add(new JButton("Comp"));
   }
   public myFr(){}
   public myFr (int w, int d, int f){
      this.w = w;
      this.d = d;
      this.f = f;
   }
   public void vol() {
       int x = w * d * f ;
       System.out.println(x);
   }


}
