/**父类 Computer
 *
 * super关键字只能在存在继承关系的子类中出现，代表父类对象
 * */
public class Computer {
    public String name;
    public double count(double a, double b){
        return a+b;
    }

    public Computer(){

    }

    public Computer(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void show(){

        System.out.println("我是"+name+"品牌计算机");
    }

    public static void staticMethod(){
        System.out.println("静态方法，在子类中可以被覆盖，但是不能被重写");
    }
}
