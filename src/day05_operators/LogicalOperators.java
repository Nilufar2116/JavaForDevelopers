package day05_operators;

public class LogicalOperators {

    public static void main(String[] args) {
      // && must be both true for the result to be true
        // we are using Logic AND Operator (&&) in order for the both of the conditions to be true

      double salary = 25000;
      int creditScore = 700;
      int age = 25;

      /*
      The first condition must be greater or equal to 30000
      second condition must be greater or equal to 650.
       */
      boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >= 18;
      //                        false// as long as one gets false then everything will be false
        System.out.println(eligibleForLoan);  //true

        System.out.println("-------------------------------------------------------");

        age = 35;
        String country = "JAPAN";

        boolean eligibleToVote = age >= 18 && country == "USA";

        System.out.println(eligibleToVote); // true

        System.out.println("-----------------------------------------------");

        String answer = "no"; //the answer cannot be both yes and no. We cannot use AND logical Operator

        boolean validAnswer = answer == "yes" || answer == "no"; // as long as one condition is true the answer will be true

        System.out.println(validAnswer);

        System.out.println("--------------------------------------");

        char grade = 'B';
        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C'|| grade == 'D';

        System.out.println(passedTheExam); //as long as one condition true all will be true.

        System.out.println("-----------------------------------------------------------");

        //Logical NOT

        System.out.println( !true);

        String a = "yes";

        boolean yes = a == "yes"; // true
        boolean no = !yes;  // opposite of no is yes // false

        System.out.println("yes = " + yes);
        System.out.println("no = " + no);

        int score = 65;

        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " +passed);
        System.out.println("failed = " +failed);

        System.out.println("----------------------------------------");

        System.out.println( (true == !false) && (false == !true) && (true != !true));
        //                      true       &&    true        &&    true



    }




}
