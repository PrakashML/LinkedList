package com.day9.linkedlist;

public class MyNodeTest {
    public static void main(String[] args) {
        LinkedList mylist = new LinkedList();
        mylist.addnode(56);
        mylist.appendnode(70);
        mylist.inbetween(30,1);
        mylist.poplast();
        mylist.displayList();
    }
}
