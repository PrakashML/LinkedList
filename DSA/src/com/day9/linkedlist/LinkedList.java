package com.day9.linkedlist;

public class LinkedList {
    MyNode head;
    MyNode next;
    MyNode tail;
    MyNode data;
    int size = 0;
    public LinkedList(){
        this.head = null;
    }

    public void addnode(int data){
        MyNode newnode = new MyNode(data);
        newnode.next = head;
        head = newnode;
        size++;
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
        size++;
    }

    public void popfront(){
        head = head.next;
        size--;
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
        size++;
    }

    public void insert(int data, int key){
        MyNode temp = new MyNode(data);
        MyNode current = head;
        while(current.data != key){
            current = current.next;
        }
        temp.next = current.next;
        current.next = temp;
        size++;
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
        size--;
    }

    public int searchnode(int value){
        MyNode current = head;
        int pos = 0;
        while(current != null){
            if(current.data == value){
                return pos;
            }
            current = current.next;
            pos+=1;
        }
        return 0;
    }

    public void deletenode(int data){
        MyNode current = head;
        while(current.next.data != data){
            current = current.next;
        }
        current.next = current.next.next;
        size--;
    }

    public void displayList(){
        MyNode current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("END");
        System.out.println("size of the linked list is: "+size);
    }
}
