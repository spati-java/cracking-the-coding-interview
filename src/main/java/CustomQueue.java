public class CustomQueue {

    private int size = 0;

    private int front = 0;
    private int rear = 0;

    private int capacity = 5;

    private int queue[] = new int[capacity];

    public int enqueue(int number) {

        if (size == capacity) {
            increaseCapacity();
        }

        queue[rear] = number;

        rear = rear + 1;

        size++;

        return size;
    }

    public int dequeue() {
        if (size == 0) {
            return -1;
        }

        int number = queue[front];
        front++;
        size--;
        return number;
    }

    public int size() {
        return size;
    }

    public void increaseCapacity() {

        capacity = capacity * 2;

        int[] newQueue = new int[capacity];

        for (int i = 0; i < size(); i++) {
            newQueue[i] = queue[i];
        }

        queue = new int[capacity];

        for (int i = 0; i < newQueue.length; i++) {
            queue[i] = newQueue[i];
        }
        newQueue = null;

    }

}
