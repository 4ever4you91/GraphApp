package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main (String [] args) {
    myFr fr = new myFr("My title");
    myFr fr1 = new myFr(10, 4, 10);
    fr1.vol();
    JButton myB = new JButton("Check it");
    fr.getContentPane().add(myB);
    AttThread att1 = new AttThread();
    Thread t1 = new Thread(att1);
    t1.start();
    }
}