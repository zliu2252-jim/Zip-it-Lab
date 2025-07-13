package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the zip method in the main app.
 */
class AppTest {

    /**
     * Tests zipping two integer lists of equal length.
     */
    @Test
    void testZipWithIntegers() {
        List<Integer> nums1 = List.of(1, 3, 5, 7);
        List<Integer> nums2 = List.of(2, 4, 6, 8);
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8), App.zip(nums1, nums2));
    }

    /**
     * Tests zipping two string lists where there contains more words in the second list.
     */
    @Test
    void testZipWithStrings() {
        List<String> colors1 = List.of("Red", "Green", "Blue");
        List<String> colors2 = List.of("White", "Black", "Orange", "Pink", "Fuschia");
        assertEquals(
                List.of("Red", "White", "Green", "Black", "Blue", "Orange", "Pink", "Fuschia"),
                App.zip(colors1, colors2)
        );
    }

    /**
     * Tests zipping where the first list is shorter than the second list.
     */
    @Test
    void testZipFirstListShorter() {
        List<String> a = List.of("x", "y");
        List<String> b = List.of("1", "2", "3", "4");
        assertEquals(List.of("x", "1", "y", "2", "3", "4"), App.zip(a, b));
    }

    /**
     * Tests zipping where the second list is shorter than the first list.
     */
    @Test
    void testZipSecondListShorter() {
        List<String> a = List.of("x", "y", "z");
        List<String> b = List.of("1");
        assertEquals(List.of("x", "1", "y", "z"), App.zip(a, b));
    }
}
