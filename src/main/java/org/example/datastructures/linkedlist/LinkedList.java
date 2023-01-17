package org.example.datastructures.linkedlist;

import java.net.HttpRetryException;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    //add a new node to the end of the list
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    //add a new node to the beginning of the list
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    //remove the first node from the list
    public Node removeFirst() {
        if (length == 0) return null;
        Node firstNode = head;
        head = head.next;
        firstNode.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return firstNode;
    }

    //remove the last node from the list
    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    //getting a node by index
    public Node get(int index) {
        if (index < 0 || index >= length) throw new ArrayIndexOutOfBoundsException();
        int i = 0;
        Node temp = head;
        while (i != index) {
            temp = temp.next;
            i++;
        }
        return temp;
    }

    //setting a node by index
    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }


    //inserting a node by index
    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node pre = get(index - 1);
        newNode.next = pre.next;
        pre.next = newNode;
        length++;
        return true;
    }

    //remove a node by index
    public Node remove(int index) {
        if (index < 0 || index >= length) throw new ArrayIndexOutOfBoundsException();
        if (index == 0) {
            return removeFirst();
        }
        if (index == length - 1) {
            return removeLast();
        }
        Node pre = get(index - 1);
        Node temp = pre.next;
        pre.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    //reverse the list
    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;

        Node after;
        Node before = null;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    //test method
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    //test method
    public void getHead() {
        System.out.println("Head: " + head);
    }

    //test method
    public void getTail() {
        System.out.println("Tail: " + tail);

    }

    //test method
    public void getLength() {
        System.out.println("Length: " + length);
    }
}
