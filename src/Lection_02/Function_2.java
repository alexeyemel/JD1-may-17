package Lection_02;

/**
 * Created by алексей on 13.06.2017.
 */
import java.util.Scanner;
public class Function_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму: ");
        int num = in.nextInt();
        int ultNum= num % 10;
        int secUltNum= num % 100;
        int penUltNum= secUltNum-ultNum;

        if(ultNum==1 && penUltNum!=10){
            System.out.println(num + " рубль");
        } else if(ultNum>1 && ultNum<5 && penUltNum!=10){
            System.out.println(num + " рубля");
        } else if(num>=0){
            System.out.println(num + " рублей");
        } else {
            System.out.println("Вы ввели не корректную сумму!");}
  }
}
