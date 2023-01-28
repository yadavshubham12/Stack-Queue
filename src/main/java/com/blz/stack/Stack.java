package com.blz.stack;

import java.util.LinkedList;

public class Stack {
    LinkedList<Integer> list = new LinkedList<>();

    public void push(int value){
        list.add(value);
    }
    public Integer pop() {
        if (list.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.removeFirst();
    }
    public Integer peek() {
        if ( list.isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return list.getFirst();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
