package com.day9.linkedlist;

public class MyNode {
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int data;
    public MyNode next;
    public MyNode(int data){
        this.data = data;
        this.next = null;
    }
    public MyNode(int data, MyNode next){
        this.data = data;
        this.next = next;
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
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
