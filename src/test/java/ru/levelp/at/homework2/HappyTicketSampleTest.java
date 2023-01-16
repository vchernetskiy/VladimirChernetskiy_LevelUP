package ru.levelp.at.homework2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HappyTicketSampleTest {
    @DataProvider
    public static Object[][] happyDataProvider() {
        return new Object[][] {
            {0, 4, 2, 2, 1, 3, true},
            {0, 4, 2, 3, 1, 3, false},
            {0, 0, 0, 0, 0, 0, true},
            {9, 9, 9, 9, 9, 9, true}
        };
    }

    @Test (dataProvider = "happyDataProvider")
    public void examplehappyticketcheck(int a, int b, int c, int d, int e, int f, boolean expected) {
        //HappyTicket happy = new HappyTicket();
        boolean actual = HappyTicket.happyticket(a, b, c, d, e, f);

        //assert (actual = expected);
        Assert.assertEquals(expected, actual);
    }
}
