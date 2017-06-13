package Lection_02;

import java.util.Scanner;

public class Function_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое слово: ");
        String in1 = in.nextLine();
        System.out.print("Введите второе слово: ");
        String in2 = in.nextLine();
        String word1 = new String (in1);
        String word2 = new String (in2);
        if(word1.equals(word2)==true){
            System.out.println("Отлично! Слова одинаковы");
        }
        else if(word1.equalsIgnoreCase(word2)==true){
            System.out.println("Хорошо. Почти одинаковы");
        }
        else if(word1.length()==word2.length()){
            System.out.println("Ну, хотя бы они одной длины");
        }
    }
}
