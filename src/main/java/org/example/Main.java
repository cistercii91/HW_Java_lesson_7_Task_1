package org.example;

public class Main {
    public static void main(String[] args) {
        StatisticalClass service = new StatisticalClass();

        int[] x = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println("Сумму всех продаж "+ service.salesAmount(x));
        System.out.println("Среднюю сумму продаж в месяц "+ service.averageSalesAmount(x));
        System.out.println("Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму " + service.maxSales(x));
        System.out.println("Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму " + service.minSales(x));
        System.out.println("Количество месяцев, в которых продажи были ниже среднего " + service.belowAverage(x));
        System.out.println("Количество месяцев, в которых продажи были выше среднего " + service.aboveAverage(x));

    }
}