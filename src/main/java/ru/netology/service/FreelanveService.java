package ru.netology.service;

public class FreelanveService {
    public int calculate(int income, int expenses, int threshold) {

        int money = 0;
        int count = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                money -= expenses;
                money /= 3;
                count++;

            } else {


                money += income; // -= *=
                money -= expenses;
            }
        }
        return count;
    }

}
