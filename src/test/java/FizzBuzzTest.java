import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void fizzBuzzTwoTestFor3() {
        //given
        int number = 3;
        //when
        String actual = FizzBuzz.fizzBuzzTwo(number);

        //then
        assertEquals("fizz", actual);
    }

    @Test
    void fizzBuzzTwoTestFor5() {
        //given
        int number = 5;
        //when
        String actual = FizzBuzz.fizzBuzzTwo(number);

        //then
        assertEquals("buzz", actual);
    }

    @Test
    void fizzBuzzTwoTestFor15() {
        //given
        int number = 15;

        //when
        String actual = FizzBuzz.fizzBuzzTwo(number);

        //then
        assertEquals("fizzBuzz", actual);
    }

    @Test
    void fizzBuzzTestFor3() {
        //given
        int number = 3;
        //when
        String actual = FizzBuzz.fizzBuzz(number);

        //then
        assertEquals("3", actual);
    }

    @Test
    void fizzBuzzTestFor5() {
        //given
        int number = 5;
        //when
        String actual = FizzBuzz.fizzBuzz(number);

        //then
        assertEquals("5", actual);
    }

    @Test
    void fizzBuzzTestFor15() {
        //given
        int number = 15;

        //when
        String actual = FizzBuzz.fizzBuzz(number);

        //then
        assertEquals("15", actual);
    }
}
