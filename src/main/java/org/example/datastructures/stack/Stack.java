package org.example.datastructures.stack;

//LIFO
public class Stack {
    private Node top;
    private int height;

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    class Node {

        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    //push a new node to the stack
    public void push(int value) {
        Node newNode = new Node(value);
        if (height != 0) {
            newNode.next = top;
        }
        top = newNode;
        height++;
    }

    //get the top node from the stack
    public Node pop() {
        if (height == 0) return null;
        Node node = top;
        top = top.next;
        node.next = null;
        height--;
        return node;
    }

    //test method
    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    //test method
    public void getTop() {
        System.out.println("Top: " + top);
    }

    //test method
    public void getHeight() {
        System.out.println("Height: " + height);
    }
}
