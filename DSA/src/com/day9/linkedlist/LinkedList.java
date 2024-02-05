package com.day9.linkedlist;

public class LinkedList {
    MyNode head;
    MyNode next;
    MyNode data;
    public LinkedList(){
        this.head = null;
    }

    public void addnode(int data){
        MyNode newnode = new MyNode(data);
        newnode.next = head;
        head = newnode;
    }

    public void displayList(){
        MyNode current = head;
        while(current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
