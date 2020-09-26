package ru.geekbrains.lesson2;

public class Task6 {
    public static void main(String [] args)  {
        System.out.println(checkBalance(new int [] {2, 2, 2, 1, 2, 2, 0, 0, 10, 1}));
        System.out.println(checkBalance(new int []{1, 1, 1, 2, 1}));
        System.out.println(checkBalance(new int []{3, 5}));
        System.out.println(checkBalance(new int []{1, 2, 0, 0, 3}));

    }

    private static boolean checkBalance (int[]array ) {
        System.out.println();
        int leftSum = 0;
        int rightSum = sum(array, 0, array.length);
        boolean result = false;

        for (int i =0; i < array.length; i++) {
            leftSum = sum (array, 0, i );
            rightSum = sum(array, i, array.length);

            if (leftSum == rightSum) {
                System.out.println(i);
                result = true;

            }
        }
        return  result;
    }
    private static int sum (int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }
}
