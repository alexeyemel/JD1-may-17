package Lection_02;

/**
 * Created by алексей on 15.06.2017.
 */
import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        int num = in.nextInt();
        int div4= num % 4;
        int div100= num % 100;
        int div400= num % 400;

        if((div4==0 && div100!=0)||div400==0){
            System.out.println("Этот год высокосный");
        } else {
            System.out.println("Этот год не высокосный");}
    }
}
