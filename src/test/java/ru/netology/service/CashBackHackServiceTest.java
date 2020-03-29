package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CashBackHackServiceTest {
    // amount - сумма покупки, expected - ожидаемый остаток для получения кэшбэка, actual - расчетный остаток до пулучения кэшбека

    @ParameterizedTest
    @CsvFileSource(resources = "/CashbackWithoutExceptions.csv", delimiter = '|')
    void CheckCashBackWithoutExceptions(int amount, int expected, String message) {
        CashBackHackService cashBackHackService = new CashBackHackService();
        int actual = cashBackHackService.remain(amount);
        assertEquals(expected, actual, "Cashback calculation error!");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/CashbackFromZero.csv")
    void CheckCashBackFromZero(int amount) {
        CashBackHackService cashBackHackService = new CashBackHackService();

        assertThrows(IllegalArgumentException.class, () -> { cashBackHackService.remain(amount);
        });
    }
}