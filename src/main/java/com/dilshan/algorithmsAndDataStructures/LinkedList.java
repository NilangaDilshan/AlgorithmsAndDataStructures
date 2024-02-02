package com.dilshan.algorithmsAndDataStructures;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<String> linkedList = new java.util.LinkedList<>();
        //This works as a stack
        /*linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();*/

        //This work as a queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        //linkedList.poll();

        linkedList.add(3, "E");
        log.info("Linked List: {}", linkedList);
        linkedList.remove("E");

        log.info("Index of an element: {}", linkedList.indexOf("D"));

        log.info("Peek First: {}", linkedList.peekFirst());
        log.info("Peek Last: {}", linkedList.peekLast());

        linkedList.addFirst("0");
        linkedList.addLast("G");
        log.info("Linked List: {}", linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();

        log.info("Linked List: {}", linkedList);
    }
}
