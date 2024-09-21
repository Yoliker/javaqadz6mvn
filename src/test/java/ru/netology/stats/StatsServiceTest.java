package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void getAllSumSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAllSum = 180;
        int actualAllSum = service.allMonthsSales(sales);
        Assertions.assertEquals(expectedAllSum, actualAllSum);
    }

    @Test
    public void getAverageSumSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageSum = 15;
        int actualAverageSum = service.averageMonthSales(sales);
        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }

    @Test
    public void getMaxSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void getMinSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void getLowerAverageSumSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedLowerAverageMonth = 5;
        int actualLowerAverageMonth = service.lowerAverageSalesMonths(sales);
        Assertions.assertEquals(expectedLowerAverageMonth, actualLowerAverageMonth);
    }

    @Test
    public void getHigherAverageSumSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedHigherAverageMonth = 7;
        int actualHigherAverageMonth = service.HigherAverageSalesMonths(sales);
        Assertions.assertEquals(expectedHigherAverageMonth, actualHigherAverageMonth);
    }
}
