package ru.netology.services;

public class VacationCalculationService {
    public int calculate(int income, int expenses, int threshold) {
        int vacationsCount = 0; // количесво месяцев отдыха
        int moneyOnAccount = 0; // количество денег на счете
        for (int month = 0; month < 12; month++) {
            // moneyOnAccount = income - expenses; // считает, сколько на счете денег
            if (moneyOnAccount >= threshold) { // если на счете денег >= threshold, то можно отдыхать
                vacationsCount++; // прибавляет месяца отдыха
                moneyOnAccount = (moneyOnAccount - expenses)/3; // считает, сколько денег на счете после отпуска
            } else {
                moneyOnAccount = moneyOnAccount + income - expenses;
            }
        }

        return vacationsCount;
    }
}

