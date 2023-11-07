package day05_operators;

import org.w3c.dom.ls.LSOutput;

public class UnaryOperators {

    public static void main(String[] args){

        // pre increment/decrement

        int x = 40;

        System.out.println( ++ x); //11
        System.out.println(x); //11


        int y = 100;

        System.out.println( --y );
        System.out.println(y);

        System.out.println("------------------------------------");


        //post increment/decrement

        int a = 50;

        System.out.println(a++);
        System.out.println( a--);

        int b = 35;

        System.out.println(b--);
        System.out.println( b++);


        int n = 60;

        int m = n++;  // m = 61, n = 60

        System.out.println("n = " +n);
        System.out.println("m = " +m);

        int z = 30;

        int q = z--;  //q=30, z=29.

        System.out.println("z = " +z);
        System.out.println("q = " +q);


    }





}
