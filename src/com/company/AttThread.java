package com.company;


import java.util.HashMap;
import java.util.Map;

public class AttThread implements Runnable {
    @Override
    public void run() {
        Obj obj1 = new Obj();
        new Tobin(obj1);
        new Toocta(obj1);
        new Tohex(obj1);
        System.out.println(obj1.list.get(2).getClass());
        obj1.setVariable(127);




    }

}
