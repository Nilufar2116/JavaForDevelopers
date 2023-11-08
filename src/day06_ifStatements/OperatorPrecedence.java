package day06_ifStatements;

public class OperatorPrecedence {

    public static void main(String[] args) {

        System.out.println(5 + 2 * 3);
        //                   5 + 6 = 11 // you must know the order of Precedence to resolve

        System.out.println( 7+ 3 - 2/ 2);
        //                  7+3 - 1 = 10-1=9
        // whichever order of precedence comes first that one will be executed first especially, when it comes to addition and subtraction

        System.out.println( - 5 + 3);
        //                    -2

        System.out.println(10 > 9 == 8 < 7);
        //                  true == false
        //                      false // because true is not as same as false

        System.out.println( 10 > 9 == 8 < 7 && "Java" == "Python" || 'a' == 'A');
        //                   true ==  false && "Java" == "Python" || 'a' == 'A'
        //                          false  &&  false ||  false
        //                               false || false
        //                                    false

        System.out.println( 100 >= 20 && 40 * 2 > 60);
        //                   100 >= 20 && 80 > 60
        //                        true && true
        //                             true

        int a = 20; // 20 + 16 = 36
        a += 10 + 2 * 3;
        // a += 10 + 6
        //  a += 16
        // a = 36





    }



}
