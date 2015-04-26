import HW4.ArraysHelper;
import HW4.MyException;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by pc on 07.04.2015.
 */
public class ArraysHelperTest {
    @Test
    public void leftUnion() throws Exception {
        // input variables
        int[] leftArray = new int[]{3, 6, 2, 4};
        int[] rightArray = new int[]{3, 6, 2, 4, 1};

        int[] expectedValue = new int[]{3, 6, 2, 4, 3, 6, 2, 4};

        // class to test
        ArraysHelper testClass = new ArraysHelper();
        // method to test
        int[] returnedValue = testClass.leftJoin(leftArray, rightArray);
        // assert
        Assert.assertArrayEquals(expectedValue, returnedValue);

    }


    @Test
    public void leftUnionWithException() throws Exception {
        // input variables
        int[] leftArray = new int[]{3, 6, 2, 4};
        int[] rightArray = new int[]{3, 6, 2, 4, 1};

        String expectedValue = "Wrong Value";

        // class to test
        ArraysHelper testClass = new ArraysHelper();

        // method to test
        try {
            testClass.leftJoin(leftArray, rightArray);
            fail("Exception should be thrown");
        } catch (MyException exception) {
            assertEquals(expectedValue, exception.getErrorCode());
        }

    }
}