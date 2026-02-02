package StackAndQueue;

import java.util.Scanner;

public class Queue1 {
    //Implementing Queue using array
    private int[] queue;
    private int currentSize;
    int capacity ;
    int start;
    int end;

    public Queue1(int size) {
        this.queue = new int[size];
        this.currentSize = 0;
        this.capacity = size;
        this.start = -1;
        this.end = -1;
    }

    public void push(int num) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot add the element");
        }
        if (start == -1) {
            start = start + 1;
            end = end + 1;
            queue[end] = num;
            currentSize = currentSize + 1;
            System.out.println(num + " is pushed");
        } else if (end == capacity) {
            end = (end) % capacity;
            queue[end] = num;
            currentSize = currentSize + 1;
            System.out.println(num + " is pushed");
        } else {
            end = end + 1;
            queue[end] = num;
            currentSize = currentSize + 1;
            System.out.println(num + " is pushed");
        }

    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Queue is Empty. Cannot pop the element");
            return -1;
        }

        int number = queue[start];
        start = (start + 1) % capacity;
        currentSize--;
        System.out.println(number + " dequeued");
        return number;
    }

    public int peek(){
        if(isEmpty()){
                System.out.println("Queue is Empty.");
                return -1 ;
        }
        return queue[start] ;
    }

    public boolean isEmpty(){
        if(currentSize == 0){
            return true ;
        }
        return false ;
    }

    public boolean isFull(){
        if(currentSize == capacity){
            return true ;
        }
        return false ;

    }
    public int getSize(){
        if(isEmpty()){
            return capacity ;
        }

        return currentSize ;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < capacity; i++) {
            System.out.print(queue[(start + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int size = sc.nextInt() ;

        Queue1 q = new Queue1(size) ;

        q.push(1);
        q.push(2) ;
        q.push(3) ;
        q.push(4 );
        q.pop() ;
        q.pop() ;
        q.pop() ;
        //q.pop() ;
        System.out.println("The current size of the queue is: "+q.getSize());

        q.printQueue() ;
    }

}


