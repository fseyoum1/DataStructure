package com.fitsum;

import java.util.NoSuchElementException;

public class ArrayStack<T> implements StackInterface<T> {


    private T[] backingArray;
    private int size;


    public ArrayStack() {
        backingArray = (T[]) new Object[INITIAL_CAPACITY];
    }

    @Override
    public T pop() {

        if (isEmpty()) {
            throw new NoSuchElementException("Empty element");
        }
        T result = backingArray[size - 1];
        backingArray[size-1] = null;
        size--;
        return result;
    }

    @Override
    public void push(T data) {

        if (data == null) {
            throw new IllegalArgumentException("Cannot add null");
        }
        if (backingArray.length == size) {
            T[] arr = (T[]) new Object[2*INITIAL_CAPACITY];
            for (int i = 0; i < backingArray.length; i++) {
                arr[i] = backingArray[i];
            }
            backingArray = arr;
        }

        backingArray[size] = data;
        size++;

    }

    @Override
    public T peek() {

        if (isEmpty()) {
            return null;
        }else {
            T element = backingArray[size-1];
            return element;
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

}
