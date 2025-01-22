package stack;

import linkedlist.Node;

public class Stack {
    private Node top;
    private int height ;

    public Stack(int value){
        top = new Node(value);
        height = 1;
    }

    public void push(int value) {
        var newNode = new Node(value);
        if(height == 0) {
            top = newNode;
        }else {
            var temp = top;
            top = newNode;
            top.next = temp;
        }
        height++;
    }

    public void pop(){
        if(height == 0) {
            return ;
        }
        if(height == 1) {
            top = null;
        }else {
            var temp = top;
            top = temp.next;
        }
        height -- ;
    }

    public void reverse() {
        if(height == 0 || height == 1) {
            return ;
        }
        var temp = top.next;
        Node next = null;

    }
    public void print() {
        var temp = top;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {

    }
}
