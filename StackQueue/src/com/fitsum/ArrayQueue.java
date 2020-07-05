package com.fitsum;

import java.util.NoSuchElementException;

public class ArrayQueue<T> implements QueueInterface<T> {

    private T[] backingArray;
    private int front;
    private int size;


    public ArrayQueue() {
        backingArray = (T[]) new Object[INITIAL_CAPACITY];
    }

    public T dequeue() {
        if(size() == 0) {
            String message = "You cannot remove elements from the array because data structure empty";
            throw new NoSuchElementException(message);
        }
        T element = backingArray[front];
        backingArray[front] = null;
        //front++; you can't do this b/s you have to implement it using a circular array
        front = (front + 1) % backingArray.length;
        size--;
        if (size == 0) {
            front = 0;
        }

        return element;

    }

    public void enqueue(T data) {
        if (data == null) {
            throw new IllegalArgumentException("you can't add null to the data structure");
        }

        if (backingArray.length == size) {
            // regrow it
            T[] newArray = (T[]) new Object[2*INITIAL_CAPACITY];
            for (int i = 0; i < backingArray.length; i++) {
                newArray[i] = backingArray[front];
                front = (front + 1) % backingArray.length;
            }
            backingArray = newArray;
            front = 0;
        }

        int index = (front + size) % backingArray.length; // circular
        backingArray[index] = data;
        size++;


    }

    public T peek() {
        if (isEmptyQueue()) {
            return null;
        } else {
            T firstElement = backingArray[front];

            return firstElement;
        }

    }


    public boolean isEmptyQueue() {
        return size == 0;
    }

    public int size() {
        return size;
    }

}
