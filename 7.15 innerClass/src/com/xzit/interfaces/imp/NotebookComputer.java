package com.xzit.interfaces.imp;

import com.xzit.interfaces.Computer;

//实现类  实现Computer中的usecomputer方法
public class NotebookComputer implements Computer {
    @Override
    public void useComputer(double a,double b) {

    }
    //内部类 相当于一个成员
    public class Cpu{
        //方法
        public void handleData() {
            System.out.println("处理器，处理业务");
        }
    }

    //静态内部类
    public  static  class Hoard {
        public void displaySelfInfo(){
            System.out.println("主板");
        }
    }


}