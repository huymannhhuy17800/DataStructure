import stack.Stack;

public class Main {

    public static void main(String[] args) {
        // Linked List
//        LinkedList newLL = new LinkedList(0);
//
//        newLL.append(1);
//        newLL.append(1);
//        newLL.append(1);
//        newLL.append(2);
//        newLL.append(3);
//        newLL.append(3);
//        newLL.append(3);
//        newLL.append(3);
//        newLL.append(3);
//
////        newLL.removeLast();
////        newLL.removeLast();
////        newLL.removeLast();
////        newLL.removeLast();
////        newLL.removeLast();
//
////        newLL.removeFirst();
////        newLL.removeFirst();
////        newLL.removeFirst();
////        newLL.removeFirst();
////        newLL.removeFirst();
//
//        newLL.prepend(-1);
//        newLL.prepend(-2);
//
//        newLL.insert(5, 69);
//        newLL.insert(6, 699);
//        newLL.insert(6, 666);
//
//        newLL.remove(6);
//        newLL.remove(6);
//
//        newLL.reverse();
//
//        newLL.append(100);
////        Node get = newLL.get(6);
////        System.out.println(get.value);
//
//        newLL.set(6,-69);
//
//        Node middleNode = newLL.findMiddleNode();
//        System.out.println(middleNode.value);
//
//        newLL.removeDuplicates();
//
//        newLL.print();

        // Doubly Linked List
//        DoublyLinkedList newDLL = new DoublyLinkedList(0) ;
//
//        newDLL.append(1);
//        newDLL.append(2);
//        newDLL.append(3);
//        newDLL.removeLast();
//        newDLL.append(9);
////        newDLL.removeFirst();
////        newDLL.removeFirst();
////        newDLL.removeFirst();
////        newDLL.removeFirst();
//        //newDLL.removeLast();
//           // System.out.println(newDLL.get(-11).value);
//            newDLL.insert(2,69);
//        newDLL.printAll();


        // Stack
        Stack stack = new Stack(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.print();
        stack.reverse();
        System.out.println("\n--------------");
        stack.print();
    }
}
