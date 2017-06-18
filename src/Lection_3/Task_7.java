package Lection_3;

import java.util.Random;

/**
 * Created by алексей on 17.06.2017.
 * Написать программу, эмулирующую выдачу случайной карты из калоды в 52 карты
 */
public class Task_7 {
    public String cardFromDeck = null;

    public String getCardFromDeck() {
        String[][] deck = new String[13][4];
        String card = null;
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            switch (i) {
                case 0:
                    card = "2";
                    break;
                case 1:
                    card = "3";
                    break;
                case 2:
                    card = "4";
                    break;
                case 3:
                    card = "5";
                    break;
                case 4:
                    card = "6";
                    break;
                case 5:
                    card = "7";
                    break;
                case 6:
                    card = "8";
                    break;
                case 7:
                    card = "9";
                    break;
                case 8:
                    card = "10";
                    break;
                case 9:
                    card = "Jack";
                    break;
                case 10:
                    card = "Queen";
                    break;
                case 11:
                    card = "King";
                    break;
                case 12:
                    card = "Ace";
                    break;
            }
            for (int j = 0; j < deck[0].length; j++) {
                deck[i][0] = card + "ofHearts";
                deck[i][1] = card + "ofSpades";
                deck[i][2] = card + "ofClubs";
                deck[i][3] = card + "ofDiamonds";
            }
        }
        String cardFromDeck = deck[rand.nextInt(13)][rand.nextInt(4)];
        return cardFromDeck;
    }

    public static void main(String[] args) {
        Task_7 c = new Task_7();
        String a = c.getCardFromDeck();
        System.out.println(a);
    }
}



