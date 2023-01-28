package com.blz.stack;

import java.util.LinkedList;

public class Queue {
    LinkedList<Integer> list = new LinkedList<>();

    public void enqueue(int value){
        list.addLast(value);
    }
    public Integer dequeue() {
        if (list.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list.removeFirst();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
