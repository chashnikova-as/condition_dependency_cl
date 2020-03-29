package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashBackHackServiceTest {
    // amount - сумма покупки, expected - ожидаемый остаток для получения кэшбэка, actual - расчетный остаток до пулучения кэшбека
    @Test
    void CheckCashBackFrom990() {
        int amount = 990;
        CashBackHackService cashBackHackService = new CashBackHackService();

        int expected = 10;
        int actual = cashBackHackService.remain(amount);
        assertEquals(expected, actual, "Cashback calculation error!");
    }

    @Test
    void CheckCashBackFrom1000() {
        int amount = 1000;
        CashBackHackService cashBackHackService = new CashBackHackService();

        int expected = 0;
        int actual = cashBackHackService.remain(amount);
        assertEquals(expected, actual, "Cashback calculation error!");
    }
}