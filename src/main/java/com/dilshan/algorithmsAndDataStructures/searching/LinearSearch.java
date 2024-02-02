package com.dilshan.algorithmsAndDataStructures.searching;

import lombok.extern.slf4j.Slf4j;

/*Linear Search in Java is a searching algorithm that is used to find the index of the desired element in an array.
It is the simplest and most basic searching algorithm. In this algorithm,
we sequentially visit each element of an array until the target element is found.*/
@Slf4j
public class LinearSearch {
    public static void main(String[] args) {
        Integer[] intArr = new Integer[10];
        for (int i = 0; i < 10; i++) {
            intArr[i] = i + 1;
        }
        int index = linearSearch(intArr, 5);
        log.info("This is the searched index: {}", index);
    }

    private static int linearSearch(Integer[] intArr, int value) {
        if (null != intArr && intArr.length > 0) {
            for (int j = 0; value < intArr.length; j++) {
                if (intArr[j] == value) {
                    return j;
                }
            }
        }
        return -1;
    }
}
