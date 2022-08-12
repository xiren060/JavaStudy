package morphismdemo2;

public class PetTest {
    public static void main(String[] args) {
        Person per=new Person("老王",30);
        Dog dog=new Dog(2,"黑");
        per.keepPet(dog,"骨头");

        Person per2=new Person("老李",25);
        Cat cat=new Cat(3,"灰");
        per2.keepPet(cat,"鱼");

    }

}
