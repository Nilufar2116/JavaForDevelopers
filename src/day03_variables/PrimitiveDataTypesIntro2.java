package day03_variables;

public class PrimitiveDataTypesIntro2 {

    public static void main(String[] args) {

      // DataType variableName = Data;

      char a = '@'; // single character variable
       char b = '!'; // it must be within the single quote
       //char ab = 'ab';

        System.out.println(a);
        System.out.println(b);

        System.out.println("--------------------------------");

    //You can also assign a number to a char

        char ch1 = 'A';
        char ch2 = 65;

        System.out.println(ch1);
        System.out.println(ch2);

        //char ch3 = 80000; // out of char's range
        char ch3 = 4000;

        System.out.println(ch3);// gives character

        int sum = 'A' + 'B';
        System.out.println(sum); //131
        // based on the ASCII table A=65 + B=66 =131

        System.out.println("---------------------------");

        //char ch4 = -100;

        // boolean r1 = 123; not designed for integer numbers or decimal numbers
        // boolean r2 = 2.5;
        // boolean r3 = "Java";

        boolean r4 = true;
        boolean r5 = false;

        boolean r6 = 100 > 10; //true
        boolean r7 = 0 < -1; //false

        System.out.println(r6);
        System.out.println(r7);





    }





}
