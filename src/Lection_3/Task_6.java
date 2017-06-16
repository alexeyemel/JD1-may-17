package Lection_3;

import java.util.Random;

/* Created by алексей on 16.06.2017.
 * Создать метод equals? который определяет равны ли между собой соответствующие элементы 2-х двумерных массивов
 */
public class Task_6 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 4}, {4, 2, 1}, {4, 2, 1}}; //Инициилизируем массивы вручную
        int[][] array1 = {{1, 2, 3}, {4, 2, 1}, {1, 2, 4}};
        /*int[][] array = new int[3][3];  //Инициилизируем массивы автоматически
        int[][] array1 = new int[3][3];
       Random rand = new Random();
        System.out.println("Вывод первого массива");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = rand.nextInt(100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Вывод второго массива");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                array1[i][j] = rand.nextInt(100);
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }*/
        equals(array, array1, 1, 0);
    }

    public static void equals(int array[][], int array1[][], int i1, int j1) {

        if (array[i1][j1] == array1[i1][j1]) {
            System.out.println("Да. Эти элементы равны");
        } else {
            System.out.println("Нет. Элементы не равны");
        }
    }
}
