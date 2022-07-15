package com.xzit.interfaces;

//接口的继承
/**      接口只能由其他接口实现继承
 *       子接口继承的目的是：拥有父接口功能后，添加新的抽象定义
 *        一个普通类实现接口时  必须同时实现其父接口的抽象方法
 *        接口被实现的目的就是实现业务功能具体化
 */
public interface Clock extends Computer{

    //在子接口中添加新的抽象定义   显示当前系统时间
    void showSystemDateTime() throws InterruptedException;
}
