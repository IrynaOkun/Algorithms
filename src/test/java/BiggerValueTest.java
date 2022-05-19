import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class BiggerValueTest {

    @Order(1)
    @Test
    public void testBiggerValueHappyPath() {
        int n1 = 3333;
        int n2 = 9999;
        int expectedResult = 9999;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValueAlgorithm(n1, n2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testBiggerValueHappyPathNegative() {
        int n1 = -3333;
        int n2 = -9999;
        int expectedResult = -3333;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValueAlgorithm(n1, n2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testBiggerValueHappyPathEqual() {
        int n1 = 3333;
        int n2 = 3333;
        int expectedResult = 0;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValueAlgorithm(n1, n2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testBiggerValueHappyPathZero() {
        int n1 = 0;
        int n2 = 3333;
        int expectedResult = 3333;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValueAlgorithm(n1, n2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testBiggerValueHappyPathZeroBoth() {
        int n1 = 0;
        int n2 = 0;
        int expectedResult = 0;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValueAlgorithm(n1, n2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
