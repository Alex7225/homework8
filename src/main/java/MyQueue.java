import java.util.Queue;

public class MyQueue {
    private Object[] queue;
    private int maxSize;
    private int nElem;
    private int front;
    private int rear;

    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        queue = new Object[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }
    public void add(Object value) {
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
    public Object peek (){
        return queue[0];
    }
    public Object poll(){
        Object temp = queue[0];
        queue[0]=null;
        nElem--;
        return temp;
    }

}