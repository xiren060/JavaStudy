package com.xzit.test;

import com.xzit.interfaces.imp.NotebookComputer;

public class Test {
    public static void main(String[] args) {
        NotebookComputer.Cpu cpu=null;
        NotebookComputer notebook=new NotebookComputer();
        cpu=notebook.new Cpu();
        cpu.handleData();
    }
}