package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class for list operations.
 * <p>
 * The main feature for this class is merging two lists by alternating their elements.
 */
public class ListUtils {

    /**
     * Returns a new list with elements of list1 and list2 interleaved.
     *
     * @param list1 The first list to merge
     * @param list2 The second list to merge
     * @param <T> This is about the type of list elements.
     * @return List
     */
    public static <T> List<T> zip(List<T> list1, List<T> list2) {
        List<T> value = new ArrayList<>(list1.size() + list2.size());
        int i = 0, j = 0;
        // Alternate elements from both lists while both have the item remaining
        while (i < list1.size() && j < list2.size()) {
            value.add(list1.get(i++));
            value.add(list2.get(j++));
        }
        // Add remaining elements from list1
        while (i < list1.size()) {
            value.add(list1.get(i++));
        }
        // Add remaining elements from list2
        while (j < list2.size()) {
            value.add(list2.get(j++));
        }
        return value;
    }
}
