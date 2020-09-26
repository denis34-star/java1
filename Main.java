package ru.geekbrains.lesson6;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Борис", "Черный", 2);
        Dog dog = new Dog("Мухтар", "Серый", 3);
        Dog dog2 = new Dog("Ричард", "Бурый", 4);

        cat.printInfo();
        dog.printInfo();
        dog2.printInfo();

        cat.run();
        dog.run();
        cat.jump();
        dog.jump();
        dog.sail();



        Animal[] animals = {cat, dog, dog2};

    }


}
