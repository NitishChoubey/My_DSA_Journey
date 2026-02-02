package StackAndQueue;

class Queue {
    private int front, rear, size;
    private int capacity;
    private int[] queue;

    // Constructor
    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue operation (Add element)
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot enqueue " + item);
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        queue[rear] = item;
        size++;
        System.out.println(item + " enqueued");
    }

    // Dequeue operation (Remove element)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        System.out.println(item + " dequeued");
        return item;
    }

    // Peek operation (Front element)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue[front];
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Print queue elements
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}

// Driver Code
public class QueueImplementation {
    public static void main(String[] args) {
        Queue q = new Queue(5); // Queue of size 5

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.printQueue();

        q.dequeue();
        q.printQueue();

        System.out.println("Front element: " + q.peek());

        q.enqueue(60); // Trying to enqueue in full queue
        q.dequeue();
        q.enqueue(60);
        q.printQueue();
    }
}

