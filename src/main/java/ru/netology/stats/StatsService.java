package ru.netology.stats;

public class StatsService {

    public long allMonthsSales(long[] sales) {
        /*long allSumSales = 0; // сумма всех продаж
        for (int i = 0; i < sales.length; i++) {
            allSumSales = allSumSales + sales[i];
        }
        return allSumSales; - 1-й вариант  */

        long allSumSales = 0;
        for (long sale : sales) {
            allSumSales = allSumSales + sale;
        }
        return allSumSales; // 2-й вариант
    }

    public long averageMonthSales(long[] sales) {
       /* long averageSumSales = 0; // средняя сумма продаж
        for (int i = 0; i < sales.length; i++) {
            averageSumSales = averageSumSales + sales[i];
        }
        return averageSumSales / sales.length; */ // 1-й вариант

        long averageSumSales = allMonthsSales(sales) / sales.length;
        return averageSumSales; // 2-й вариант
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с max продажами

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // считаем месяц
    }

    public int lowerAverageSalesMonths(long[] sales) {

        int monthsQuality = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageMonthSales(sales)) {
                monthsQuality++;
            }
        }
        return monthsQuality;  // продажи ниже среднего
    }

    public int higherAverageSalesMonths(long[] sales) {

        int monthsQuality = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageMonthSales(sales)) {
                monthsQuality++;
            }
        }
        return monthsQuality; // продажи выше среднего
    }
}




