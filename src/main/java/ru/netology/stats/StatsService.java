package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverage(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int findMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[maxMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int findMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int findAverageMonth(int[] sales) {


        int amountMonth = 0; // количество месяцев в которых продажи были ниже среднего
        int average = calculateAverage(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                amountMonth++;
            }
        }
        return amountMonth;
    }


    public int findAdoveAverageMonth(int[] sales) {


        int amountMonth = 0; // количество месяцев в которых продажи были ниже среднего
        int average = calculateAverage(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                amountMonth++;
            }
        }
        return amountMonth;
    }
}
