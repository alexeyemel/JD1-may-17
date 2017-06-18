package Lection_4;

import java.util.Scanner;

/**
 * Created by алексей on 18.06.2017.
 * Создать класс, описывающий промежуток времени.
 * Сам промежуток времени должен задаваться тремя свойствами: секундами, минутами и часами.
 * Создать метод для получения полного количества секунд в объекте
 * Создать два конструктора: первый принимает общее количество секунд, второй - часы, минуты и секунды по отдельности.
 * Создать метод для вывода данных.
 * Написать программу для тестирования возможностей класса.
 */
public class Task_1 {
    int seconds;
    int minutes;
    int hours;
    int value;

    Task_1(int value) {
        this.value = value;
    }

    Task_1(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int valueSeconds() {
        this.value = seconds + minutes * 60 + hours * 3600;
        return value;
    }

    public void outData() {
        System.out.printf("Часов: %d Минут: %d Секунд: %d Всего секунд: %d \n",hours,minutes,seconds,value);
    }

}
