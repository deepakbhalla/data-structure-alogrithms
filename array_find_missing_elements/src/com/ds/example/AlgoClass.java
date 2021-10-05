package com.ds.example;

import java.util.Arrays;
import java.util.BitSet;

public class AlgoClass {

    public static void main(String[] args) {
        // one missing number
        printMissingNumber(new int[] { 1, 2, 3, 4, 6 }, 6);

        // one missing number
        printMissingNumber(new int[] { 1, 2, 3, 4, 6, 7, 9, 8, 10 }, 10);

        // three missing number
        printMissingNumber(new int[] { 1, 2, 3, 4, 6, 9, 8 }, 10);

        // four missing number
        printMissingNumber(new int[] { 1, 2, 3, 4, 9, 8 }, 10);

        // Only one missing number in array
        int[] iArray = new int[] { 1, 2, 3, 5 };
        int missing = getMissingNumber(iArray, 5);
        System.out.printf("Missing number in array %s is %d %n", Arrays.toString(iArray), missing);

        // Only one missing number in array
        int[] iArray1 = new int[] { 1, 2, 5, 4 };
        int missing1 = getMissingNumber(iArray1, 5);
        System.out.printf("Missing number in array %s is %d %n", Arrays.toString(iArray1), missing1);
    }

    /**
     * * A general method to find missing values from an integer array in Java. *
     * This method will work even if array has more than one missing element.
     */
    private static void printMissingNumber(int[] numbers, int count) {
        int missingNumbersCount = count - numbers.length;
        BitSet bitSet = new BitSet(missingNumbersCount);

        for (int number : numbers) {
            bitSet.set(number - 1);
        }

        System.out.printf("Missing numbers in integer array %s, with total number %d is %n", Arrays.toString(numbers),
                count);

        int lastMissingIndex = 0;

        for (int i = 0; i < missingNumbersCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
    }

    /**
     * Java method to find missing number in array of size n containing numbers from
     * 1 to n only. can be used to find missing elements on integer array of numbers
     * from 1 to 100 or 1 - 1000
     */
    private static int getMissingNumber(int[] numbers, int totalCount) {
        int expectedSum = totalCount * ((totalCount + 1) / 2);
        int actualSum = 0;
        for (int i : numbers) {
            actualSum += i;
        }

        return expectedSum - actualSum;
    }

}
