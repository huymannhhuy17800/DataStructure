import data.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList newLL = new LinkedList(0);

        newLL.append(1);
        newLL.append(2);
        newLL.append(3);

//        newLL.removeLast();
//        newLL.removeLast();
//        newLL.removeLast();
//        newLL.removeLast();
//        newLL.removeLast();

//        newLL.removeFirst();
//        newLL.removeFirst();
//        newLL.removeFirst();
//        newLL.removeFirst();
//        newLL.removeFirst();

        newLL.prepend(-1);
        newLL.prepend(-2);

        newLL.insert(5, 69);
        newLL.insert(6, 699);
        newLL.insert(6, 666);

        newLL.remove(6);
        newLL.remove(6);

        newLL.reverse();
        newLL.print();
    }
}
