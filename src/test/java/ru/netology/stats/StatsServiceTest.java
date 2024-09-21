package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void getAllSumSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAllSum = 180;
        long actualAllSum = service.allMonthsSales(sales);
        Assertions.assertEquals(expectedAllSum, actualAllSum);
    }

    @Test
    public void getAverageSumSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageSum = 15;
        long actualAverageSum = service.averageMonthSales(sales);
        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }

    @Test
    public void getMaxSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMaxMonth = 8;
        long actualMaxMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void getMinSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMinMonth = 9;
        long actualMinMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void getLowerAverageSumSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedLowerAverageMonth = 5;
        long actualLowerAverageMonth = service.lowerAverageSalesMonths(sales);
        Assertions.assertEquals(expectedLowerAverageMonth, actualLowerAverageMonth);
    }

    @Test
    public void getHigherAverageSumSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedHigherAverageMonth = 5;
        long actualHigherAverageMonth = service.higherAverageSalesMonths(sales);
        Assertions.assertEquals(expectedHigherAverageMonth, actualHigherAverageMonth);
    }
}
