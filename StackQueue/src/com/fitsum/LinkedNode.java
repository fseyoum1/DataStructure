package com.fitsum;

public class LinkedNode<T> {

    private LinkedNode<T> next;
    private T data;


    public LinkedNode(T data, LinkedNode<T> next) {
        this.next = next;
        this.data = data;
    }

    public LinkedNode(T data) {
        this(data, null);
    }

    public LinkedNode<T> getNext() {
        return next;
    }

    public T getData() {
        return data;
    }

    public void setNext(LinkedNode<T> next) {
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node containing: " + data;
    }
}
