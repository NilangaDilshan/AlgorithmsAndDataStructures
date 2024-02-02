package com.dilshan.algorithmsAndDataStructures.searching;

import lombok.extern.slf4j.Slf4j;


/*
Binary Search in Java | Implementing Binary Search Algorithm.
Binary Search in Java is a search algorithm that finds the position of a target value within a sorted array.
Binary search compares the target value to the middle element of the array. It works only on a sorted set of elements.
To use binary search on a collection, the collection must first be sorted.
*/

@Slf4j
public class BinarySearch {
    public static void main(String[] args) {
        int length = 1000000;
        int array[] = new int[length];
        int target = 359000;
        for (int i = 0; i < length; i++) {
            array[i] = i + 1;
        }
        //int index = Arrays.binarySearch(array, target);
        int index = binarySearch(array, target);
        log.info("Found element index: {}", index);
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            int value = array[middle];
            log.info("Current Middle: {}", value);
            if (value < target) {
                low = middle + 1;
            } else if (value > target) {
                high = middle - 1;
            } else return middle;
        }
        return -1;
    }
}

