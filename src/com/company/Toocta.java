package com.company;

public class Toocta extends Subject {
    public Toocta(Obj obj) {
        this.obj = obj;
        obj.attach(this);
    }
    @Override
    void update() {
            System.out.println("Octal: " + Integer.toOctalString(obj.getVariable()) );
        }
}




