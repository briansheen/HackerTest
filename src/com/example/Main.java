package com.example;

import java.time.DayOfWeek;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Node a = new Node('a');
        Node b = new Node('b');
        Node c = new Node('c');
        Node d = new Node('d');
        Node e = new Node('e');
        Node f = new Node('f');
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println(a);
        deleteNode(c);
        System.out.println(a);
    }

    public static void deleteNode(Node n){
        if(n != null && n.next != null){
            Node next = n.next;
            n.next = next.next;
            n.data = next.data;
        }
    }

}




