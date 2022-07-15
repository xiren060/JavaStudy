package com.xzit.test;

import com.xzit.interfaces.Computer;
import com.xzit.interfaces.imp.Mulity;

public class Text {
    public static void main(String[] args) {

     // Computer computer=new Computer() {}
        Computer computer=new Mulity("111");
        double res=computer.count(23.5,25);
        System.out.println(res);
    }
}
