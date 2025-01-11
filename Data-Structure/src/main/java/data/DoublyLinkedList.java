package data;

import units.DNode;

public class DoublyLinkedList {
    private DNode head;
    private DNode tail;
    private int length;

    public DoublyLinkedList(int value) {
        DNode newNode = new DNode(value);
        head = tail = newNode;
        length = 1;
    }

    public void append (int value) {
        DNode newNode = new DNode(value);
        if(length == 0) {
            head = tail = newNode;
            length ++ ;
            return ;
        }
        var temp = tail;
        temp.next = newNode;
        newNode.pre = temp;
        tail = newNode;
        length ++ ;
    }

    public void prepend (int value) {
        DNode newNode = new DNode(value);
        if (length == 0) {
            head = tail = newNode;
            length ++;
            return ;
        }
        var temp = head;
        temp.pre = newNode;
        head = newNode;
        newNode.next = temp;
        length++;
    }

    public void removeLast() {
        if(length == 0) {
            return ;
        }
        if(length == 1) {
            head = tail = null;
            length --;
            return ;
        }
        var temp = tail.pre;
        temp.next = null;
        tail = temp;
        length -- ;
    }

    public void removeFirst() {

    }
    public void print () {
        var temp = head;
        while(temp != null) {
            System.out.print("[" + temp.value + "]" + " ");
            temp = temp.next;
        }
    }

    public void printAll () {
        if(length == 0) {
            return ;
        }
        var temp = head;
        System.out.println("Head: " + head.value);
        while(temp != null) {
            System.out.print("<" + "[" + temp.value + "]" + ">");
            temp = temp.next;
        }
        System.out.println("\nTail: " + tail.value);
        System.out.println("Length: " + length);
    }

}
