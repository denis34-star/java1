package ru.geekbrains.lesson6;

public class Dog extends  Animal implements Runner, Jump, Sail {

    public Dog(String name, String color, int age) {

        super(name, color, age);
    }

    public void printInfo() {
        super.printInfo();
    }
    public void setColor(String color) {
        super.setColor(color);
    }
    public String getColor() {
        return super.getColor();
    }
    @Override
    public void run() {
        System.out.println("Собака бежит");


    }
    @Override
    public void jump() {
        System.out.println("Собака перепрыгивает");

    }
    @Override
    public void sail() {
        System.out.println("Собака плывет");
    }

    public static final int DISTANCE_RUNNER = 500;
    public static final int HEIGHT_JUMP = 0.5;
    public static final int DISTANCE_SAIL = 10;

     System.out.println(parent.getvalue());

}
