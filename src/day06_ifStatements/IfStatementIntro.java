package day06_ifStatements;

public class IfStatementIntro {

    public static void main(String[] args) {

       int number = 200;

       boolean isPositive = number > 0;
       boolean isNegative = number <0;
       boolean isZero = number ==0;

       if( isPositive){
           System.out.println(number + " is positive "); // if it is not positive will not print anything

       }
         if(isNegative){
             System.out.println( number + " is negative ");

             // if the condition is true then it will print it out

         }
        if (isZero){
            System.out.println(number + " is zero ");
        }

        System.out.println("----------------------------------------------");

        int num = 0;
         if (num > 0){
             System.out.println(num + " is positive");
         }

         if(num <0){
             System.out.println(num + "is negative number");
         }

         if(num == 0){
             System.out.println(num + " is zero ");
         }





    }


}
