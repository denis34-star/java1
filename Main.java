package ru.geekbrains.lesson5;

public class Main {

    public static void main (String [] args) {
        employee employee1 = new employee ("Борис", "Киселев", "Алексеевич", "Водитель", "kiselev@mail.ru", 89082432849, 25000, 45);
        employee employee2 = new employee("Анна", "Смирнова", "Сергеевна", "бухгалтер", "smirnova.a@mail.ru", 89087923754, 43000, 39);
        employee employee3 = new employee("Сергей", "Мальцев", "Юрьевич", "системный администратор", "malcev.s@mail.ru", 89194523071, 30000, 24);
        employee employee4 = new employee("Степан", "Лузин", "Александрович", "полевик-геодезист", "luzin.s@mail.ru", 89082471536, 28000, 23);
        employee employee5 = new employee("Мария", "Старкова", "Николаевна", "ведущий инженер-геодезист", "starkova.m@mail.ru", 89197305126, 40000, 54);

        employee1.printInfo();
        employee2.printInfo();
        employee3.printInfo();
        employee4.printInfo();
        employee5.printInfo();
    }
}
