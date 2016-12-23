package com.thoughtworks.tw101.exercises.exercise9;


import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    Node root;

    public void add(String nameOfNewNode){
        add(nameOfNewNode, root);
    }

    private void add(String nameOfNewNode, Node mainNode) {

        if (root == null) {
            root = new Node(nameOfNewNode);
        } else {
            Node parent = mainNode;

                if (nameOfNewNode.compareTo(mainNode.getName()) < 1) {
                    mainNode = mainNode.lesser;
                    if (mainNode == null) {
                        parent.lesser = new Node(nameOfNewNode);
                        return;
                    }

                } else {
                    mainNode = mainNode.greater;
                    if (mainNode == null) {
                        parent.greater = new Node(nameOfNewNode);
                        return;
                    }

                }

            add(nameOfNewNode, mainNode);
        }

    }

    public List<String> names(Node mainNode) {
         List<String>treeList = new ArrayList<String>();

        if (mainNode != null){



            List<String>treeListLesser = names(mainNode.lesser);
            treeList.addAll(treeListLesser);

            treeList.add(mainNode.getName());

            List<String>treeListGreater =  names(mainNode.greater);
            treeList.addAll(treeListGreater);
     }
       return treeList;
    }
}
