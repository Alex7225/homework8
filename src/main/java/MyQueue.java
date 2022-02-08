public class MyQueue <T> {
    private T[] queue;
    private int maxSize;
    private int nElem;
    private int front;
    private int rear;
    private T t;


    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        queue = (T[]) new Object[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }
    public void add(T value) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queue[++rear] = value;
        nElem++;
    }
    public void remove(int index) {
        for (int i=0; i<index; i++) {
            queue[i] = null;
            nElem--;
            front++;
        }
    }
    public void clear() {
        for (int i = 0; i < queue.length; i++) {
            queue[i] = null;

        } nElem=0;
    }
    public int size() {
        return nElem;
    }
    public T peek (){
        return queue[front];
    }
    public T poll(){
        T temp = queue[front];
        queue[front]=null;
        nElem--;
        front++;
        return temp;
    }
}