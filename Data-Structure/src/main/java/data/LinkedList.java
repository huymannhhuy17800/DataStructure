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

    public void print(){
        var temp = head;
        while(temp != null ){
            System.out.print("[" + temp.value +"]");
            temp = temp.next;
        }
    }
}
