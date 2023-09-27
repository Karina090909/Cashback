package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackServiceTest {

    @org.junit.Test
    public void testRemain() {
        CashbackService service = new CashbackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testRemainOver1000() {
        CashbackService service = new CashbackService();
        int amount = 1200;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testRemainWithCashback() {
        CashbackService service = new CashbackService();
        int amount = 700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void testRemainZero() {
        CashbackService service = new CashbackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);

    }
}


