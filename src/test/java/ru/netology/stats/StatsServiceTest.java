package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void sumSalesForYear() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.summSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageIncomePerYear() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.averageMonthlyIncome(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthWithMaximumIncome() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 8;
        int actualDay = service.maxSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void monthWithMinimumIncome() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 9;
        int actualDay = service.minSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void monthsWithAboveAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 5;
        int actualDay = service.aboveAverage(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void monthsWithBelowAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 5;
        int actualDay = service.belowAverage(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }
}
