package org.example.datastructures.hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();

        myHashTable.set("paints", 100);
        myHashTable.set("bolts", 50);
        myHashTable.set("nails", 80);
        myHashTable.set("tile", 20);
        myHashTable.set("lumber", 140);

        System.out.println(myHashTable.keys());

    }
}
