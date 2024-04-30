public class ListMain {
    
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addHead(1);
        list.addHead(5);
        list.addHead(7);

        list.addMid(4,4);

        list.addTail(2);
        list.addTail(3);
        list.addTail(6);
        list.addTail(9);

        list.removeHead();

        list.removeTail();

        list.removeMid(0);

        System.out.println("Elemen: ");
        list.displayElement();
    }
}
