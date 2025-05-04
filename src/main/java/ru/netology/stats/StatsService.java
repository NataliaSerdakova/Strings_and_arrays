package ru.netology.stats;

//Сумма всех продаж
public class StatsService {
    public long totalSum(long[] sales) {
        long sum = 0;

        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //Средняя сумма продаж в месяц
    public double averageSale(long[] sales) {
        long total = this.totalSum(sales);
        return (double) total / sales.length;
    }

    //Месяц с максимальной суммой продаж
    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    //Месяц с минимальной суммой продаж
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    //Количество месяцев, в которых продажи были ниже среднего
    public int monthsBelowAverage(long[] sales) {
        double avg = this.averageSale(sales);
        int count = 0;

        for (long sale : sales) {
            if (sale < avg) {
                count++;

            }
        }
        return count;
    }

    //Количество месяцев, в которых продажи были выше среднего
    public int monthsAboveAverage(long[] sales) {
        double avg = this.averageSale(sales);
        int count = 0;

        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }
}
