package chap13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    public void taxIncludedOf150() {
        assertEquals(165, Calc.taxIncluded(150));
    }

    @Test
    public void shippingIsFreeOver2000() {
        assertEquals(0, Calc.shipping(2500));
    }

    @Test
    public void shippingCostsUnder2000() {
        assertEquals(500, Calc.shipping(1200));
    }

    @Test
    public void shippingBoundary() {
        assertEquals(0, Calc.shipping(2000));   // ちょうど2000円は無料
        assertEquals(500, Calc.shipping(1999)); // 1999円は有料
    }
}