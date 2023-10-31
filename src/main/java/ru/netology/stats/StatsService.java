package ru.netology.stats;

public class StatsService {
    public int summSales(int[] sales) {
        int summ = 0; // переменная для расчета суммы продаж
        for (int s : sales) {
            summ = summ + s;
        }
        return summ;
    }

    public int averageMonthlyIncome(int[] sales) {
        int averageIncome = summSales(sales);
        averageIncome = averageIncome / sales.length;

        return averageIncome;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0; // переменная для хранения номера месяца с максимальными продажами

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int aboveAverage(int[] sales) {
        int higherMonths = 0; // переменная для хранения количества месяцев с продажами выше среднего

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageMonthlyIncome(sales)) {
                higherMonths = higherMonths + 1;
            }
        }

        return higherMonths;
    }

    public int belowAverage(int[] sales) {
        int belowMonths = 0; // переменная для хранения количества месяцев с продажами ниже среднего

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageMonthlyIncome(sales)) {
                belowMonths = belowMonths + 1;
            }
        }

        return belowMonths;
    }
}
