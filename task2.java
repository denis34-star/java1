package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task2 {

    public static final int FAKE_WORD_LENGTH = 15;
    public static final String[] WORDS = new String[] {
    "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
    "melon", "leak", "cherry", "garlic", "grape",  "kiwi", "mango", "mushroom", "nut",
    "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String []args) {

        System.out.printf("Список слов, я загадал одно из них, угадай это слово:" + Arrays.toString(WORDS));

        Random random = new Random();
        int index = random.nextInt(WORDS.length);
        String targeWord = WORDS[index];
        String userWord = null;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите слово:");
            userWord = scanner.nextLine();

            if (isWin(targeWord, userWord)) {
                System.out.println("Всё верно!");
                break;
            }
            System.out.println("Не верно! Ниже находится подсказка.");
            printPrompt(targeWord, userWord);
            System.out.println();
        } while (true);

    System.out.println("Игра окончена!");
    }
    private static void printPrompt(String targeWord, String userWord) {
        for (int i = 0; i < FAKE_WORD_LENGTH; i++) {
            char chr = '#';
            if (i < userWord.length() && i < targeWord.length() && userWord.charAt(i) == targeWord.charAt(i));
            chr = userWord.charAt(i);
        }
        System.out.print(chr);
    }

}
    private static boolean isWin(String targeWord, String userWord) {return targeWord.equals(userWord);

    }

