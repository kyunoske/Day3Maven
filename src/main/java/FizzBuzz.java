public class FizzBuzz {
    public static String fizzbuzz(int value) {

        for (int i = 1; i <= 15; i++) {
            if ((i % 15) ==0) {
                System.out.println("fizzBuzz");
            } else if ((i % 3) == 0) {
                System.out.println("fizz");
            } else if ((i % 5) == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }

        return String.valueOf(value);
    }
}
