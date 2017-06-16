package Lection_3;

/**
 * Created by алексей on 16.06.2017.
 * Создать массив из 4-х случайных чисел из отрезка [10,99]. Вывести его на экран в строку.
 * Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */
public class Task_4 {
    public static void main(String[] args) {
        int min = 10; // Минимальное число диапазона
        int max = 99; // Максимальное число диапазона
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = numRandom(min, max);
        }
        for (int i : array){
            System.out.print(i+" ");
        }
        System.out.println();
        if (array[0]<array[1]&&array[1]<array[2]&&array[2]<array[3]) {
            System.out.print("Массив является строго возрастающей последовательностью");
        } else {
            System.out.print("Простая последовательность");
        }
    }

        public static int numRandom(int min, int max)
    {
        max -= min;
        return min + (int) (Math.random() * ++max);
    }
}
