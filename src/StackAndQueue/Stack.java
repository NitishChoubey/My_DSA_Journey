package StackAndQueue;


import java.util.Scanner;

public class Stack {
        //Implementation of stack using array

    private int[] st ;
    private int capacity ;
    private int top ;

    public Stack(int size){
        this.st = new int[size] ;
        this.capacity = size ;
        top = -1 ;
    }

    public void push(int num){
        if(isFull()){
            System.out.println("Stack is full.Cannot push the element");
        }

        top = top + 1 ;
        st[top] = num ;
        System.out.println("Pushed "+ num);
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty.");
            return -1 ;
        }
        //System.out.println(top);
        //top = top - 1 ;
        //System.out.println(top);
        return st[top--] ;

    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return st[top];
    }

    public boolean isEmpty(){
        if(top == -1){
            return true ;
        }
        return false ;
    }

    public boolean isFull(){
        if(top == capacity - 1){
            return true ;
        }
        return false ;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty.");
        }
        System.out.print("Stack elements: ");
        for(int i = 0 ; i <= top ;i++){
            System.out.print(st[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the size of the stack:- ");
        int size = sc.nextInt() ;

        Stack stack = new Stack(size) ;
        stack.push(10) ;
        stack.push(20) ;
        stack.push(30) ;
        stack.display() ;
        System.out.println("Popped Element is: " + stack.pop() );
        stack.display() ;
        System.out.println("Top Element is: "+ stack.peek());



    }


}
