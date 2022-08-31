import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MultiplyTest {

    @Test
    void addTest() {

        //given
        int num1 = 50;
        int num2 = 51;

        //when
        int actual = Multiply.add(num1, num2);

        //then
        assertEquals(101, actual);
    }

    @Test
    void checkTest() {
        //given
        int num1 = 50;
        int num2 = 51;

        //when
        int actual2 = Multiply.check(num1, num2);

        //then
        assertEquals(1, actual2);
    }


}
