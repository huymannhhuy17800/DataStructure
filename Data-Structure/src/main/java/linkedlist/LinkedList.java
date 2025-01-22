package linkedlist;

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

    public Node get (int index) {
        if(index < 0 || index >= length){
            System.out.println("Index OUT OF BOUND");
            return null;
        }
        var temp = head ;
        for(var i = 0 ; i < index ; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set (int index, int value) {
        if(index < 0 || index >= length ) {
            System.out.println("Index OUT OF BOUND");
            return false;
        }
        var temp = get(index);
        if(temp == null) {
            return false;
        }
        temp.value = value;
        return true;
    }

    public void prepend(int value) {
        var newNode = new Node(value);
        if(length == 0) {
            head = tail = newNode;
        }else {
            var temp = head;
            head = newNode;
            head.next = temp;
        }
        length++;
    }
    public void insert (int index, int value) {
        if(index < 0 || index > length) {
            System.out.println("Index OUT OF BOUND");
            return ;
        }
        if(length == 0){
            prepend(value);
        }else if(index == 0){
            prepend(value);
        }else if(index == length) {
            append(value);
        }else {
            var newNode = new Node(value);
            var temp = head ;
            var pre = head;
            for(var i = 0; i < index ; i++){
                pre = temp;
                temp = temp.next;
            }
            pre.next = newNode;
            newNode.next = temp;
            length ++;
        }
    }

    public void remove(int index) {
        if(index < 0 || index >= length){
            System.out.println("Index Out Of Bound");
            return ;
        }
        if(index == 0) {
            removeFirst();
        }else if(index == length - 1) {
            removeLast();
        }else {
            var temp = head;
            var pre = head;
            for(var i = 0; i < index ; i++) {
                pre = temp ;
                temp = temp.next;
            }
            pre.next = temp.next;
            temp.next = null;
            length -- ;
        }
    }

    public void reverse() {
        if(length == 0 || length == 1) {
            System.out.println("Please don't do this with 0 or 1 item on the list");
            return ;
        }
        //Swap head and tail
        var swap = head ;
        head = tail;
        tail = swap;

        var temp = tail ;
        Node pre = null ;
        var next = tail ;
        while(temp != null) {
            next = temp.next;
            temp.next = pre;
            pre = temp;
            temp = next;
        }
    }

    public Node findMiddleNode() {
        if(head == null) {
            return null;
        }
        // Apply two pointers that one is fast x 2 than other
        var tortoise = head;
        var hare = head.next;

        while(hare != null){
            hare = hare.next;
            tortoise = tortoise.next;
            if(hare != null) {
                hare = hare.next;
            }
        }
        return tortoise;
    }

    public boolean hasLoop() {
        var tortoise = head ;
        var hare = head.next;

        while(hare != null) {
            hare = hare.next;
            tortoise = tortoise.next;
            if(hare != null ){
                hare = hare.next;
            }
            if(tortoise == hare){
                return true;
            }
        }
        return false;
    }

    public void removeDuplicates() {
        if(head == null) {
            return ;
        }
        var current = head;
        // previous node of current
        Node pre = null;
        // next node of current
        Node nex = null;
        while(current != null) {
            pre = current;
            nex = current.next;
            // go through the list to find any Node that value is equal to CURRENT
            while(nex != null) {
                if(current.value == nex.value){
                    // Skip duplicates  node by setting existed node next value to NEX next value
                    pre.next = nex.next;
                    length --;
                }else {
                    // Point PRE to NEX node and continues go to next node
                    pre = nex;
                }
                nex = nex.next;
            }
            current = current.next;
        }
    }

    public void print(){
        var temp = head;
        while(temp != null ){
            System.out.print("[" + temp.value +"]" + " ");
            temp = temp.next;
        }
        System.out.println("\nLength: " + length);
    }

}
