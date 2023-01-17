package org.example.datastructures.bst;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myTree = new BinarySearchTree();

        myTree.insert(47);
        myTree.insert(21);
        myTree.insert(76);
        myTree.insert(18);
        myTree.insert(52);
        myTree.insert(82);

        myTree.insert(27);

        System.out.println(myTree.contains(33));
    }
}
