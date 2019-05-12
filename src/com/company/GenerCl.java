package com.company;

class GenerCl {
    private int num;
    GenerCl node;

    public int getMum() {
        return num;
    }
    public void setMum(int num){
        this.num = num;
    }
    public GenerCl(int num, GenerCl node)
    {
        this.node = node;
        this.num = num;
    }
    public GenerCl(){

    }

    public int toInt(){
    return num;
    }
    int [] array = new int[2];

    public void setNode(GenerCl node) {
        this.node = node;
    }
    public void useOf1 (GenerCl plane){
        GenerCl ref = new GenerCl(49, null);
        if (plane.equals(ref))
            System.out.println("Norm");
        else
            System.out.println("Not norm");
    }
}
