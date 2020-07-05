package com.fitsum;

import java.util.NoSuchElementException;

public class LinkedQueue<T> implements QueueInterface<T> {

    private LinkedNode<T> head;
    private LinkedNode<T> tail;
    private int size;

    @Override
    public T dequeue() {
        if (isEmptyLinkedQueue()) {
            throw new NoSuchElementException("Empty queue");
        }

        T element = head.getData();
        head = head.getNext();
        size--;
        if (size == 0) {
            head = null;
            tail = null;
        }

        return element;
    }

    @Override
    public void enqueue(T data) {

        if (data == null) {
            throw new IllegalArgumentException("Can't add null to the data structure.");
        }
        LinkedNode<T> newNode = new LinkedNode<T>(data);

        if(size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = tail.getNext();
        }
        size++;
    }

    public T peek() {
        if (isEmptyLinkedQueue()) {
            return null;
        }

        T result = head.getData();
        return result;
    }

    public boolean isEmptyLinkedQueue() {
        return size == 0;
    }

    @Override
    public int size() {

        return size;

    }
}
