package day04_concatenation;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {

      //------Implicit Casting -----------

      byte a = 15;

      short b = a;
      // in the background the small implicit casting is getting assigned to larger primitive type

        System.out.println(b);

        int c = a; // we assigned the smaller primitive type to larger type

        long d = 3000L; // in order to assign it 3000 as long we must add l/L

        float f = d;
        System.out.println(d);

        //-------Explicit Casting -------------

        int x = 100;
        byte y = (byte)x;

        System.out.println(y);


        float z = 25.8F; // add f/F to add as float value
        short q = (short)z;
        System.out.println(q); // z = 25

        double n1 = 2.5; // double cannot be assigned to another other primitive types because it is the largest primitive type

        byte n2 = (byte) n1; // n1 = 2.5;

        System.out.println(n2);

        System.out.println("---------------------------------------------------");

        int num = 500;
        byte result = (byte) num; // explicit casting

        System.out.println(result);

        int r = 50000;// 50000 is out of the short range (32,768) so it gives negative amount
        short t = (short) r;

        System.out.println(t);

        double u = 3000.5;

        int p = (int) u; // explicit casting
        System.out.println(p); // the result will be int number without decimal


        int o = 100;
        double d1 = o;
        System.out.println(d1);






    }



}
