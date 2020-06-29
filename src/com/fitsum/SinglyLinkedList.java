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
        if(index == 0) {
            if (size == 0) {
                LinkedListNode<T> newOne = new LinkedListNode<>(data);
                head = newOne;
                newOne.setNext(newOne);
                size++;
            } else {
                // since it is a circular linkedlist i do not have to traverse the whole linkedlist elements
                // which will be O(n), but it is possible to add at O(1)
                LinkedListNode<T> newNode = new LinkedListNode<>(data, head.getNext());
                newNode.setNext(head.getNext());
                head.setNext(newNode);
                newNode.setData(head.getData());
                head.setData(data);
                size++;

            }
        } else if (index == size) {
            // This is adding to the front of the linkedlist at a constant time
            LinkedListNode<T> newNode = new LinkedListNode<>(data, head.getNext());
            newNode.setNext(head.getNext());
            head.setNext(newNode);
            newNode.setData(head.getData());
            head.setData(data);
            head = newNode;
            size++;
        } else {
            /*
             | 1 | 2 | 3 | 4 |  add new element at index2
             | 1 | 2| * | 3 | 4|

            */

            LinkedListNode<T> traverse = head;
            for (int i = 0; i < index-1; i++) {
                traverse = traverse.getNext();
            }
            LinkedListNode<T> newNode = new LinkedListNode<>(data, traverse.getNext());
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
