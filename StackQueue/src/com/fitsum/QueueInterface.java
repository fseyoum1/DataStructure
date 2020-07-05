package com.fitsum;

public interface QueueInterface<T> {

    int INITIAL_CAPACITY = 10;

    public T dequeue();

    public void enqueue(T data);

    public T peek();

    //public boolean isEmpty();

    public int size();


}
