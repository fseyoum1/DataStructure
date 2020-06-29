package com.fitsum;

public class SinglyLinkedList<T> implements LinkedListInterface<T>{

    private LinkedListNode<T> head;
    private int size;

    public void addAtIndex(int index, T data) {

        if (data == null) {
            throw new IllegalArgumentException("Data can't be null");
        }
        if ((index < 0) || (index > size)) {
            throw new IndexOutOfBoundsException("Provide correct index");
        }

        if(index == size) {

            T headData = head.getData();
            LinkedListNode<T> newNode = new LinkedListNode<>(data, head.getNext());
            head.setNext(newNode);
            head.setData(newNode.getData());
            newNode.setData(headData);
            head = newNode;
            size++;

        } else if (index == 0) {

            LinkedListNode<T> newOne = new LinkedListNode<>(data);

            newOne.setData(data);
            head = newOne;
            head.setNext(head);
            size++;
        } else {
            LinkedListNode<T> traverse = head;
            for (int i = 0; i < index-1; i++) {
                traverse = traverse.getNext();
            }
            LinkedListNode<T> newNode = new LinkedListNode<>(data);
            newNode.setNext(traverse.getNext());
            traverse.setNext(newNode);
            size++;

        }
    }

    public void addToFront(T data) {

    }


    public void addToBack(T data) {

    }
    public T get(int index) {
        return null;
    }
    public T removeAtIndex(int index){
        return null;
    }
    public T removeFromFront(){
        return null;
    }
    public T removeFromBack() {
        return null;
    }
    public boolean removeAllOccurrences(T data) {
        return true;
    }
    public Object[] toArray() {
        return null;
    }
    public boolean isEmpty() {
        return true;
    }
    public int size() {
        return 0;
    }
    public void clear() {

    }

    public LinkedListNode<T> getHead() {
        return null;
    }

    public LinkedListNode<T> getTail() {
        return null;
    }


}
