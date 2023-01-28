package com.blz.stack;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);


        while (!queue.isEmpty()) {
            System.out.println("dequeing first element: " + queue.dequeue());
        }

    }
}
