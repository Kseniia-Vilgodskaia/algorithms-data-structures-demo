package org.example.datastructures.queue;

//FIFO
public class Queue {
    private Node first;
    private Node last;
    private int length;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    //add a new node to the queue
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
        length++;
    }

    //remove the first node from the queue
    public Node dequeue() {
        if (length == 0) return null;
        Node node = first;
        first = first.next;
        node.next = null;
        length--;
        if (length == 0) {
            last = null;
        }
        return node;
    }

    //test method
    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    //test method
    public void getFirst() {
        System.out.println("First: " + first);
    }

    //test method
    public void getLast() {
        System.out.println("Last: " + last);

    }

    //test method
    public void getLength() {
        System.out.println("Length: " + length);
    }
}
