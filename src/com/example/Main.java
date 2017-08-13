package com.example;

import java.time.DayOfWeek;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Node a = new Node(6);
        Node b = new Node(3);
        Node c = new Node(8);
        Node d = new Node(5);
        Node e = new Node(9);
        Node f = new Node(2);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println(a);
        System.out.println(partition(a,5));

    }

    public static void deleteNode(Node n) {
        if (n != null && n.next != null) {
            Node next = n.next;
            n.next = next.next;
            n.data = next.data;
        }
    }

    public static Node partition(Node node, int input) {
        Node head = node;
        Node tail = node;
        while (node != null) {
            Node next = node.next;
            if (node.data < input) {
                node.next = head;
                head = node;
            } else {
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;
        return head;
    }
}




