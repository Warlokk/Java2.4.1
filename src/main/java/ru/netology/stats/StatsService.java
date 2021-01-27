package ru.netology.stats;

public class StatsService {
    public long salesSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long averageSales(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        long average = sum / purchases.length;
        return average;
    }

    public int maxSalesMonth(long[] purchases) {
        int maxSalesMonth = 0;
        long currentMax = purchases[0];
        int month = 0;
        for (long purchase : purchases) {
            month++;
            if (currentMax <= purchase) {
                currentMax = purchase;
                maxSalesMonth = month;
            }
        }
        return maxSalesMonth;
    }

    public int minSalesMonth(long[] purchases) {
        int minSalesMonth = 0;
        long currentMin = purchases[0];
        int month = 0;
        for (long purchase : purchases) {
            month++;
            if (currentMin >= purchase) {
                currentMin = purchase;
                minSalesMonth = month;
            }
        }
        return minSalesMonth;
    }

    public int numberOfMonthsSalesUnderAverage(long[] purchases) {
        long average = averageSales(purchases);
        int month = 0;
        for (long purchase : purchases) {
            if (purchase < average) {
                month++;
            }
        }
        return month;
    }

    public int numberOfMonthsSalesOverAverage(long[] purchases) {
        long average = averageSales(purchases);
        int month = 0;
        for (long purchase : purchases) {
            if (purchase > average) {
                month++;
            }
        }
        return month;
    }

}
