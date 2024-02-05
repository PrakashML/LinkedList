package com.day9.linkedlist;

public class MyNodeTest {
    public static void main(String[] args) {
        MyNode<Integer> firstnode = new MyNode<>(56);
        MyNode<Integer> secondnode = new MyNode<>(30);
        MyNode<Integer> thirdnode = new MyNode<>(70);
        firstnode.setNext(secondnode);
        secondnode.setNext(thirdnode);
        boolean result = firstnode.getNext().equals(secondnode) && secondnode.getNext().equals(thirdnode);
        System.out.println(firstnode.getNext());
        System.out.println(result);
    }
}
