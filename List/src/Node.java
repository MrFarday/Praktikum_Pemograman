public class Node {
    private int data;
    private Node next;

    // inisialisasi Node
    public Node(int data) {
        this.data = data;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }

}
