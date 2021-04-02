import org.junit.Test;
import java.lang.ArithmeticException;

import static org.junit.Assert.assertEquals;

public class TestExample {
    @Test
    public void divisionTest() throws Exception {
        Calculator calc =new Calculator();
        int res = calc.setResult(12, 4, '/');
        assertEquals(3,res);
    }

    @Test
    public void checkingTheMultiplicationOperation() throws Exception {
        Calculator calc =new Calculator();
        int res = calc.setResult(12, 4, '*');
        assertEquals(48,res);
    }

    @Test
    public void checkingAdditionOperation() throws Exception {
        Calculator calc =new Calculator();
        int res = calc.setResult(12, 4, '+');
        assertEquals(16,res);
    }

    @Test
    public void subtractionCheck() throws Exception {
        Calculator calc =new Calculator();
        int res = calc.setResult(12, 4, '-');
        assertEquals(8,res);
    }

    @Test(expected = ArithmeticException.class)
    public void checkingArithmeticException() throws Exception {
        Calculator calc =new Calculator();
        int res = calc.setResult(12, 0, '/');
    }
}
