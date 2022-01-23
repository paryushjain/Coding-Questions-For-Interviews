package com.coding.questions.interviews.trees;

import java.util.*;

/**
 *       8
 *   4      12
 * 1   5  10   14
 */
public class BinarySearchTree {
    Node root;
    static Scanner sc = null;

    public BinarySearchTree() {
        root = null;
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        BinarySearchTree tree = new BinarySearchTree();
        Node root = tree.createTree();
        System.out.println("Height of tree is: "+ height(root));
        System.out.println("Size of tree is: "+ size(root));
        System.out.println("Maximum number in tree is: "+ maximumNo(root));
        System.out.println("Minimum number in tree is: "+ minimumNo(root));
        System.out.println("Printing inOrder:");
        inOrder(root);
        System.out.println("\nPrinting preOrder:");
        preOrder(root);
        System.out.println("\nPrinting postOrder:");
        postOrder(root);
        System.out.println("\nPrinting using LevelOrderTraversal:");
        printUsingLevelOrderTraversal(root);
        System.out.println("\nPrinting left view:");
        printLeftOrRightView(root,"left");
        System.out.println("\nPrinting right view:");
        printLeftOrRightView(root,"right");
        System.out.println("\nPrinting top view:");
        printTopOrBottomView(root,"top");
        System.out.println("\nPrinting bottom view:");
        printTopOrBottomView(root,"bottom");
    }

    Node createTree(){
        Node root = null;
        System.out.println("Enter the data");
        int data = sc.nextInt();
        if(data==-1) return null;
        root = new Node(data);
        System.out.println("Enter left for "+data);
        root.left=createTree();
        System.out.println("Enter right for "+data);
        root.right=createTree();
        return root;
    }

    static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    static int height(Node root){
        if(root==null)return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }

    static int size(Node root){
        if(root==null)return 0;
        return size(root.left)+size(root.right)+1;
    }

    static int maximumNo(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(maximumNo(root.left),maximumNo(root.right)));
    }

    static int minimumNo(Node root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.data,Math.min(minimumNo(root.left),minimumNo(root.right)));
    }

    static void printUsingLevelOrderTraversal(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            Node current = queue.poll();
            if(current==null){
                if(queue.isEmpty())return;
                queue.add(null);
                System.out.println("");
                continue;
            }
            System.out.print(current.data+" ");
            if(current.left!=null){
                queue.add(current.left);
            }
            if(current.right!=null){
                queue.add(current.right);
            }
        }
    }

    static void printLeftOrRightView(Node root, String view){
        List<Node> list = new ArrayList<>();
        if(view=="left") {
            leftViewUtil(root, list, 0);
        }else{
            rightViewUtil(root, list, 0);
        }
        list.forEach(l -> System.out.println(l.data));
    }

    static void leftViewUtil(Node root, List<Node> list, int level){
        if(root==null) return;
        if(list.size()<=level){
            list.add(level,root);
        }
        leftViewUtil(root.left,list,level+1);
        leftViewUtil(root.right,list,level+1);
    }

    static void rightViewUtil(Node root, List<Node> list, int level){
        if(root==null) return;
        if(list.size()<=level){
            list.add(level,root);
        }
        rightViewUtil(root.right,list,level+1);
        rightViewUtil(root.left,list,level+1);
    }

    static void printTopOrBottomView(Node root, String view){
        Map<Integer,Node> map = new TreeMap<>();
        if(view=="top") {
            topViewUtil(root, map, 0);
        }else{
            bottomViewUtil(root,map,0);
        }
        map.forEach((integer, node) -> System.out.print(node.data+" "));
    }

    static void bottomViewUtil(Node root,Map<Integer,Node> map, int step){
        if(root==null)return;
        map.put(step,root);
        bottomViewUtil(root.left,map,step-1);
        bottomViewUtil(root.right,map,step+1);
    }

    static void topViewUtil(Node root,Map<Integer,Node> map, int step){
        if(root==null)return;
        map.putIfAbsent(step,root);
        topViewUtil(root.left,map,step-1);
        topViewUtil(root.right,map,step+1);
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
