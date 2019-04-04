package com.company;


import javax.swing.*;

public class myFr extends JFrame {
    private int w = 20;
    private int d = 5;
    private int f = 2;

   public myFr (String a){
       super(a);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(300, 300);
       setVisible(true);
   }
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
