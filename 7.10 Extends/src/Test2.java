public class Test2 {
    public static void main(String[] args) {
        Computer computer=new Phone();//上转型对象  （实例是子类的 类型是父类的）
        System.out.println(computer.count(23,45));
        Phone phone=new Phone();
        phone.call("我来了");

        ((Phone)computer).call("我是你的朋友");//上转型对象可以在需要的时候  强制转换为子类类型
        computer.setName("联想");
        computer.show();
    }
}
