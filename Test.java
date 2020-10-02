package ru.geekbrains.lesson7;

import java.util.concurrent.Callable;

public class Test {

    public static void main(String[] args) {

        Cat[]arrCats = new Cat[5];

        arrCats[0] = new Cat("Мартин", 15);
        arrCats[1] = new Cat("Феликс", 25);
        arrCats[2] = new Cat("Барсик", 20);
        arrCats[3] = new Cat("Борис", 15);
        arrCats[4] = new Cat("Захар", 25);


        Plate p = new Plate(100);

        for (Cat cat : arrCats) {
            cat.eat(p);
            cat.info();
        }
        p.info();
        p.addFood(100);
        p.info();

    }
}
