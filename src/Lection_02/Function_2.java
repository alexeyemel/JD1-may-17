package Lection_02;

/**
 * Created by алексей on 13.06.2017.
 */
import java.util.Scanner;
public class Function_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 1 до 20: ");
        int num = in.nextInt();
        if(num==1){
            System.out.println(num + " рубль");
        }
        else if(num==2||num==3||num==4){
            System.out.println(num + " рубля");
        }
        else {
            System.out.println(num + " рублей");
        }
    }
}
