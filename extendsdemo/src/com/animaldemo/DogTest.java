package com.animaldemo;

public class DogTest {
    public static void main(String[] args) {
        Husky husky=new Husky();
        husky.eat();
        husky.drink();
        husky.lookHome();
        husky.breakHome();

        ChineseDog chineseDog=new ChineseDog();
        chineseDog.eat();
        chineseDog.drink();
        chineseDog.lookHome();

        SharPei sharPei=new SharPei();
        sharPei.eat();
        sharPei.drink();
        sharPei.lookHome();

    }
}
