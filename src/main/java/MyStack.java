public class MyStack {
    private Object[] stack;
    private int maxSize;
    private int nElem;
    private int front;
    private int rear;

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new Object[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }

    public void push(Object value) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        stack[++rear] = value;
        nElem++;
    }

    public void remove(int index) {
        for (int i = 0; i < index; i++) {
            stack[i] = null;
            nElem--;
        }
    }

    public void clear() {
        for (int i = 0; i < stack.length; i++) {
            stack[i] = null;

        }
        nElem = 0;
        rear=-1;
    }

    public int size() {
        return nElem;
    }
    public Object peek (){
        return stack[rear];
    }
    public Object pop(){
        Object temp = peek();
        stack[rear]=null;
        nElem--;
        rear--;
        return temp;
    }
}
