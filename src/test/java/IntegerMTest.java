import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)



public class IntegerMTest {

    @Order(1)
    @Test
    public void testIntegerMHappyPathGoodNumber() {

        int m = 15;
        String expectedResult = "Good Number";

        IntegerM im = new IntegerM();
        String actualResult = im.IntegerM(m);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(2)
    @Test
    public void testIntegerMHappyPathBadNumber() {

        int m = 9;
        String expectedResult = "Bad Number";

        IntegerM im = new IntegerM();
        String actualResult = im.IntegerM(m);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void testIntegerMHappyPathPoorNumber() {

        int m = 10;
        String expectedResult = "Poor Number";

        IntegerM im = new IntegerM();
        String actualResult = im.IntegerM(m);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(4)
    @Test
    public void testIntegerMNotValidNoOneNumber() {

        int m = 7;
        String expectedResult = "-1";

        IntegerM im = new IntegerM();
        String actualResult = im.IntegerM(m);

        Assertions.assertEquals(expectedResult, actualResult);

    }

}
