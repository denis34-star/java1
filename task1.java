package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class task1 {

    private static final int ATTEMPT_NUMBER = 3;
    private static final int MAX_VALUE = 9;

    public static void main(String[] args) {
        Random random = new Random();
        int targeValue = random.nextInt(MAX_VALUE + 1);

        System.out.println("Я загадал число от 0 до 9! Угадай, какое?");
        Scanner scanner = new Scanner(System.in);

        int userValue;
        for (int attempt = 0; attempt < ATTEMPT_NUMBER; attempt++) {
            System.out.printf("Попытка номер %d.%n", attempt + 1);
            userValue = getUserValue (scanner);
            if (userValue == targeValue) {
                System.out.println("Всё верно!");
                break;
            }
            else if (userValue < targeValue) {
                System.out.println("загаданное число больше" + userValue);
            }
            else {
                System.out.println("Загаданное число меньше" + userValue);
            }
        }

    }
    private static int getUserValue(Scanner scanner) {
        int result = MAX_VALUE + 1;
        do {
            try {
                System.out.println("Введите число:");
                int value = scanner.nextInt();
                if (value < 0 || value > MAX_VALUE) {
                    System.out.println("Число вне диапазона, пробуй ещё!");
                    continue;
                }
                result = value;
            } catch (NumberFormatException e) {
                System.out.println("Это не число, в следующий раз давай без фокусов!");
            }
        } while (result == MAX_VALUE+1);
        return result;
    }
}
