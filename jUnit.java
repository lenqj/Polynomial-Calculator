import Logic.Operations;
import Model.Monom;
import Model.Polynomial;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class jUnit {
        Polynomial polynomial1;
        Polynomial polynomial2;
        Polynomial polynomial3;
        @BeforeEach
        void setUp() {
            polynomial1 = new Polynomial();
            polynomial2 = new Polynomial();
            polynomial3 = new Polynomial();

            polynomial1.addMonom(new Monom(0, -2));
            polynomial1.addMonom(new Monom(1, 3));
            polynomial1.addMonom(new Monom(2, 1));
            polynomial2.addMonom(new Monom(1, 2));
            polynomial2.addMonom(new Monom(2, -3));
            polynomial2.addMonom(new Monom(3, 5));
        }
        @Test
        void testAdd() {
            polynomial3 = Operations.addPolynomial(polynomial1, polynomial2);
            assertEquals("-2.0x^0+5.0x^1-2.0x^2+5.0x^3", polynomial3.toString(), "First add test.");
            assertEquals("0", polynomial3.toString(), "Second add test.");
        }
        @Test
        void testMultiply() {
            polynomial3 = Operations.multiplyPolynomial(polynomial1, polynomial2);
            assertEquals("-4.0x^1+12.0x^2-17.0x^3+12.0x^4+5.0x^5", polynomial3.toString(), "First multiply test.");
            assertEquals("0", polynomial3.toString(), "Second multiply test.");
        }
        @Test
        void testSubtract() {
            polynomial3 = Operations.subtractPolynomial(polynomial1, polynomial2);
            assertEquals("-2.0x^0+1.0x^1+4.0x^2-5.0x^3", polynomial3.toString(), "First subtract test.");
            assertEquals("0", polynomial3.toString(), "Second subtract test.");
        }
        @Test
        void testDifferentiate() {
           polynomial3 = Operations.differentiatePolynomial(polynomial1);
            assertEquals("+3.0x^0+2.0x^1", polynomial3.toString(), "First differentiate test.");
            assertEquals("0", polynomial3.toString(), "Second differentiate test.");
        }
        @Test
        void testIntegral() {
           polynomial3 = Operations.integralPolynomial(polynomial1);
           assertEquals("-2.0x^1+1.5x^2+0.33x^3", polynomial3.toString(), "First integral test.");
           assertEquals("0", polynomial3.toString(), "Second integral test.");
        }

}
