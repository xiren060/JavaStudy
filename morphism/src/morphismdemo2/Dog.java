package morphismdemo2;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    public static void lookHome(){

        System.out.println("狗在看家");
    }
}
