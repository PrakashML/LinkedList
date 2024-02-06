package com.day9.linkedlist;

public class LinkedList {
    MyNode head;
    MyNode next;
    MyNode tail;
    MyNode data;
    public LinkedList(){
        this.head = null;
    }

    public void addnode(int data){
        MyNode newnode = new MyNode(data);
        newnode.next = head;
        head = newnode;
    }

    public void appendnode(int data){
        MyNode newnode = new MyNode(data);

        if(head == null){
            head = newnode;
            return;
        }
        MyNode last = head;
        while(last.next != null){
            last = last.next;
        }

        last.next = newnode;
    }


    public void displayList(){
        MyNode current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("END");
    }
}
