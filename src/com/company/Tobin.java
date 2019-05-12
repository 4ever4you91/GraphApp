package com.company;

public class Tobin extends Subject {
    public Tobin(Obj obj){
      this.obj = obj;
      obj.attach(this);
    }

    @Override
    void update() {
        System.out.println("Binary: " + Integer.toBinaryString(obj.getVariable()) );
    }
}
