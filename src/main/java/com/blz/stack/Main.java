package com.blz.stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(56);
        stack.push(30);
        stack.push(70);

        while (!stack.isEmpty()) {
            System.out.println("peek top element: " + stack.peek());
            System.out.println("pop top element: " + stack.pop());
        }

    }
}
