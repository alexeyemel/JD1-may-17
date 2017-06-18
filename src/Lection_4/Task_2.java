package Lection_4;

/**
 * Created by алексей on 18.06.2017.
 * Создать класс, описывающий банкомат.
 * Набор купюр, находящихся в банкомате должен задаваться тремя свойствами:
 * количеством купюр номиналом 20, 50 и 100. Сделать методы для добавления денег в банкомат.
 * Сделать функцию, снимающую деньги, которая принимает сумму денег,
 * а возвращает булевое значение - успешность выполнения операции.
 * При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма.
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */
public class Task_2 {
    int note20 = 0;
    int note50 = 0;
    int note100 = 0;
    int valueMonyeInBank = 20 * note20 + 50 * note50 + 100 * note100;

    Task_2(int note20, int note50, int note100) {
        this.note20 = note20;
        this.note50 = note50;
        this.note100 = note100;
    }

    int addMoney20(int add20) {//Метод добавления купюр номиналом 20
        note20 += add20;
        return note20;
    }

    int addMoney50(int add50) {//Метод добавления купюр номиналом 50
        note50 += add50;
        return note50;
    }

    int addMoney100(int add100) {//Метод добавления купюр номиналом 100
        note100 += add100;
        return note100;
    }

    public int valueMonye() {//Метод подсчета суммы в банкомате
        this.valueMonyeInBank = 20 * note20 + 50 * note50 + 100 * note100;
        return valueMonyeInBank;
    }

    void takeMoney(int value) {//Функция снятия денег из банкомата
        boolean operation = false;
        for (int i = 0; i <= note20; i++) {
            for (int j = 0; j <= note50; j++) {
                for (int k = 0; k <= note100; k++) {
                    if (value == (k * 100 + j * 50 + i * 20)) {
                        System.out.println("Операция выполнена успешно");
                        System.out.printf("Вы получили следующее количество купюр. Номиналом 100: %d Номиналом 50: %d Номиналом 20: %d \n", k, j, i);
                        operation = true;

                        break;
                    }
                }
                if (operation == true) {
                    break;
                }
            }

            if (operation == true) {
                break;
            }
        }

        if (operation == false) {
            System.out.println("Операция завершена ошибкой.Вы ввели недопустимое значение");
        }
    }
}
