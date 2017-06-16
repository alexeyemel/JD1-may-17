package Lection_3;

import java.util.Scanner;

/**
 * Created by алексей on 17.06.2017.
 * Написать алгоритм расчета факториала, используя циклы (for, while).
 */
public class Task_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        Task_10 fact= new Task_10();

        System.out.println("Факториал этого числа forVesion: "+fact.factorial(num));
        System.out.print("Факториал этого числа whileVersion: "+fact.factorialSecond(num));
    }
    public static int factorial(int n)
    {
        int fact = 1;
        for (int i = 1; i <= n; ++i){
            fact *= i;
        }
        return fact;
    }
    public static int factorialSecond(int n)
    {
        int fact = 1;
        int i = 1;
        while (i <= n){
            fact *= i;
            ++i;
        }

        return fact;
    }
}
