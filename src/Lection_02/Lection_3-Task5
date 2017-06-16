package Lection_3;

/**
 * Created by алексей on 16.06.2017.
 * Создать двухмерный массив и заполнить его бабочкой. Вывести его на экран заменив 1 символом *, а нули пробелом.
 */
public class Task_5 {
    public static void main(String[] args) {
        char[][]array = { {1, 1, 1, 1, 1},
                          {0, 1, 1, 1, 0},
                          {0, 0, 1, 0, 0},
                          {0, 1, 1, 1, 0},
                          {1, 1, 1, 1, 1}, };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j]==1){
                    array[i][j]= '*';
                }else if(array[i][j]==0) {
                    array[i][j] = ' ';
                }
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
