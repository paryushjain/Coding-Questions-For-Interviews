package com.coding.questions.interviews.linkedlist;

/**
 * eg: 1->2->3->4->5->6->7->8->9
 * soln: 1->2->3->6->5->4->7->8->9
 */
public class ReverseLinkedList {
    public static void main(String[] args) {

    }
    Node reverseList(Node head)
    {
        // code here
        if(head.next==null)
            return head;
        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}

class Node{
    int data;
    Node next;
}
