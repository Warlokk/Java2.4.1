package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void salesSum() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.salesSum(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void averageSales() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.averageSales(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void maxSalesMonth() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSalesMonth(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void minSalesMonth() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSalesMonth(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void numberOfMonthsSalesUnderAverage() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.numberOfMonthsSalesUnderAverage(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void numberOfMonthsSalesOverAverage() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.numberOfMonthsSalesOverAverage(purchases);

        assertEquals(expected, actual);
    }
}