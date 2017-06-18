package Lection_3;

import java.util.Random;

/**
 * Created by алексей on 17.06.2017.
 * Написать программу, перемешивающую и печатающую список карт в колоде. Воспользываться результатами предыдущей задачи
 */
public class Task_8 {
    public static void main(String[] args) {
        Task_7 card=new Task_7();
        String[] mixDeck = new String[52];
        Random rand = new Random();
        for (int i=0;i < mixDeck.length;i++) {
            mixDeck[i]=card.getCardFromDeck();
        }
        for (int i = 0; i < mixDeck.length; i++) {
            System.out.print(mixDeck[i] + "   ");
        }
    }

}
