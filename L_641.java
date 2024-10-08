public class L_641 {
    private int[] deque;
    private int front, rear, size, capacity;

    public MyCircularDeque(int k) {
        this.capacity = k;
        this.deque = new int[k];
        this.size = 0;
        this.front = 0;
        this.rear = k - 1;
    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        front = (front - 1 + capacity) % capacity;
        deque[front] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        rear = (rear + 1) % capacity;
        deque[rear] = value;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        rear = (rear - 1 + capacity) % capacity;
        size--;
        return true;
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return deque[front];
    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return deque[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}
