package StackAndQueue;

import java.util.Stack ;

public class InBuiltExamplesStack {

    public static void main(String[] args) {

        Stack<Integer>  stack = new Stack<>()  ;
        stack.push(11) ;
        stack.push(31) ;
        stack.push(2);
        stack.push(18) ;
        stack.push(1) ;

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
       // System.out.println(stack.pop());



    }
}
