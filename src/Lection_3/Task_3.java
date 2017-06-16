package Lection_3;

import java.util.Random;

/**
 * Created by алексей on 16.06.2017.
 * Определить сумму элементов целочисленного массива расположенных между минимальным и максимальным значениями
 */
public class Task_3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        System.out.println("Массив заполненный рандомными числами:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "   ");
        }
        System.out.println();
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[minIndex] > array[i]) {
                minIndex = i;
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((i > minIndex && i < maxIndex) || (i < minIndex && i > maxIndex)) {
                sum += array[i];
            }
        }
        System.out.println("сумма: " + sum);
    }
}

