package com.dilshan.algorithmsAndDataStructures;

import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.LinkedList;

@Slf4j
public class Queue {
    public static void main(String[] args) {
        java.util.Queue<String> queue = new LinkedList<>();
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        log.info("This is queue: {}", queue);
        log.info("Is empty queue: {}", queue.isEmpty());
        log.info("Size of queue: {}", queue.size());
        log.info("Contains in queue: {}", queue.contains("Harol"));

        log.info("This is peek method: {}", queue.peek());

        queue.poll();
        log.info("This is queue: {}", queue);

        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.element();
        log.info("This is queue: {}", queue);
    }

    @Slf4j
    public static class PriorityQueue {
        public static void main(String[] args) {
            java.util.Queue<Double> gpaQueue = new java.util.PriorityQueue<>();
            //java.util.Queue<Double> gpaQueue = new java.util.PriorityQueue<>(Collections.reverseOrder()); //Reverse the order
            gpaQueue.offer(3.0);
            gpaQueue.offer(2.5);
            gpaQueue.offer(4.0);
            gpaQueue.offer(1.5);
            gpaQueue.offer(2.0);

            while (!gpaQueue.isEmpty()) {
                log.info("This is GPA QUEUE element: {}", gpaQueue.poll());
            }

            //java.util.Queue<String> gradingQueue = new java.util.PriorityQueue<>();
            java.util.Queue<String> gradingQueue = new java.util.PriorityQueue<>(Collections.reverseOrder()); //Reverse order
            gradingQueue.offer("B");
            gradingQueue.offer("A");
            gradingQueue.offer("C");
            gradingQueue.offer("F");
            gradingQueue.offer("D");
            while (!gradingQueue.isEmpty()) {
                log.info("This is GRADING QUEUE element: {}", gradingQueue.poll());
            }

        }
    }
}

