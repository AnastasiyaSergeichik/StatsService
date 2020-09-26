package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long salesSum = 0;
        for (long sale : sales) {
            salesSum += sale;
        }
        return salesSum;
    }

    public long averageSalesSum(long[] sales) {
        long salesSum = calculateSum(sales);
        return salesSum / sales.length;
    }

    public long monthSalesWereBelowAverage(long[] sales) {
        long average = averageSalesSum(sales);
        long BelowAverage = 0;
        for (long sale : sales) {
            if (sale < average) {
                BelowAverage++;
            }
        }
        return BelowAverage;
    }

    public long monthSalesWereAboveAverage(long[] sales) {
        long average = averageSalesSum(sales);
        long AboveAverage = 0;
        for (long sale : sales) {
            if (sale > average) {
                AboveAverage++;
            }
        }
        return AboveAverage;
    }

    public long monthPeakSales(long[] sales) {
        long peak = sales[0];
        long peakCount = 0;
        long peakNumber = 0;
        for (long sale : sales) {
            peakCount++;
            if (peak <= sale) {
                peak = sale;
                peakNumber = peakCount;
            }
        }
        return peakNumber;
    }

    public long monthMinSales(long[] sales) {
        long min = sales[0];
        long minCount = 0;
        long minNumber = 0;
        for (long sale : sales) {
            minCount++;
            if (min >= sale) {
                min = sale;
                minNumber = minCount;
            }
        }
        return minNumber;
    }
}