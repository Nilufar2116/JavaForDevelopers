package day05_operators;

public class RelationalOperators {

    public static void main(String[] args) {

        // greater than >
      int a = 1000;
      int b = 200;

      // System.out.println( a > b);
        boolean aIsGreater = a > b;

        System.out.println( aIsGreater);
        System.out.println("----------------------------------");

        // Greater than or equal >=
        int score = 60;

        boolean passed = score >= 60; // as long as one of the value is true it will be true

        System.out.println(passed);

        int age = 21;

        boolean eligibleToBuyAlcohol = age >= 21;

        System.out.println(eligibleToBuyAlcohol);

        boolean eligibleToVote = age >= 18;

        System.out.println(eligibleToVote);

        System.out.println("-----------------------------");

        System.out.println( 100 >= 100);
        System.out.println(100 > 100);
        System.out.println(100 >= 185);

        System.out.println("----------------------------------");

        // less than operator <
        score = 48;

        boolean failed = score < 60; // the student score is less than 60 so the student failed TRUE
        System.out.println(failed);

        System.out.println(100 < 2000); // true
        System.out.println(100 < 20); //false

        System.out.println("-----------------------------------------");

        //less than or equal operator... as long as one of those conditions true

        System.out.println( 95 <= 100); // first condition is true therefore it was evaluated true

        System.out.println( 100 <= 100); //one condition is true so the print will be true

        System.out.println( 10 <= 5); //false

        System.out.println('a' > 'b'); // we used char primitive data.. the number will be compared from ASCII table
            //             65 >  66 : False

        //System.out.println( "Java" <+ "C#"); // >, <, >=, <= can only be applicable for number




    }



}
