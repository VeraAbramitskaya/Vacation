package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationCalculationServiceTest {

    @Test
    void WhenVacation () {
        VacationCalculationService service = new VacationCalculationService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }
}
