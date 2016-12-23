package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;

//// Exercise #9: Create a class Node that implements a binary tree for Strings. It should have an add(String name) method
//// that recursively finds the correct place to add a new node and a names() method that returns the names of all of the
//// nodes in alphabetical order (this should also be implemented using recursion).
//
public class Main {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.add("Ceci");

        tree.add("Michelle");
        tree.add("Bill");
        tree.add("Jagruti");
        tree.add("Tess");
        tree.add("Sue-Ellen");
        tree.add("Sara");
        tree.add("Casey");
       List<String> names = tree.names(tree.root);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
