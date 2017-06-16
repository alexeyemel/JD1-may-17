package Lection_02;

/**
 * Created by алексей on 15.06.2017.
 */
import java.util.Scanner;
public class Task_4 {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите день: ");
        int day = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите введите месяц: ");
        int month = in2.nextInt();
        Scanner in3 = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = in3.nextInt();

        int div4= year % 4;
        int div100= year % 100;
        int div400= year % 400;
        int yearV=0;
        if((div4==0 && div100!=0)||div400==0){
            yearV=1;
        } else {
            yearV=0;}
        int countDay=0;
        if (month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            countDay=31;
        }else if (month==4||month==6||month==9||month==11){
            countDay=30;
        }else if (month==2 && yearV==1){
            countDay=29;
        }else if (month==2 && yearV==0){
            countDay=28;}

        if (day<=countDay && day>0 && month<=12 && month>0 && year>=0) {
            System.out.println("Дата является реальной: " + day + "." + month + "." + year);
        }else{
            System.out.println("Вы ввели не коректную дату!");}
    }
}
