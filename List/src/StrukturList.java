public class StrukturList {
    private Node HEAD;

    public StrukturList() {
        this.HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addMid(int data, int position) {
        Node posNode = null;
        Node curNode = null;
        int i;
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode; // Tambah di awal jika linked list masih kosong
        } else {
            curNode = HEAD;
            if (position == 1) {
                newNode.setNext(curNode);
                HEAD = newNode; // Tambah di awal
            } else {
                i = 1;
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                posNode.setNext(newNode);
                newNode.setNext(curNode);
            }
        }
    }
    

    public void addTail(int data){
        Node posNode = null;
        Node curNode = null;

        Node newNode = new Node(data);
        if (isEmpty())
        {
            HEAD = newNode;
        }
        else{
            curNode = HEAD;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    public void addHead(int data) {
        Node newNode = new Node(data);
        if (isEmpty()){
            HEAD = newNode;
        }
        else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void removeHead() {
        if (isEmpty()){
            System.out.println("List kosong");
        }
        else {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
        }
    }

    public void removeMid(int e) {
        Node preNode = new Node(0);
        Node tempNode;
        int i;
        boolean ketemu;

        if (isEmpty()){
            System.out.println("elemen list kosong");
        }
        else{
            ketemu =false;
            i = 1;
            tempNode = HEAD;
            while (tempNode.getNext() != null && !ketemu) {
                if (tempNode.getData() == e ) {
                    ketemu = true;
                }
                else{
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }
            }

            if (ketemu == true) {
                if (i == 1) {
                    HEAD = null;
                }
                else{
                    preNode.setNext(tempNode.getNext());
                }
            }
        }
    }

    public void removeTail() {
        Node preNode = null;
        Node lastNode;

        if (HEAD != null) {
            if (HEAD.getNext() == null) {
                HEAD = null;
            }
            else{
                lastNode = HEAD;
                while (lastNode.getNext() != null) {
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }
                preNode.setNext(null);
            }
        }
    }

    public void displayElement() {
        Node curNode = HEAD;
        while  (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
    }

}
