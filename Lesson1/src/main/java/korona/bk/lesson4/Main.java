package korona.bk.lesson4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Integer i1 = 55;
        Integer i2 = 55;
        Integer i3 = 555;
        Integer i4 = 555;
        System.out.println(i1 == i2);
        System.out.println(i3 == i4);

        double a = 2.0 - 1.1;
        System.out.println(a);

        double b = 0.0 ;
        for (int i = 1; i <= 10; i++) {
            b += 0.1;

        }
        System.out.println(b);
        BigDecimal a1 = new BigDecimal("123.456");
        BigDecimal b1 = a1.multiply(new BigDecimal("7.89"));
        System.out.println(b1);


        BigDecimal a2 = new BigDecimal(123.456);
        BigDecimal b2 = a2.multiply(new BigDecimal("7.89"));
        System.out.println(b2);

        BigDecimal a3 = new BigDecimal("123.456789");
        a3 = a3.setScale(4, RoundingMode.HALF_UP);
        System.out.println(a3);
    }
}
