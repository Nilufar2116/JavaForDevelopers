package day03_variables;

public class PrimitiveDataTypesIntro {

    public static void main(String[] args) {

        // DataType variableName = Data;

        // byte a = "Java"; // byte ONLY accepts integer values (-128 ~ 127)
        // byte a = 20.5; // because byte does not take decimal numbers
        // byte a = 2000; // because out of byte's range (-128 ~ 127)
        byte a = 20;

        // price of the car is $17500. In order to declare a variable must choose a right dateType first in order to store a variable/value in the data.

        short p = 17500;
        System.out.println("p"); // you cannot use double quote because it only used for string of text
        System.out.println(p);

        // salary is $95000 // preferred

        int s = 95000;
        System.out.println(s);

        // int n = 9999999999; // out of int's range
        long n = 9999999999L; //forcefully tell the value it is a long value by adding l/L in the end of the number value

        //gpa is 3.5
        double gpa1 = 3.5; //preferred dataType to all the decimal numbers

        float gpa2 = 3.5F; // force the value to take as float by adding f/F at the end of this data









    }
}
