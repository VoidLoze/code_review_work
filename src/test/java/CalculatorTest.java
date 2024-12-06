import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(1, calculator.add(1, 9));
    }

    @Test
    void dif() {
        assertEquals(10, calculator.dif(10, 0));
    }

    @Test
    void div() {
        assertEquals(10, calculator.div(30, 3));
    }

    @Test
    void times() {
        assertEquals(1, calculator.times(1, 1));
    }

    @Test
    void solver() {
        assertEquals(new Calculator().solver(2,0,1),-2);
    }
}