package morphismdemo2;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    public static void catchMouse(){
        System.out.println("猫在逮老鼠");
    }
}
