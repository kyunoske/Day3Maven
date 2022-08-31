public class Multiply {

    public static void main(String[] args) {
        int firstNumber = 75;
        int secondNumber = 42;

        add(firstNumber, secondNumber);
        check(firstNumber, secondNumber);

        System.out.println(add(firstNumber, secondNumber));

        if (check(firstNumber, secondNumber) > 0) {
            System.out.println(add(firstNumber, secondNumber) + " is " + check(firstNumber, secondNumber) + " greater than 100");
        } else {
            System.out.println(add(firstNumber, secondNumber) + " is " + check(firstNumber, secondNumber) + " lesser than 100");
        }
    }

    public static int add(int val1, int val2) {
        return val1 + val2;
    }

    public static int check(int val1, int val2) {
        return (val1 + val2) - 100;
    }

}
