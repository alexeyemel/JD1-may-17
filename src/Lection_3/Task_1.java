package Lection_3;

import java.util.Random;

/**
 * Created by алексей on 15.06.2017.
 * Напишите программу, которая печатает массив сначала в обычном порядке, затем в обратном.
 */
public class Task_1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();
        for (int i=0;i < array.length;i++) {
            array[i]=rand.nextInt(100)+1;

        }
        System.out.println("Массив заполненный рандомными числами:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "   ");
        }
        System.out.println();
        System.out.println("Массив в обратном порядке:");
        for (int i = array.length-1; i >=0; i--) {
            System.out.print(array[i] + "   ");
        }
        System.out.println();

            /* Сортировка выбором
        int[] array = {8, 5, 2, 6, 9, 3, 1, 4, 0, 7};
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                  }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

        }*/
        /*Пузырьковая сортировка
        int[] array = {5, 4, 3, 1, 2};
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    }
                }
        }*/

       /* int[] array = new int[] { 5, 2, 3, 4, 5 };
        for (int i : array){

            System.out.print(i);
        }*/
    }
}
