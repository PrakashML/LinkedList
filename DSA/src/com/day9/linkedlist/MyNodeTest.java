package com.day9.linkedlist;
import org.junit.*;

public class MyNodeTest {
    public static void main(String[] args) {
        LinkedList mylist = new LinkedList();
//        mylist.addnode(56);
//        mylist.appendnode(70);
//        mylist.inbetween(30,1);
//        System.out.println("The given value in the index: "+mylist.searchnode(30));
//        mylist.displayList();
//        mylist.insert(40,30);
//        mylist.displayList();
//        mylist.deletenode(40);
        mylist.sortadd(50);
        mylist.sortadd(10);
        mylist.sortadd(30);
        mylist.sortadd(20);
        mylist.sortadd(5);
        mylist.displayList();
    }
}
