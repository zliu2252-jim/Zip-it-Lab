package org.example;

import java.util.List;

/**
 * Demonstrates the use of the method from the main app with integer and string lists.
 */
public class OutputCode {
    public static void main(String[] args) {
        // Example 1: Merge two lists of integers in alternating order
        List<Integer> nums1 = List.of(1, 3, 5, 7);
        List<Integer> nums2 = List.of(2, 4, 6, 8);
        List<Integer> mergedNumbers = App.zip(nums1, nums2);
        System.out.println(mergedNumbers);

        // Example 2: Merge two lists of strings in alternating order
        List<String> colors1 = List.of("Red", "Green", "Blue");
        List<String> colors2 = List.of("White", "Black", "Orange", "Pink", "Fuschia");
        List<String> mergedWords = App.zip(colors1, colors2);
        System.out.println(mergedWords);
    }
}
