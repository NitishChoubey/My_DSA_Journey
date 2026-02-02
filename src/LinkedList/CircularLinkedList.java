package LinkedList;

public class CircularLinkedList {

    private Node head ;
    private Node tail ;

    public CircularLinkedList(){
        this.head =  null ;
        this.tail =  null ;
    }


    public void insert(int val){
        Node node = new Node(val );

        if(head == null){
            head=  node ;
            tail =  node ;
        }
        node.next = head ;
        tail.next = node ;
        tail =  node ;
    }

    public void delete(int val){
        Node node = head ;
        if(node == null){
            return;
        }
        if(node.val == val){
            head = head.next ;
            tail.next = head ;
            return ;
        }

        do{
            Node n = node.next ;
            if(n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next ;
        } while(node != head) ;

    }

    public void display(){
        Node temp = head ;
        while(temp.next != head){
            System.out.print(temp.val + " -> ");
            temp = temp.next ;
        }
        System.out.print(temp.val + " -> HEAD");
    }
    private class Node{
        private int val ;
        private Node next;

        public Node(int val){
            this.val = val ;
        }
    }
}
