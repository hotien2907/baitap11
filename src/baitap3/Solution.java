package baitap3;

public class Solution {
    Queue queue = new Queue();

    public void enQueue(int data) {
        queue.enQueue(data);
    }

    public Integer deQueue() {
        return queue.deQueue();
    }
}