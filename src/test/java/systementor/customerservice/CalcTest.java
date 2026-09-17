package systementor.customerservice;

import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    public void testAdd(){
        Calc calc = new Calc();
        int result = calc.add(1,2);
        assert(result,3);
    }
}
