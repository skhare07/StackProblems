package com.bridgelabz.queueproblems;

public class QueueUC2 {
    public static void main(String[] args) {
        QueueClass list = new QueueClass();

        //enqueue
        list.add(56);
        list.add(30);
        list.add(70);

        list.Print();
        System.out.println();
        //dequeue
        list.remove();
        list.Print();
    }
}
