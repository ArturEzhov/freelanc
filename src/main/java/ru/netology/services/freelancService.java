package ru.netology.services;

public class freelancService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int counter = 0;

        for (int i = 0; i < 12; i = i + 1) {
            if (money >= threshold) {
                money = money - expenses;
                money = money / 3;
                counter++;

            } else {
                money = money + income;
                money = money - expenses;

            }
        }
        return counter;
    }
}
