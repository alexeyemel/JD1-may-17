package Lection_4;

import java.util.Scanner;

/**
 * Created by алексей on 18.06.2017.
 */
public class Task_1Test {
    public static void main(String[] args) {
        System.out.println("Введите часы, минуты и секунды промежутка времени");
        Scanner in = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        Task_1 test=new Task_1(nums[0],nums[1],nums[2]);
        test.valueSeconds();
        test.outData();
        }
}
