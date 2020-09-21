package ru.geekbrains.lesson5;

public class employee {

    String name;
    String surname;
    String patronymic;
    String position;
    String email;
    int number;
    int salary;
    int age;

    public employee(String name, String surname, String patronymic, String position, String email, int number, int salary, int age) {
        this.name = name! = null ? name.toUpperCase(): null;
        this.surname = surname! = null ? surname.toUpperCase() :null;
        this.patronymic = patronymic! = null ? patronymic.toUpperCase() :null;
        this.position = position! = null ? position.toUpperCase() :null;
        this.email = email! = null ? email.toUpperCase() :null;
        this.number = number;
        this.salary = salary;
        this.age = age;

    }
    public employee(String name, String surname, String patronymic, String position, String email, int number, int salary) {
        this(name, surname,patronymic, position, email, number, salary, 0);
    }
    public employee(String name, String surname, String patronymic, String position, String email, int number) {
        this(name, surname,patronymic, position, email, number, 0);
    }
    public employee(String name, String surname, String patronymic, String position, String email) {
        this(name, surname,patronymic, position, email, 0);
    }
    public employee(String name, String surname, String patronymic, String position) {
        this(name, surname,patronymic, position, null);
    }
    public employee(String name, String surname, String patronymic) {
        this(name, surname,patronymic, null);
    }
    public employee(String name, String surname) {
        this(name, surname, null);
    }
    public employee(String name) {
        this(name, null);
    }
    public employee() {
        this(null);
    }

    void printInfo () {
        System.out.println(this);
    }
    @Override
    public String toString () {
        return "Параметры сотрудников:" + "name=" + name + ", surname=" + surname + ", patronymic=" + patronymic + ", position=" + position + ", email=" + email + ", number=" + number + ", salary=" + salary + ", age=" + age;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
    this.age = age < 0 && age < 40 ?  0 : age;

    }

}
