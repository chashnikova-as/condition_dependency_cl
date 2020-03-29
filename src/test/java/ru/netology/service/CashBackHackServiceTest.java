package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashBackHackServiceTest {

    @Test
    void CheckCashBackFrom999() {
        int amount = 999;
        CashBackHackService cashBackHackService = new CashBackHackService();

        int expected = 0;
        int actual = cashBackHackService.remain(amount);
        assertEquals(expected, actual, "Cashback calculation error!");
    }

    @Test
    void CheckCashBackFrom1000() {
        int amount = 1000;
        CashBackHackService cashBackHackService = new CashBackHackService();

        int expected = 1000;
        int actual = cashBackHackService.remain(amount);
        assertEquals(expected, actual, "Cashback calculation error!");
    }
}