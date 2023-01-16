package ru.levelp.at.homework2;

public class HappyTicket {

    public static boolean happyticket(int a, int b, int c, int d, int e, int f) {
        if ((a >= 10) || (a < 0) || (b >= 10) || (b < 0) || (c >= 10) || (c < 0)
            ||  (d >= 10) || (d < 0) || (e >= 10) || (e < 0) || (f >= 10) || (f < 0))  {
            throw new IllegalArgumentException("Цифры должны быть от 0 до 10!");
        }
        int sum1 = a + b + c;
        int sum2 = d + e + f;
        boolean check = sum1 == sum2;
        System.out.println("sum1 = sum2 - " + check);
        return check;
    }
}
