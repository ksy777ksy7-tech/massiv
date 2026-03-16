package ru.netology.stats;

public class StatsService {
    //сумма всех продаж
    public long calculateTotalSale(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    // Средняя сумма продаж
    public long calculateAverageSale(long[] sales) {
        return calculateTotalSale(sales) / sales.length;
    }

    // Номер месяца максимальных продаж (последний)
    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    // Номер месяца минимальных продаж (последний)
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    // Количество месяцев ниже среднего
    public int calculateBelowAverage(long[] sales) {
        long averageSale = calculateAverageSale(sales);
        int count = 0;

        for (long sale : sales) {
            if (sale < averageSale) {
                count++;
            }
        }

        return count;
    }

    // Количество месяцев выше среднего
    public int aboveAverage(long[] sales) {
        long averageSale = calculateAverageSale(sales);
        int count = 0;

        for (long sale : sales) {
            if (sale > averageSale) {
                count++;
            }
        }

        return count;
    }
}

