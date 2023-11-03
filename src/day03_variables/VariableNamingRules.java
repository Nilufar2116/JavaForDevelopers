package day03_variables;

public class VariableNamingRules {

    public static void main(String[] args) {

      //age of the student is 28
      // salary is $10000

      int age = 28;
      int salary = 10000;

      //int age = 33; it will be compiler because the variable MUST be UNIQUE.

        int phoneNumber = 123456789;//camel case
        double salaryBeforeTax = 100000.5;
        double salary_after_tax$ = 80000.5; // Allowed to give to variable underscore and dollar sign

        System.out.println("---------------------------------------------");

        int number1 = 10; // variable name cannot start with digits
        int number2 = 20; // it can include digits in the end of the variable name
        int number3 = 30;

        //double abstract = 5.5; // because variable names cannot be Java reserved words
        //double final = 85.5; // final is Java reserved word

        System.out.println("-------------------------------------------------");

        //gender is female
        String gender = "Female";

        String fullName = "Nilufar Zaripova";

        System.out.println(gender);
        System.out.println(fullName);





    }





}
