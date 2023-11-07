package day05_operators;

public class ShorthandOperators {

    public static void main(String[] args) {

     //assignment operator
     int a = 20;
        System.out.println( a ); // 20

        System.out.println( a ); //20

       a = 40;

        System.out.println(a);

        a = 90;
        System.out.println(a);  // keep assigning new data value

        System.out.println("---------------------------------------");

        //addition assignment operator
        double balance = 100;
        balance += 1000;  //balance will be reassigned to old value + to new value = 1100

        System.out.println("balance = " + balance);

        balance += 500; // the balance will be reassigned and add previous balance to current

        System.out.println( "balance = " + balance);

        System.out.println("------------------------------------------");

        //subtraction assignment operator
        balance -= 1000; // it will reassign the variable balance to new value= current balance - the balance that you will be withdrawing

        System.out.println("balance = " + balance);

        balance -= 500;
        System.out.println("balance = " +balance);

        System.out.println("--------------------------------------------------");

        //multiplication assignment operator
        double salary = 45000;
        salary *= 2;  // this variable salary will be reassigned = salary = 45000*2

        System.out.println(salary);

        salary *= 3;
        System.out.println(salary);

        double eth = 4;
        eth *= 250;

        System.out.println("eth = " +eth);

        //Division assignment operator
        eth /= 2;

        System.out.println("eth = " +eth);

        salary /= 2;

        System.out.println("salary = " + salary);
        System.out.println("----------------------------------------");

        //remainder assignment operator

        int b = 39;
        b %= 7; // variable b will be reassigned to b = 39 % 7
        System.out.println(b);



    }



}
