package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {


    @Test
    public void testTotalSum() {
        StatsService service = new StatsService();
        long[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedData = 180;
        long actualData = service.totalSum(salesData);

        Assertions.assertEquals(expectedData, actualData);
    }


    @Test
    public void testAverageSale() {
        StatsService service = new StatsService();
        long[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expectedData = 15;
        double actualData = service.averageSale(salesData);

        Assertions.assertEquals(expectedData, actualData);

    }

    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();
        long[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedData = 8;
        int actualData = service.maxSales(salesData);

        Assertions.assertEquals(expectedData, actualData);
    }

    @Test
    public void testMinSales() {
        StatsService service = new StatsService();
        long[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedData = 9;
        int actualData = service.minSales(salesData);

        Assertions.assertEquals(expectedData, actualData);
    }

    @Test
    public void testMonthsBelowAverage() {
        StatsService service = new StatsService();
        long[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedData = 5;
        int actualData = service.monthsBelowAverage(salesData);

        Assertions.assertEquals(expectedData, actualData);
    }

    @Test
    public void testMonthsAboveAverage() {
        StatsService service = new StatsService();
        long[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedData = 5;
        int actualData = service.monthsAboveAverage(salesData);

        Assertions.assertEquals(expectedData, actualData);
    }
}

