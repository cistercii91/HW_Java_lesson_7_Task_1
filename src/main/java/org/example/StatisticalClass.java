package org.example;

public class StatisticalClass {
    public int salesAmount (int[] monthlyData){   // Сумму всех продаж
        int amount = 0;
        for (int t : monthlyData){
            amount = amount + t;
        }
        return amount;
    }

    public int averageSalesAmount (int[] monthlyData) {  // Среднюю сумму продаж в месяц
        int amount = 0;
        for (int t : monthlyData){
            amount = amount + t;
        }
        return amount / monthlyData.length;
    }

    public int maxSales (int[] monthlyData) {  //Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*
        int maxMonth = 0;

        for (int i = 0; i < monthlyData.length; i++) {
            if (monthlyData[i] >= monthlyData[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales (int[] monthlyData) {  // Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*
        int minMonth = 0;

        for (int i = 0; i < monthlyData.length; i++) {
            if (monthlyData[i] <= monthlyData[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int belowAverage (int[] monthlyData) {  // Количество месяцев, в которых продажи были ниже среднего
        int numberOfMonths = 0;
        for (int t : monthlyData){
            if (t < averageSalesAmount(monthlyData)) {
                numberOfMonths ++;
            }
        }
        return numberOfMonths;
    }

    public int aboveAverage (int[] monthlyData) {  // Количество месяцев, в которых продажи были выше среднего
        int numberOfMonths = 0;
        for (int t : monthlyData){
            if (t > averageSalesAmount(monthlyData)) {
                numberOfMonths ++;
            }
        }
        return numberOfMonths;
    }

}

// + salesAmount      Сумму всех продаж.
// + averageSalesAmount      Среднюю сумму продаж в месяц.
// + maxSales      Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*.
// + minSales      Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*.
//  belowAverage      Количество месяцев, в которых продажи были ниже среднего (см. п.2).
//  aboveAverage      Количество месяцев, в которых продажи были выше среднего (см. п.2).