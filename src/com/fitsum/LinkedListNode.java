package com.fitsum;

public class LinkedListNode<T> {


    private LinkedListNode<T> next;
    private T data;

    // constructor for data only
    public LinkedListNode(T data) {
       this(data, null);
    }
    // constructor for data and linkedListNode
    public LinkedListNode(T data, LinkedListNode<T> next) {

        this.next = next;
        this.data = data;
    }
    //returns data
    public T getData() {
        return data;
    }
    public void setData(T data){
        this.data = data;
    }
    //Returns the next node
    public LinkedListNode<T> getNext() {
        return next;
    }
    //sets the next node
    public void setNext(LinkedListNode<T> next)  {
        this.next = next;
    }
    //represents the string representation of the data
    public String  toString() {
        return "Node containing:" + data;
    }
}

