package com.ds.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AlgoClass {

    public static void main(String[] args) {

        String[] withDuplicates = new String[] { "one", "two", "three", "one" };
        String[] withoutDuplicates = new String[] { "one", "two", "three" };

        System.out.println("Checking array with duplicate using brute force: " + bruteforce(withDuplicates));
        System.out.println("Checking array without any duplicate using brute force: " + bruteforce(withoutDuplicates));

        System.out
                .println("Checking array with duplicate using Set and List: " + checkDuplicateUsingSet(withDuplicates));
        System.out.println("Checking array without any duplicate using Set and List: "
                + checkDuplicateUsingSet(withoutDuplicates));

        System.out
                .println("Checking array with duplicate using Set and List: " + checkDuplicateUsingAdd(withDuplicates));
        System.out.println("Checking array without any duplicate using Set and List: "
                + checkDuplicateUsingAdd(withoutDuplicates));

        System.out.println("Replce duplicates with Zero without using Collections: " + Arrays.asList(replaceDuplicateWithZero(withDuplicates)));

    }

    /**
     * Brute force way of checking if array contains duplicates in Java comparing
     * each element to all other elements of array complexity on order of O(n^2) not
     * advised in production
     */
    public static boolean bruteforce(String[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[i].equals(input[j]) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Detects duplicate in array by comparing size of List and Set since Set
     * doesn't contain duplicate, size must be less for an array which contains
     * duplicates
     */
    private static boolean checkDuplicateUsingSet(String[] withDuplicates) {
        Set<String> inputSet = new HashSet<>(Arrays.asList(withDuplicates));
        if (inputSet.size() != withDuplicates.length) {
            return true;
        }
        return false;
    }

    /**
     * Since Set doesn't allow duplicates add() return false if we try to add
     * duplicates into Set and this property can be used to check if array contains
     * duplicates in Java
     */
    private static boolean checkDuplicateUsingAdd(String[] withDuplicates) {
        Set<String> tempSet = new HashSet<>();
        for (String str : withDuplicates) {
            if (!tempSet.add(str)) {
                return true;
            }
        }
        return false;
    }

    private static String[] replaceDuplicateWithZero(String[] withDuplicates) {
        Arrays.sort(withDuplicates);
        int arrayLength = withDuplicates.length;
        String previous = null; // = withDuplicates[0];
        String[] result = new String[arrayLength];
        
        for (int i = 0; i < withDuplicates.length; i++) {
            if (previous != withDuplicates[i]) {
                result[i] = withDuplicates[i];
            } else {
                result[i] = "0";
            }
            previous = withDuplicates[i];
        }
        return result;
    }
}
