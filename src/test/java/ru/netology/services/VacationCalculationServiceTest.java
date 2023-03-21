package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationCalculationServiceTest {

    //@Test
    @ParameterizedTest
    @CsvFileSource (files="src/test/resources/Resources.csv")
    void WhenVacation (int income, int expenses, int threshold, int expected) {
        VacationCalculationService service = new VacationCalculationService();

       // int income = 10_000;
       // int expenses = 3_000;
       // int threshold  = 20_000;
       // int expected  = 3;

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }
}
