package com.thoughtworks.tw101.exercises.exercise9;

public class Node {
    private String name;
    Node lesser;
    Node greater;


    public Node(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }
}
