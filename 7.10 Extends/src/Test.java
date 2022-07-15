public class Test {
    public static void main(String[] args) {
        Watch watch=new Watch("联想");

        System.out.println(watch.count(45.6,55.4)); //computer类中的方法

        System.out.println(watch.getName());

        Watch.staticMethod();
    }
}
