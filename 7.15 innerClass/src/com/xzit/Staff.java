package com.xzit;

import com.xzit.interfaces.Computer;

//匿名类
public class Staff {
    // 创建的匿名类useComputerWorking 继承了 Computer类
    public void useComputerWorking(Computer computer, double n, double m){
        computer.useComputer(n,m);

    }
}