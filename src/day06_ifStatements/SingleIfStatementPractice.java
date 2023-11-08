package day06_ifStatements;

import java.util.Scanner;

public class SingleIfStatementPractice {

    public static void main(String[] args) {


        int number = 155;

        boolean isEven = number % 2 ==0;  // if the boolean variable is true it will be executed


        if(isEven){
            System.out.println("Even number");
        }
        if(!isEven){
            System.out.println("Odd number"); // this condition was true, therefore; it was printed
        }


    }
}
