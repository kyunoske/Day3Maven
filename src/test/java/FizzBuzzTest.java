import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void fizzBuzzTestFor3() {
        //given
        int number = 3;
        //when
        String actual = FizzBuzz.fizzbuzz(number);

        //then
        assertEquals(3, actual);
    }

    @Test
    void fizzBuzzTestFor5() {
        //given
        int number = 5;
        //when
        String actual = FizzBuzz.fizzbuzz(number);

        //then
        assertEquals("buzz", actual);
    }

    @Test
    void fizzBuzzTestFor15() {
        //given
        int number = 15;

        //when
        String actual = FizzBuzz.fizzbuzz(number);

        //then
        assertEquals(15, actual);
    }
}
