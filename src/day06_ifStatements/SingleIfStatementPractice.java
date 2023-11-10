package day06_ifStatements;

import java.util.Scanner;

public class SingleIfStatementPractice {

    public static void main(String[] args) {

        int number = 100;

        boolean isEven = number % 2 ==0;  // if the boolean variable is true it will be executed


        if(isEven){
            System.out.println("Even number"); // if the variable even number true it will print even number
        }
        if(!isEven){
            System.out.println("Odd number"); // this condition was true, therefore; it was printed
        }

        System.out.println("********************");

        if(number % 2 == 0){  // if the number divide by 2 and equal to 0 then it will be even number
            System.out.println("Even number");
        }
        //if the remainder do NOT equal 0
        if(number % 2 != 0){
            System.out.println("Odd number"); // != (NOT equal expression)
        }
    }
}
