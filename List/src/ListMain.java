public class ListMain {
    
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(2);
        list.addTail(3);
        list.addTail(6);
        list.addTail(9);

        System.out.println("Elemen: ");
        list.displayElement();
    }
}
