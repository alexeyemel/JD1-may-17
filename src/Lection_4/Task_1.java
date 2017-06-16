package Lection_4;

import java.util.Scanner;

/**
 * Created by алексей on 18.06.2017.
 */
public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
    }
}
