package day05_operators;

public class RelationalOperators2 {
    public static void main(String[] args) {

        // Equal operator ==;

        System.out.println( 1000 == 1000);
        System.out.println("Java" == "Java"); //true because it is the same name

        System.out.println("java" == "JAVA"); // false because one is upper case the other is not

        System.out.println("Muhtar" == "Good Guy"); // false
        System.out.println(true == false); // false

        System.out.println("--------------------------------------------------------");
    //Not equal operator !=;  (opposite of equal)

        System.out.println(1000 != 2000); // true
        System.out.println("Java" != "Java"); //false it does equal because it is the same name and same letter sizes
        System.out.println("java" != "JAVA"); // true
        System.out.println("Muhtar" != "Good Guy"); // true
        System.out.println(true != false); // true



    }



}
