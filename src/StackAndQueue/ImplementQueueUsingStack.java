package StackAndQueue;

import java.util.Stack ;
public class ImplementQueueUsingStack {

    protected Stack<Integer> s1 ;
    protected Stack<Integer> s2 ;

    public ImplementQueueUsingStack(){
        s1 = new Stack<>() ;  // initializing our stack
        s2 = new Stack<>() ;  // initializing our stack
    }

    public void push(int x){
        s1.push(x) ;
    }

    public int pop(){
        if(s1.isEmpty() && s2.isEmpty()){
            return -1 ;
        }

        while(!s1.isEmpty()){
            s2.push(s1.pop()) ;
        }

        int removed = s2.pop() ;
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }

        return removed ; 
    }

    public int peek() {
        if (s1.isEmpty() && s2.isEmpty()) {
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.peek();
    }

    public boolean empty(){
        return s1.isEmpty() && s2.isEmpty() ;
    }



}
