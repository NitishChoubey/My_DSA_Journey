package StackAndQueue;

import java.util.* ;
import java.util.LinkedList;
import java.util.Queue ;


public class InBuiltExamplesQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>() ; //Queue is an interface here....

        queue.add(3) ;
        queue.add(6) ;
        queue.add(5) ;
        queue.add(9) ;
        queue.add(10) ;
        queue.add(12) ;
        queue.add(14) ;

        //System.out.println(queue.peek());
        //queue.peek()  --> gives the head of the queue ...line me first person konsa h

        System.out.println(queue.remove());
        //queue.remove()  --> it will remove the element from the queue .....first element hi nklta hai queue se ...remove krega aur uss element ko return kr dega.







    }
}
