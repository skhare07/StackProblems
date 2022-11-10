package com.bridgelabz.stackproblems;

public class StackUC2 {
    public static void main(String[] args) {
        StackClass obj = new StackClass();
        obj.push(70);
        obj.push(30);
        obj.push(56);
        obj.Print();
        System.out.println();
        while(!obj.isEmpty()) {
            obj.peek();
            System.out.println("Pop: "+obj.pop());
        }
        System.out.println();
        obj.Print();

    }
}
