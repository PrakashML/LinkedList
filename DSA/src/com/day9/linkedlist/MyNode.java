package com.day9.linkedlist;

public class MyNode<K> {
    private K key;
    private MyNode next;
    public MyNode(int i){
        this.key = null;
        this.next = null;
    }
    public MyNode getNext() {
        return next;
    }
    public void setNext(MyNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "MyNode{" +
                "key=" + key +
                ", next=" + next +
                '}';
    }
}
