package LinkedList;

public class DoublyLinkedList {

    private Node head  ;
    private Node tail ;
    private int size ;

    public DoublyLinkedList(){
        this.size = 0 ;
    }

    public void insertFirst(int val){


        Node node = new Node(val) ;
        node.next = head ;
        node.prev = null ;
        if(head != null){
        head.prev = node ;
        }
        head = node ;
        if(tail == null){
            tail = head ;
        }
        size++ ;
    }

    public void insertLast(int val) {

        Node temp = head;
        Node node = new Node(val) ;

        if(head == null){
            node.prev = null ;
            head = node;
            return;

        }
//        while (temp != null) {
//
//            if(temp.next == null){
//
//                node.next = null ;
//                node.prev = temp ;
//                temp.next = node ;
//                break ;
//
//            }else{
//
//                temp = temp.next ;
//            }
//        }

        while(temp.next != null){
            temp = temp.next ;
        }
        node.next = null ;
        temp.next = node ;
        node.prev = temp ;


    }

    public Node find(int val){
        Node temp = head ;
        while(temp != null){
            if(temp.value == val){
                return temp ;
            }
            temp = temp.next ;
        }
        return null ;
    }

    public void insert(int after , int val ){
        Node p = find(after) ;

        if(p == null){
            System.out.println("Node does not exist");
            return ;
        }

        Node node = new Node(val) ;

        node.next = p.next ;
        p.next = node ;
        node.prev = p ;
        if(node.next != null) {
            node.next.prev = node;
        }





    }

    public void display(){
        Node temp = head ;
        Node last = null ;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            last = temp ;
            temp =  temp.next ;
        }
        System.out.println("END");

        System.out.println("Print in reverse order");
        while(last != null){
            System.out.print(last.value + "->");
            last = last.prev ;
        }
        System.out.println("START");
    }


    private class Node{
        private int value ;
        private Node next ;
        private Node prev;

        public Node(int val){
            this.value= val ;
        }

        public Node(int val , Node next , Node prev){
            this.value =  val ;
            this.next =next ;
            this.prev = prev ;

        }
    }
}
