package com.dilshan.algorithmsAndDataStructures;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.LinkedList;

@Slf4j
public class ArrayListAndLinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }
        startTime = System.nanoTime();
        //linkedList.get(0);
        //linkedList.get(500000);
        //linkedList.get(999999);
        //linkedList.remove(0);
        //linkedList.remove(500000);
        linkedList.remove(999999);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        log.info("Linked List Elapsed Time: {}", elapsedTime);

        startTime = System.nanoTime();
        //arrayList.get(0);
        //arrayList.get(500000);
        //arrayList.get(999999);
        //arrayList.remove(0);
        //arrayList.remove(500000);
        arrayList.remove(999999);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        log.info("Array List Elapsed Time: {}", elapsedTime);
    }
}
