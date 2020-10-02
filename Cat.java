package ru.geekbrains.lesson7;

import jdk.internal.math.FloatingDecimal;

public class Cat {
    protected String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = true;
    }
    void info() {
        System.out.println(name +"имеет аппетит" + appetite + ".\n" +name + "приступает к еде");
        String isHungry = !satiety ? "сыт" : "остается голодным, т.к. в тарелке мало еды";
        System.out.println(name + isHungry);
    }
        public void eat(Plate p) {
        if (satiety == true && p.decreaseFood(appetite) == true) {
            satiety = false;
        }
        System.out.println("=================================");
        }


}
