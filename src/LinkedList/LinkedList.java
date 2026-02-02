package LinkedList;

class LinkedList {

    private Node head ;   // LinkedList ka starting node usko Head bolenge  ... ye ek reference variable hai
    private Node tail ; // LinkedList ka end toh tail hoga ....ye bhi reference variable hai

    private int size ; // LinkedList ka size

    //constructor
    public LinkedList(){
        this.size = 0 ;
    }


    //Inserting the first element
    public void insertFirst(int val){
        Node node = new Node(val) ;  //phele nyaa node bnaya
        node.next = head ;  // node ko head se point kraya
        head = node ;
        if(tail == null){  // if phela node hai kewal toh , head and tail dono same hi hoga
            tail = head ;
        }
        size++ ;  // size bdhaa do ...abhi tk 0 thaa ab 1 ho jaaega
    }

    //Insert somewhere between first and last
    public void insert(int val ,int index){
        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index ==  size){
            insertLast(val);
            return;
        }

        Node temp = head ;  // ye temp node ,index waale node se ek piche
        for(int i = 1 ; i < index ; i++){
            temp = temp.next ;
        }

        Node node = new Node(val , temp.next);  // nya node banaya , and uskoo point karaya usse , jisse temp point kr rha
        temp.next = node ;  // aur temp ko point kraa diyaa , nye waale node se

        size++ ;  // size bdhaa do
    }




    // Inserting the last elementz
    public void insertLast(int val){

        //agrr list empty hua toh
        if(tail == null){
            insertFirst(val);
        }

        Node node = new  Node(val);
        tail.next = node ;
        tail = node ;

        size++ ;
    }

    // Display function

    public void display(){
        Node temp = head ;  // ke temp node bnayenge  and initially usko head waale node se point karayenge and isko move karate rhenge ..aur jb tk iski value null naa ho jaae tb tkye value print krte rhega
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next ;
        }

        System.out.println("END");
    }

    public int deleteFirst(){
        int val  = head.value;
        head = head.next ;
        if(head == null){
            tail = null ;
        }

        size-- ;
        return val ;
    }

    public int deleteLast(){

        if(size <= 1){
            return deleteFirst() ;
        }
        int val = tail.value;
        Node temp = head ;
        for(int i = 1 ; i < size - 1 ; i++){
            temp = temp.next ;
        }
        tail = temp ;
        tail.next = null;


        size-- ;

        return val ;
    }

    //now delete from any index
    public int remove(int index){
//        Node temp1 = head ;
//        for(int  i = 0 ; i < index ; i++){
//            temp1 =  temp1.next ;
//        }
//        int val  = temp1.value;

        Node temp1 = get(index) ;
        int val = temp1.value;

        Node temp2 = head;
        for(int i = 1 ; i < index ; i++){
            temp2 =  temp2.next ;
        }
        temp2.next  = temp1.next ;
        //temp1.next = null ;
        return val ;

    }

    // if we want to get the node of any given index
    public Node get(int index){
        Node node = head ;
        for(int i = 0 ; i < index ; i++){
            node = node.next ;
        }
        return node ;
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value ==  value){
                return node ;
            }
            node = node.next ;
        }
        return null ;
    }
    private class Node{

        private int value ; //Node ke pass hota hai value  ...default value = 0
        private Node next ;   // aur ye Node kis next Node ko point krega ... iska default value null hoga

        // ab constructor bnayenge ...taaki shuruat ki values de ske
        public Node(int value){
            this.value = value ;
        }

        public Node(int value , Node next){
            this.value = value ;
            this.next = next ;
        }
    }
}
