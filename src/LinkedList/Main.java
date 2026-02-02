package LinkedList;

public class Main {
    public static void main(String[] args) {
//        LinkedList list = new LinkedList() ;
//
//        list.insertFirst(2) ;
//        list.insertFirst(5) ;
//        list.insertFirst(7) ;
//        list.insertFirst(9);
//        list.insertFirst(11) ;
//        list.insertLast(99);
//
//        list.insert(100 , 4) ;
//        list.insert(111 , 5) ;
//        list.display();
//       // System.out.println(list.deleteFirst());
//
//        //System.out.println(list.deleteLast());
//       // list.display();
//        System.out.println(list.remove(4) );
//        list.display() ;


//        DoublyLinkedList list = new DoublyLinkedList() ;
//
//        list.insertFirst(3) ;
//        list.insertFirst(5) ;
//        list.insertFirst(7) ;
//        list.insertLast(9);
//        list.insert(5 , 65) ;
//
//        list.display()  ;

        CircularLinkedList list = new CircularLinkedList() ;
        list.insert(1) ;
        list.insert(2);
        list.insert(3) ;
        list.insert(4) ;
        list.insert(5) ;
        list.insert(6) ;
        list.delete(4) ;

        list.display() ;






    }
}
