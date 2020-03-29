package ru.netology.service;

public class CashBackHackService {
    private final int boundary = 1000;
/**
 * @param amount сумма покупки
 * @return необходима для добавления сумма для начисления кэшбэка
 */
    public int remain(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("amount must be greater than zero");
        }

        boolean isNeedMore = amount % boundary != 0;
        if (!isNeedMore) {
            return 0;
        }

        int remain = boundary - amount % boundary;
        return remain;
    }
}