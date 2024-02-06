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

    public void popfront(){
        head = head.next;
    }
    public void inbetween(int data, int pos){
        MyNode temp = new MyNode(data);
        int pos1 = 1;
        MyNode current = head;
        if(pos == 0){
            addnode(data);
            return;
        }
        while(pos1 != pos){
            current = current.next;
            pos1+=1;
        }
        temp.next = current.next;
        current.next = temp;
    }

    public void poplast(){
        MyNode current = head;
        if(head.next == null){
            head = null;
            return;
        }
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
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
