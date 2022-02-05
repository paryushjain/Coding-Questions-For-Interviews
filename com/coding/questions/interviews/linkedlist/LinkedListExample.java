package com.coding.questions.interviews.linkedlist;

public class LinkedListExample {
    private static Node head;
    public static void main(String[] args) {
        head = null;
        insertIntoLinkedListAtTheEnd(20);
        insertIntoLinkedListAtTheEnd(30);
        insertIntoLinkedListAtTheEnd(40);
        System.out.println("Traversing LinkedList");
        traverseLinkedList(head);
        insertIntoLinkedList(10,0);
        System.out.println("\nTraversing LinkedList");
        traverseLinkedList(head);
        insertIntoLinkedList(60,2);
        System.out.println("\nTraversing LinkedList");
        traverseLinkedList(head);
        reverseListUsingRecursion(head);
        traverseLinkedList(head);
    }

    static void traverseLinkedList(Node head){
        if(null == head) return;
        System.out.print(head.data+ " ");
        traverseLinkedList(head.next);
    }

    static void insertIntoLinkedListAtTheEnd(int data){
        if(null == head){
            head = new Node(data);
            return;
        }
        Node prev=head;
        while(null != prev.next){
            prev = prev.next;
        }
        prev.next = new Node(data);
    }

    static void insertIntoLinkedList(int data, int position){
        Node newNode = new Node(data);
        if(position == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node prev = head;
        for(int i=0;i<position-1;i++){
            prev = prev.next;
        }
        newNode = prev.next;
        prev.next=newNode;
    }

    Node deleteNodeFromLinkedList(int position){
        if(position==0){
            return head.next;
        }
        Node prev = head;
        for(int i=0;i<position-1;i++){
            prev =prev.next;
        }
        prev.next=prev.next.next;
        return head;
    }
    public Node reverseList() {
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node temp = curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public static Node reverseListUsingRecursion(Node head){
        if(null==head || null==head.next){
            return head;
        }
        Node curr = reverseListUsingRecursion(head.next);
        Node prev = head.next;
        prev.next = head;
        head.next=null;
        return curr;
    }
}

class Node{
    public int data;
    public Node next;
    public Node(int data){
        this.data = data;
        next = null;
    }
}
