package com.dilshan.algorithmsAndDataStructures;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Stack {
    public static void main(String[] args) {
        java.util.Stack<String> stack = new java.util.Stack();
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Street fighter");

        log.info("Current Stack: {}", stack);
        log.info("Is empty: {}", stack.empty());

        String myFavGame = stack.pop();

        log.info("My Favorite Game: {}", myFavGame);
        log.info("Current Stack: {}", stack);
        log.info("Top Game in Stack: {}", stack.peek());
        log.info("Search in Stack: {}", stack.search("Minecraft"));


        for (int i = 0; i < 1000000000; i++) {
            stack.push("Slayer");
        }

    }

    public static class MyStack {

    }
}
