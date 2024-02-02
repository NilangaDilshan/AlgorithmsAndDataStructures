package com.dilshan.algorithmsAndDataStructures.searching;

import lombok.extern.slf4j.Slf4j;

/*Interpolation search is a search algorithm used to find the position of a specific target value within a sorted array.
It is an improvement over binary search when the data is uniformly distributed, meaning that the elements are roughly evenly spaced.
Interpolation search estimates the position of the target element by using the distribution of values in the array,
making it faster than binary search in such cases.*/
@Slf4j
public class InterpolationSearch {
    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr = {1, 2, 4, 8, 16, 32, 64, 128, 256, 510, 1024};
        int index = interpolationSearch(arr, 256);
    }

    private static int interpolationSearch(int[] arr, int value) {
        int high = arr.length - 1;
        int low = 0;
        while (value >= arr[low] && value <= arr[high] && low <= high) {
            int probe = low + (high - low) * (value - arr[low]) / (arr[high] - arr[low]);
            log.info("Probe: {}", probe);
            if (arr[probe] == value) {
                return probe;
            } else if (arr[probe] < value) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }
        return -1;
    }
}
