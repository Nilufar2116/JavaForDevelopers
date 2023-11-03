package day04_concatenation;

import java.sql.SQLOutput;

public class Concatenation_vs_Addition {

    public static void main(String[] args) {

        System.out.println("32" + 1); // it will be one string in the end "321"

        System.out.println(7 + "1"); // you will have one string "71"

        System.out.println("13" + "2"); //"132"

        System.out.println("---------------------------------------");

        System.out.println(12 + 2.5); // This is the only time you will get addition answer "14.5"

        System.out.println("------------------------------------------");

        System.out.println("The value is " + true);





    }



}
