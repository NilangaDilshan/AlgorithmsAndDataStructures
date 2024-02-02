package com.dilshan.algorithmsAndDataStructures;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DynamicArray {

    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray() {
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data) {
        if (size >= capacity) {
            this.grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data) {
        if (size >= capacity) {
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                for (int j = 0; j < (size - i - 1); j++) {
                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;
                if (size <= (int) (capacity / 3)) {
                    shrink();
                }
                break;
            }
        }
    }

    public int search(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    private void grow() {
        int newCapacity = (int) capacity * 2;
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    private void shrink() {
        int newCapacity = (int) capacity / 2;
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        String string = "";
        for (int i = 0; i < size; i++) {
            string += array[i] + ", ";
        }
        if (string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        } else {
            string = "[]";
        }
        return string;
    }

    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        log.info("Array Default Capacity: {}", array.capacity);
        array.add("A");
        array.add("B");
        array.add("C");
        array.insert(0, "X");
        log.info("Array To String: {}", array.toString());
        array.delete("B");
        log.info("Array To String: {}", array.toString());
        log.info("Array Size: {}", array.size);
        log.info("Array Is Empty: {}", array.isEmpty());


        int searchResult = array.search("C");
        log.info("Array Search: {} Value: {}", searchResult, array.array[searchResult]);

        DynamicArray array2 = new DynamicArray(5);
        log.info("Array2 Default Capacity: {}", array2.capacity);

        DynamicArray sizeTest = new DynamicArray(3);
        sizeTest.add("A");
        sizeTest.add("B");
        sizeTest.add("C");
        sizeTest.add("D");
        log.info("Array size test: {}", sizeTest.size);


        DynamicArray sizeTestShrink = new DynamicArray(6);
        sizeTestShrink.add("A");
        sizeTestShrink.add("B");
        sizeTestShrink.add("C");

        sizeTestShrink.delete("C");
        sizeTestShrink.add("C");
        sizeTestShrink.add("D");
        log.info("Array size shrink test: {}", sizeTestShrink.capacity);

    }
}
