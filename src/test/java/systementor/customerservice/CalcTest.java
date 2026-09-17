package systementor.customerservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    @Test

    public void testAdd(){
        Calc calc = new Calc();
        int result = calc.add(1,2);
        assertEquals(result,3);
    }
}
