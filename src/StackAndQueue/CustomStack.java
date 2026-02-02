package StackAndQueue;

public class CustomStack {
    //as we know stack in like array inside in the memory

    protected int[] data ;
    private static final int DEFAULT_SIZE = 10 ;

    int ptr = -1 ;

    public CustomStack(){
        this(DEFAULT_SIZE) ;  //agrr size nhi paas krra hai toh default size ko use kro ...array ke size ke liye
    }

    public CustomStack(int size){
        this.data = new int[size] ;  // pass your own size
    }

    //for insertion of the data --> only thing we have to do is , we have to maintain the pointer
    // initially pointer will be at -1
    // for insertion increase the pointer by 1  ;
    // for removal first remove the element at that pointer value and  then decrease the value of pointer ...
    //pointer will always point to the last element added .

    public boolean push(int item){

        //array may be full
        if(isFull()){
            System.out.println("Stack is full");
            return false ;
        }


        ptr++ ;  // increase the pointer
        data[ptr] = item ;  // add the item
        return true ;   //if item added , return true
    }

    public int pop() throws StackException {
        if(isEmpty()){  //agr arr empty hua toh ye block run krega ...kyoki jb koi element hai hi nhi toh nikaloge kisko
            throw new StackException("Cannot pop from an empty stack!!") ;
        }

        int removed = data[ptr] ;  // phele element ko nikaalo ...pointer index ke element ko nikaalo
        ptr-- ; //phir pointer ke value ko decrease kro ...kyoki ab element hai hi nhi ...toh last added element ko hi point krega pointer hmesha
        return removed ;  // phir uss removed element ko return kr do

        //agrr itna nhi likhne ka mn nhi hai toh bss itna bhi likh skte hai uprr 3 lines ke jagah pe

        //return data[ptr--] ;  // ye phele  pointer index waale data ko return krega and then pointer ki value ko increase kr dega
    }

    public int peek() throws StackException {
        // returns the element which is at the top ....ye bss dekhega ki konsa element  top pe hai stack ke ...

        if(isEmpty()){
            throw new StackException("Stack is empty , no element is at the top .  Cannot peek from an empty stack");
        }
        return data[ptr]  ;
    }

    public boolean isFull(){
        return ptr == data.length - 1 ; //ptr is at last index ,  it will return true if the pointer is at last index , otherwise it will return false
    }

    private boolean isEmpty(){
        return ptr == -1 ; // this means that arr is empty
    }

}
