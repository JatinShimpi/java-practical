package com.jatin.practical9;

interface area{
    final static float pi=3.14f;
    float compute(float x, float y);
}
public class interfaceclass implements area {
    public float compute(float x, float y) {
        return(pi*x*y);}
    public static void main(String []args){
        interfaceclass p1=new interfaceclass();
        System.out.println("Area= "+p1.compute(20.00f,20.0f));
    }
}