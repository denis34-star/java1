package ru.geekbrains.lesson2;

import java.util.Arrays;

public class Task5 {

    public static void main(String [] args) {
        int [] array = {6, 2, 7, 1, 10, 8, 3};
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {

 /*           if (array[i] < min) {
                min = array[i];
                System.out.println();
            }
            else if (array[i] > max) {
                max = array[i];
            } */
 /*          min = Math.min(min, array[i]);
            max = Math.max(max, array[i]);
        }*/

            Arrays.sort(array);
            int min = array [0];
            int max = array[array.length - 1];

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

    }

}


