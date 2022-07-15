import java.text.SimpleDateFormat;
import java.util.Date;

/**子类 Watch
 *   创建子类对象时  总要先创建一个父类对象
 *   私有属性和方法无法在子类中直接访问
 *   final、构造方法不能被继承
* */
public class Watch extends Computer {
    public Watch(String name) {
        //super关键字在子类构造器中  必须位于第一行
        super(name);//创建父类对象
                       //子类中的构造器 super关键字永远指向父类中的构造器创建父类对象
    }

    public void displayDateTime(){

        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    }

    @Override
    public double count(double n, double m) {
        double res=super.count(n,m);//super 访问父类中的方法
        return n-m+res;
    }

    public static void staticMethod(){
        //double super.count()          静态方法不能用super
        Computer.staticMethod();//子类的静态方法中 使用父类类名访问父类的静态资源
        System.out.println("子类不能重写继承的父类静态方法");//父类中的方法被覆盖了
    }
}
