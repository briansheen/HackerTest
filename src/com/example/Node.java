package com.example;

/**
 * Created by bsheen on 8/12/17.
 */
public class Node {
    Node next = null;
    Integer data;

    public Node(int d){
        this.data = d;
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", data=" + data +
                '}';
    }
}
