package Lection_4;

import java.util.Scanner;

/**
 * Created by алексей on 18.06.2017.
 */
public class Task_2Test {
    public static void main(String[] args) {
        System.out.println("Введите количество купюр в банкомате номиналом 20, 50, 100 соответственно");
        Scanner in = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        Task_2 test = new Task_2(nums[0], nums[1], nums[2]);
        System.out.println("В банкомате доступно:" + test.valueMonye()+" руб");
        System.out.println("Введите сумму снятия");
        Scanner in1 = new Scanner(System.in);
        int sum = in1.nextInt();
        test.takeMoney(sum);
    }
}


