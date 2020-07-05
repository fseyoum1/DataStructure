package com.fitsum;

public interface StackInterface<T> {

    int INITIAL_CAPACITY = 10;
    public T pop();

    public void push(T data);

    public T peek();

    public boolean isEmpty();

    public int size();
}
