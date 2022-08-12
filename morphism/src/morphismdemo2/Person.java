package morphismdemo2;

public class Person {
    private String name;
    private int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }


    //行为
    public void keepPet(Animal a, String something){
        if (a instanceof Dog d){
            System.out.println(this.age+"岁的饲养员养了一只"+d.getColor()+"色"+d.getAge()+"岁"+"的狗");
            System.out.println(d.getColor()+"色"+d.getAge()+"岁"+"的狗抱住"+something+"猛吃");
        }else if (a instanceof Cat c){
            System.out.println(this.age+"岁的饲养员养了一只"+c.getColor()+"色"+c.getAge()+"岁"+"的猫");
            System.out.println(c.getColor()+"色"+c.getAge()+"岁"+"的猫吃"+something);
        }
    }
}
