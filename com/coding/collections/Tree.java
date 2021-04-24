package com.coding.collections;

import java.util.Scanner;

public class Tree {

    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println(createTree());
    }

    static Node createTree(){
        Node root = null;
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        root = new Node(data);
        root.left = createTree();
        root.right = createTree();
        return root;
    }


}

class Node{
    Node left,right;
    int data;
    public Node(int data){
        this.data=data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "left=" + left +
                ", right=" + right +
                ", data=" + data +
                '}';
    }
}
