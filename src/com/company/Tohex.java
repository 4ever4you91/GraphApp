package com.company;

public class Tohex extends Subject {
    public Tohex(Obj obj){
      this.obj = obj;
      obj.attach(this);

    }

    @Override
    void update() {
        System.out.println("Hexal: " + Integer.toHexString(obj.getVariable()) );
    }
}
