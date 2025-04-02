package korona.bk.lesson3;

public class Converter {


    public static void ConverterIntToInteger (  int nInt ){
        Integer integer = new Integer(nInt);
        System.out.println(integer.intValue());


        Integer i1;
        i1 = nInt;
        System.out.println(i1.intValue());

        Integer i3;
        i3 = Integer.valueOf(nInt);
        System.out.println(i3);

        Integer i4;
        int int1;

        i4 = null;
        //int1 = mull;
        System.out.println(i4);
      //  System.out.println(int1);

        int a= 50;
        int b= 50;
        Integer integer5 = new Integer(50);
        Integer integer6 = new Integer(50);
        System.out.println("a == b :" + (a==b));
        System.out.println("integer5 == integer6 :" + (integer5==integer6));
        System.out.println("integer5 == a :" + (integer5==a));
        System.out.println("integer5.equals(integer6) :" + integer5.equals(integer6));

    }
}
