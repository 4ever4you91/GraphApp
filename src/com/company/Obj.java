package com.company;

import java.util.ArrayList;

public class Obj {
    ArrayList<Subject> list = new ArrayList();
    private int variable;

    public int getVariable() {
        return variable;
    }

    public void setVariable(int variable) {
        this.variable = variable;
        notifyit();
    }
    private void notifyit(){
        for(Subject sub : list)
            sub.update();

    }
    public void attach(Subject random){
        list.add(random);
    }
}
