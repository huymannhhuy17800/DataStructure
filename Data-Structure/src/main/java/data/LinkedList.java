package data;

import units.Node;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        head = new Node(value);
        tail = head ;
        length = 1  ;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
            length = 1;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    public void removeLast() {
        if(length == 0) {
            System.out.println("Empty list");
            return;
        }
        if (length == 1) {
            head = tail = null;
        }else {
            var temp = head;
            var pre = head;
            while(temp.next != null){
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
        }
        length -- ;
    }

    public void removeFirst(){
        if(length == 0) {
            System.out.println("Empty list");
            return ;
        }
        if(length == 1) {
            head = tail = null;
        }else {
            var temp = head;
            head = head.next;
            temp.next = null;
        }
        length -- ;
    }

    public void print(){
        var temp = head;
        while(temp != null ){
            System.out.print("[" + temp.value +"]");
            temp = temp.next;
        }
    }
}
