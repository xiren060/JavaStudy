package com.xzit.test;

import com.xzit.Location;

/*静态代码块的加载
        静态代码块属于类和对象无关，随类的加载而加载   加载的早
        在静态属性初始化后 构造器之前加载
        只加载一次  通常做一些静态属性或常量的赋值、调用静态方法*/
public class TextStaticBlockLoad {
    public static void main(String[] args) {
        Location location=new Location(23335.99);//创建对象 类被加载 静态块会先被加载 然后加载构造器
    }
}
