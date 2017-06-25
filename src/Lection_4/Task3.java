package Lection_4;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by алексей on 25.06.2017.
 * Определить класс, который при инициализации принимает на вход 2 аргумента целого или вещественного типа.
 * Задать методы возвращающие результат арифметических операций над заданными полями и полями типа BigDecimal.
 */
public class Task3 {
    private double d1;
    private double d2;
    private int i1;
    private int i2;


    Task3(double d1, int i1) {
        Task3 object1 =new Task3(d1,i1);
        this.d1 = d1;
        this.i1 = i1;
        BigDecimal bd1 = BigDecimal.valueOf(d1);
        BigDecimal bd2 = BigDecimal.valueOf(i1);
        System.out.println("Cумма чисел"+object1.amount(bd1,bd2));
    }

    Task3(int i1, double d1) {
        Task3 object1 =new Task3(i1,d1);
        this.d1 = d1;
        this.i1 = i1;
        BigDecimal bd1 = BigDecimal.valueOf(i1);
        BigDecimal bd2 = BigDecimal.valueOf(d1);
        System.out.println("Cумма чисел"+object1.amount(bd1,bd2));
    }

    Task3(int i1, int i2) {
        Task3 object1 =new Task3(i1,i2);
        this.i1 = i1;
        this.i2 = i2;
        BigDecimal bd1 = BigDecimal.valueOf(i1);
        BigDecimal bd2 = BigDecimal.valueOf(i2);
        System.out.println("Cумма чисел"+object1.amount(bd1,bd2));
    }

    Task3(double d1, double d2) {
        Task3 object1 =new Task3(d1,d2);
        this.d1 = d1;
        this.d2 = d2;
        BigDecimal bd1 = BigDecimal.valueOf(d1);
        BigDecimal bd2 = BigDecimal.valueOf(d2);
        System.out.println("Cумма чисел"+object1.amount(bd1,bd2));
    }

    public static void main(String[] args) {

        System.out.println("Введите числа");
        Scanner nom1 = new Scanner(System.in);
        nom1.useLocale(Locale.US);
        Scanner nom2 = new Scanner(System.in);
        nom2.useLocale(Locale.US);

        if (nom1.hasNextInt() && nom2.hasNextInt()) {
            Task3 object = new Task3(nom1.nextInt(), nom2.nextInt());
        } else if (nom1.hasNextInt() && nom2.hasNextDouble()) {
            Task3 object = new Task3(nom1.nextInt(), nom2.nextDouble());
        } else if (nom1.hasNextDouble() && nom2.hasNextInt()) {
            Task3 object = new Task3(nom1.nextDouble(), nom2.nextInt());
        } else if (nom1.hasNextDouble() && nom2.hasNextDouble()) {
            Task3 object = new Task3(nom1.nextDouble(), nom2.nextDouble());
        }
    }
    private BigDecimal amount (BigDecimal bd1, BigDecimal bd2){
        BigDecimal sum=bd1.add(bd2);
        return sum;
    }
    private BigDecimal substaction (BigDecimal bd1, BigDecimal bd2){
        BigDecimal sub=bd1.subtract(bd2);
        return sub;
    }
    private BigDecimal multiplication (BigDecimal bd1, BigDecimal bd2){
        BigDecimal mul=bd1.multiply(bd2);
        return mul;
    }
    private BigDecimal division (BigDecimal bd1, BigDecimal bd2){
        BigDecimal div=bd1.divide(bd2,5,BigDecimal.ROUND_HALF_UP);
        return div;
    }
}
