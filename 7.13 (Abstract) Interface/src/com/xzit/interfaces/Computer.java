package com.xzit.interfaces;
/**接口  弥补java不支持多继承的缺陷
 *更高级的抽象类
 *           接口中只能声明公共的抽象方法
 *           接口中属性定义必须时公共的，静态的，常量
 *
 *
 *             -imp  对抽象类、接口的实现类
 *
 *             接口回调：
 */

public interface Computer  {

    public static final int Max_NUM=Integer.MAX_VALUE;
    //public static final可省略

    //抽象方法（公共）
    double count(double a,double b);

}
