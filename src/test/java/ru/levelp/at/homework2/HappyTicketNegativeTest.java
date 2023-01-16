package ru.levelp.at.homework2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HappyTicketNegativeTest {
    @DataProvider
    public static Object[][] happyNegativeDataProvider() {
        return new Object[][] {
            {-1, -1, -1, -1, -1, -1},
            {10, 10, 10, 10, 10, 10},
            {-1, 1, 2, 1, 1, 0},
            {0, 1, 20, 1, 1, 5},
            {-10, 1, 1, 10, 0, 2}
        };
    }

    @Test (dataProvider = "happyNegativeDataProvider",
           expectedExceptions = IllegalArgumentException.class,
           expectedExceptionsMessageRegExp = "Цифры должны быть от 0 до 10!")
    public void examplehappyticketcheck(int a, int b, int c, int d, int e, int f) {
        //HappyTicket happy = new HappyTicket();
        boolean actual = HappyTicket.happyticket(a, b, c, d, e, f);
        System.out.println("actual = " + actual);
    }
}
