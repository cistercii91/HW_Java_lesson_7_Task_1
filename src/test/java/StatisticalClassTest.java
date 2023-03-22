import org.example.StatisticalClass;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

// salesAmount      Сумму всех продаж.
// + averageSalesAmount      Среднюю сумму продаж в месяц.
// + maxSales      Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*.
// + minSales      Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*.
//  belowAverage      Количество месяцев, в которых продажи были ниже среднего (см. п.2).
//  aboveAverage

public class StatisticalClassTest {
    int[] monthlyData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void  testSalesAmount (){  // salesAmount      Сумму всех продаж
        int expected = 180;

        StatisticalClass service = new StatisticalClass();
        int actualResult = service.salesAmount(monthlyData);

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    void testAverageSalesAmount () {  // Среднюю сумму продаж в месяц
        int expected = 15;

        StatisticalClass service = new StatisticalClass();
        int actualResult = service.averageSalesAmount(monthlyData);

        Assertions.assertEquals(expected, actualResult);

    }

    @Test
    void testMaxSales () {  //Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*
        int expected = 8;

        StatisticalClass service = new StatisticalClass();
        int actualResult = service.maxSales(monthlyData);

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    void testMinSales () {  // Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*
        int expected = 9;

        StatisticalClass service = new StatisticalClass();
        int actualResult = service.minSales(monthlyData);

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    void testBelowAverage () {  // Количество месяцев, в которых продажи были ниже среднего
        int expected = 5;

        StatisticalClass service = new StatisticalClass();
        int actualResult = service.belowAverage(monthlyData);

        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    void testAboveAverage () {  // Количество месяцев, в которых продажи были выше среднего
        int expected = 5;

        StatisticalClass service = new StatisticalClass();
        int actualResult = service.aboveAverage(monthlyData);

        Assertions.assertEquals(expected, actualResult);
    }


}
