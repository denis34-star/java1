package ru.geekbrains.lesson6;

public class Animal {

    protected String name;
    private String color;
    protected int age;


    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;


    }

    public void printInfo () {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Animal" + "name=' " + name + '\'' + ", color=' " + color + '\''
        + ", age=" + age;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void run() {
        System.out.println("Животное бежит");

    }
    public void jump() {
        System.out.println("Животное перепрыгивает");
    }

    public void sail() {
        System.out.println("Животное плывет");
    }

}
