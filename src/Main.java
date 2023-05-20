
public class Main {
    //pasul 1: tipul metodei - public, private, protected
    //static sau nonstatic
    //pasul 3: ce date asteptam sa returnam (tip de returnare)
    //pasul 4 numele metodei - folosim verbe
    //Semnatura metodei: "public static int multiplyTwoNumbers"

            public static int multiplyTwoNumbers(int numberOne, int numberTwo) {
                return numberOne * numberTwo;
            }
            public static int addingThreeNumbers(int numberOne, int numberTwo, int numberThree) {
               return numberOne + numberTwo + numberThree;
           }
           public static double divideTwoNumbers(double numberOne, double numberTwo) {
               return numberOne / numberTwo;
           }
           public static int substractTwoNumbers(int numberOne, int numberTwo) {
                return numberOne - numberTwo;
           }

        public static void main(String[] args) {
        int product = addingThreeNumbers(3,5, 9);
        int product2 = multiplyTwoNumbers(6,9);
        int product3 = multiplyTwoNumbers(10,72);
        double division = divideTwoNumbers(23, 3);
        int substraction = substractTwoNumbers(91,100);

            System.out.println(product);
            System.out.println(division);
            System.out.println(product2);
            System.out.println(product3);
            System.out.println(substraction);
            System.out.println(divideTwoNumbers(50,26));
    }
}