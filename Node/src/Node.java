public class Node {
    private int nilai;
    private Node next;
    private String nama;

    // inisialisasi Node
    public Node(int nilai) {
        this.nilai = nilai;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public int getNilai() {
        return nilai;
    }

}
