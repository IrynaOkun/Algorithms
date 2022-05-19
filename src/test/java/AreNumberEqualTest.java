import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)



public class AreNumberEqualTest {

    @Order(1)
    @Test
    public void testAreNumberEqualHappyPathBothPositiveValue() {
        int num1 = 89;
        int num2 = 89;
        int expectedResult = 0;

        AreNumberEqual ane = new AreNumberEqual();
        int actualResult = ane.aAreNumberEqual(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testAreNumberEqualHappyPathFirstNegative() {
        int num1 = -89;
        int num2 = 89;
        int expectedResult = -1;

        AreNumberEqual ane = new AreNumberEqual();
        int actualResult = ane.aAreNumberEqual(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testAreNumberEqualHappyPathSecondNegative() {
        int num1 = 89;
        int num2 = -89;
        int expectedResult = 1;

        AreNumberEqual ane = new AreNumberEqual();
        int actualResult = ane.aAreNumberEqual(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testAreNumberEqualHappyPathBothZero() {
        int num1 = 0;
        int num2 = 0;
        int expectedResult = 0;

        AreNumberEqual ane = new AreNumberEqual();
        int actualResult = ane.aAreNumberEqual(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testAreNumberEqualHappyPathFirstZeroSecondPositive() {
        int num1 = 0;
        int num2 = 1;
        int expectedResult = -1;

        AreNumberEqual ane = new AreNumberEqual();
        int actualResult = ane.aAreNumberEqual(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testAreNumberEqualHappyPathSecondZeroFirstNegative() {
        int num1 = -1;
        int num2 = 0;
        int expectedResult = -1;

        AreNumberEqual ane = new AreNumberEqual();
        int actualResult = ane.aAreNumberEqual(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }



}
