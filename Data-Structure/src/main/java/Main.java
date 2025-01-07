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

        newLL.removeFirst();
        newLL.removeFirst();
        newLL.removeFirst();
        newLL.removeFirst();
        newLL.removeFirst();

        newLL.print();
    }
}
