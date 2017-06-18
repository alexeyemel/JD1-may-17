package Lection_3;

import java.util.Scanner;

/**
 * Created by алексей on 17.06.2017.
 * Имеется целое число. Необходимо определить является ли это число простым. Т.е. делится без остатка только на 1 и себя.
 */
public class Task_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int simpleTest = 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                simpleTest = 0;
                break;
            } else {
                simpleTest = 1;
            }
        }

        if (simpleTest == 1) {
            System.out.println("Это число простое");
        } else {
            System.out.println("Это число непростое");
        }
    }
}
