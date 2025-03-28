import java.util.*;
import org.junit.*;

public class MainTest {

    @Test
    public void testBinarySearch() {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13};
        Assert.assertEquals(3, Main.binarySearch(sortedArray, 7, 0, sortedArray.length - 1));
        Assert.assertEquals(0, Main.binarySearch(sortedArray, 1, 0, sortedArray.length - 1));
        Assert.assertEquals(6, Main.binarySearch(sortedArray, 13, 0, sortedArray.length - 1));
        Assert.assertEquals(-1, Main.binarySearch(sortedArray, 6, 0, sortedArray.length - 1));
        Assert.assertEquals(-1, Main.binarySearch(sortedArray, 14, 0, sortedArray.length - 1));
        Assert.assertEquals(-1, Main.binarySearch(sortedArray, 14, 0, sortedArray.length - 1));
    }
}
