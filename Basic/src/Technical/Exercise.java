package Technical;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * [x] Reverse a string. 
 * [x] Check for palindrome
 * Fibonacci Series
 * Factorial
 * Check for prime number
 * Count Vowels and Consonants
 * [x] Sort an array
 * [x] Merge Two Sorted Arrays
 * Find the largest element in an array
 * [] Remove Duplicates
 * Check if two strings are anagrams
 * Reverse a number
 * Calculate GCD of two Numbers
 * Check of Anagram
 * Count the numbers of Digits in a Number
 * Print the prime Numbers in a range
 * Find the second largest element in an array
 * Swap two numbers
 * Print the pascal's triangle
 * Find the missing number in an array
 * Convert for perfect number
 * Find the sum of digits of a numbers
 * Count the occurrences of a character in a string
 * Remove all whitespace from string
 * Find the common elements in two arrays
 * Find the factorial of a number using recursion
 */
public class Exercise {
    public static void main(String[] args) {
        //ReveserString.rString(new StringBuilder("Hello"));
        // Palidrome.isPalidrome("ose");
        // Fibonacci.fibonacci(10);

        int [] sort = {1,6,4,3,5,7,8,9,10,6,5,34};
        int [] sort2 = {11,42,13,74,65,36,67,78,89,10};
        // int [] newSort = Sorted.sortArray(sort);
        // System.out.printf("Sorted array: %s%n", Arrays.toString(newSort));
        // int [] newSort = Sorted.mergeArray(sort, sort2);
        // System.out.printf("Sorted array: %s%n", Arrays.toString(newSort));
    }
}

class ReveserString {
    public static void rString(StringBuilder str) {
        System.out.printf("Original str: %s%n", str);
        System.out.printf("Reverse str: %s%n", str.reverse());
    }
}

class Palidrome {
    public static void isPalidrome(String str) {
        String reverse = new StringBuilder(str).reverse().toString();
        if (str.equals(reverse)) {
            System.out.printf("Palidrome: Original -> %s ; Reverse %s%n", str, reverse);
        } else {
            System.out.printf("Palidrome: Original -> %s ; Reverse %s%n", str, reverse);
        }
    }
}

class Fibonacci {
    public static void fibonacci(int i){
        Stream.iterate(0, n -> n + 2)
            .limit(i)
            .forEach(System.out::println);
    }
    
}

class Sorted {
    public static int[] sortArray(int[] data) {
        return Arrays.stream(data).sorted().toArray();
    }

    public static int[] mergeArray(int[] array1, int[] array2) {
        return IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().toArray();
    }
}
