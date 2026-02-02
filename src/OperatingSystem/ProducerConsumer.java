package OperatingSystem;

import  java.util.LinkedList;
import java.util.concurrent.Semaphore;

class Buffer {
    LinkedList<Integer> list = new LinkedList<>();
    int capacity;
    Semaphore mutex = new Semaphore(1);
    Semaphore empty;
    Semaphore full ;

    Buffer(int capacity) {
        this.capacity = capacity;
        this.empty = new Semaphore(capacity);
        this.full = new Semaphore(0);
    }

    public void produce(int item) throws InterruptedException {
        empty.acquire();
        mutex.acquire();
        list.add(item);
        System.out.println("Produced: " + item);
        mutex.release();
        full.release();
    }

    public void consume() throws InterruptedException {
        full.acquire();
        mutex.acquire();
        int item = list.removeFirst();
        System.out.println("Consumed: " + item);
        mutex.release();
        empty.release();
    }
}

class Producer extends Thread {
    Buffer buffer;

    Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                buffer.produce(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    Buffer buffer;

    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }
}
