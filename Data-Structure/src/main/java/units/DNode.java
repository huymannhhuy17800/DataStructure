package units;

public class DNode {
    public int value ;
    public DNode next;
    public DNode pre ;

    public DNode(int value) {
        this.value = value;
        next = pre = null;
    }
}
