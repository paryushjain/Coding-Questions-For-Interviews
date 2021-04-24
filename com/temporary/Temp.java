package com.temporary;


public class Temp {

    int i;

    public Temp(int id){
        i=id;
    }
    public static void main(String args[])  {
        System.out.println(new Temp(3).i + new Temp(4).i);

    }

}
