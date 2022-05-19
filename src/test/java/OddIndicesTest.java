import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class OddIndicesTest {

    @Order(1)
    @Test
    public void testOddIndicesTestNegativePath() {

        int [] array = {-45, 590, 234, 985, 12, 68};
        int [] expectedResult = {590, 985, 68};

        OddIndices as = new OddIndices();
        int [] actualResult = as.OddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

//    @Order(2)
//    @Test
//    public void testOddIndicesTestHappyPath() {
//
//        int [] array = {-45, 590, 234, 985, 12, 68};
//        int [] expectedResult = {-45, 983};
//
//        OddIndices as = new OddIndices();
//        int [] actualResult = as.OddInces(array);
//
//        Assertions.assertFalse(Assertions.assertArrayEquals(expectedResult, actualResult));
//
//    }

    @Order(2)
    @Test
    public void testOddIndicesEmptyArray() {

        int [] array = {};
        int [] expectedResult = {};

        OddIndices as = new OddIndices();
        int [] actualResult = as.OddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void testOddIndicesNegativeNumberScenario() {

        int [] array = {-45, -590, -234, -85, -12, -68};
        int [] expectedResult = {-590, -985, -68};

        OddIndices as = new OddIndices();
        int [] actualResult = as.OddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(4)
    @Test
    public void testOddIndicesPositiveNumberScenario() {

        int [] array = {45, 590, 234, 85, 12, 68};
        int [] expectedResult = {590, 985, 68};

        OddIndices as = new OddIndices();
        int [] actualResult = as.OddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }


}
