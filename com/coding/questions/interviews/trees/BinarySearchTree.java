package com.coding.questions.interviews.trees;

/**
 *       8
 *   4      12
 * 1   5  10   14
 */
public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        /*tree.root = new Node(8);
        tree.root.left = new Node(4);
        tree.root.right = new Node(12);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(10);
        tree.root.right.right = new Node(14);*/
        tree.insertNode(8);
        tree.insertNode(4);
        tree.insertNode(12);
        tree.insertNode(1);
        tree.insertNode(5);
        tree.insertNode(10);
        tree.insertNode(14);
        tree.breadthFirstSearch(tree.root);
        //System.out.println(tree.root.right.right.data);
        //System.out.println(tree.searchNode(tree.root,10).data);
    }

    void insertNode(int data) {
        root = insertNode(root, data);
    }

    Node insertNode(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data > root.data) {
            root.right = insertNode(root.right, data);
        } else {
            root.left = insertNode(root.left, data);
        }
        return root;
    }

    Node searchNode(Node root,int data){
        if(root == null || root.data == data){
            return root;
        }else if(root.data>data){
            return searchNode(root.left,data);
        }else{
            return searchNode(root.right,data);
        }
    }

    void breadthFirstSearch(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        breadthFirstSearch(root.left);
        breadthFirstSearch(root.right);
    }
}

class Node {
    public int data;
    public Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }

}
