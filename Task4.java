package ru.geekbrains.lesson2;

import java.util.Arrays;

public class Task4 {

    public  static void main (String[] args) {
        int [][] array = new int[9][9];
        int lastIndex = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            array [i][i] = array[i][lastIndex - i] = 1;
        }

        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }

    }

}
