package doublylinkedlist;

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
        if(length == 0) {
            return ;
        }
        var temp = head;
        head.pre = null;
        head = temp.next;
        temp.next = null;
        length -- ;
    }

    public DNode get(int index) {
        if(index < 0 || index >= length) {
            return null;
        }
        var temp = head;
        for(var i = 0 ; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void set(int index, int value) {
        var temp = this.get(index);
        if(temp == null) {
            return ;
        }
        temp.value = value;
    }

    public void insert(int index, int value){
        if(index < 0 || index > length) {
            return;
        }
        if(index == 0) {
            this.prepend(value);
        }
        if(index == length){
            this.append(value);
        }
        DNode newNode = new DNode(value);
        var temp = head;
        for(var i = 0; i < index; i++) {
            temp = temp.next;
        }
        newNode.pre = temp;
        newNode.next = temp.next;
        temp.next.pre = newNode;
        temp.next = newNode;
        length++;
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
