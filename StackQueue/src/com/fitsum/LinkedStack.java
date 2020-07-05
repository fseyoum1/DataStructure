package com.fitsum;

import java.util.NoSuchElementException;

public class LinkedStack<T> implements StackInterface<T> {

    private LinkedNode<T> head;
    private int size;


    @Override
    public T pop() {
        if (isEmptyLinked()) {
            throw new NoSuchElementException("It is empty, no elements");
        }

        T output = head.getData();
        head = head.getNext();
        size--;

        if (size == 0) {
            head = null;
        }

        return output;
    }

    @Override
    public void push(T data) {
        if (data == null) {
            throw new IllegalArgumentException("can't add null to the data structure.");
        }
        LinkedNode<T> toAdd = new LinkedNode<>(data);
        if (size == 0) {
            head = toAdd;
        } else {
            head.setNext(toAdd);
            head = toAdd;
        }
        size++;

    }

    @Override
    public T peek() {
        if(isEmptyLinked()) {
            return null;
        } else {
            T dataToReturn = head.getData();
            return dataToReturn;
        }
    }

    @Override
    public int size() {
        return size;
    }

    public boolean isEmptyLinked() {
        return size == 0;
    }
}
