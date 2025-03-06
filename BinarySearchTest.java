import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13};

        assertEquals(3, BinarySearch.binarySearch(sortedArray, 7, 0, sortedArray.length - 1));
        assertEquals(0, BinarySearch.binarySearch(sortedArray, 1, 0, sortedArray.length - 1));
        assertEquals(6, BinarySearch.binarySearch(sortedArray, 13, 0, sortedArray.length - 1));
        assertEquals(-1, BinarySearch.binarySearch(sortedArray, 6, 0, sortedArray.length - 1));
        assertEquals(-1, BinarySearch.binarySearch(sortedArray, 14, 0, sortedArray.length - 1));
    }
}
