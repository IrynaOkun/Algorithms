import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class IsPositiveNumberTest {

    @Order(1)
    @Test

    public void testIsPositiveNumberHappyPathPositiveValue() {
        int s = 555;
        boolean expectedResult = true;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.IsPositiveNumber(s);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(2)
    @Test

    public void testIsPositiveNumberHappyPathNegativeValue() {
        int s = -555;
        boolean expectedResult = false;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.IsPositiveNumber(s);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test

    public void testIsPositiveNumberHappyPathZero() {
        int s = 0;
        boolean expectedResult = true;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.IsPositiveNumber(s);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(4)
    @Test

    public void testIsPositiveNumberHappyPathMaxValue() {
        int s = Integer.MAX_VALUE;
        boolean expectedResult = true;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.IsPositiveNumber(s);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(5)
    @Test

    public void testIsPositiveNumberHappyPathMinValue() {
        int s = Integer.MIN_VALUE;
        boolean expectedResult = false;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.IsPositiveNumber(s);

        Assertions.assertEquals(expectedResult, actualResult);

    }


}
