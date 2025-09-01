package com.example.Technical;

// Find the largest element in an array

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringElements {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hola","mama","papa","jamon","banana");
        System.out.printf("Result of largest: %s", findLargestString(list));
    }
    public static String findLargestString(List<String> lStrings) {
        String longest = lStrings.stream().max(Comparator.comparingInt(String::length)).get();
        return longest;
    }
}
