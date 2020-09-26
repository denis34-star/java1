package ru.geekbrains.lesson6;

import jdk.vm.ci.meta.Value;

public class Cat extends Animal  implements  Runner, Jump {

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }
    @Override
    public String toString() {
        return "Кот" + name + "Цвет:" + this.getColor() + "Возраст:" + age;
    }
    @Override
    public void run() {
        System.out.println("Кот бежит");
    }
    @Override
    public void jump () {
        System.out.println("Кот перепрыгивает");
    }

    public static final int DISTANCE_RUNNER = 200;
    public static final int HEIGHT_JUMP = 2;

   System.out.println(parent.getvalue());



}
