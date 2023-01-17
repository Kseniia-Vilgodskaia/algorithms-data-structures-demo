package org.example.datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDDL = new DoublyLinkedList(7);
        myDDL.append(6);
        myDDL.append(10);

        myDDL.remove(1);

        myDDL.getHead();
        myDDL.getTail();
        myDDL.getLength();

        myDDL.printList();
    }
}
