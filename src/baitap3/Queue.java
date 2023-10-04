package baitap3;

public class Queue {
    Node front, rear;

    public void enQueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            rear.link = front;
        } else {
            rear.link = newNode;
            rear = newNode;
            rear.link = front;
        }
    }

    public Integer deQueue() {
        if (front == null) {
            return null;
        }

        int value = front.data;
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.link;
            rear.link = front;
        }

        return value;
    }
}
