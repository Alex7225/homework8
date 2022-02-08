public class MyLinkedList <T>{
    private Node first;
    private Node last;
    private int size;
    private T t;
    protected class Node {
        T element;
        Node next;
        Node previous;

        public Node(T element) {
            this.element = element;
        }
    }

    public int size() {
        return size;
    }

    public void add(T element) {
        Node newNode = new Node(element);
        if (first == null) {
            newNode.next = null;
            newNode.previous = null;
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
            last = newNode;
        }
        size++;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    public T get(int index) {
        Node result = getNode(index);
        return result.element;
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node result = first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result;
    }

    public boolean remove(int index) {
        Node elementForDelete = getNode(index);
        if (index==0){
            return removeFirst(elementForDelete);
        } else if (index==size-1){
            return removeLast(elementForDelete);
        }
        else return remove(elementForDelete);
    }

    private boolean remove(Node node) {
        node.next.previous = node.previous;
        node.previous.next = node.next;
        size--;
        return true;
    }
    private boolean removeFirst(Node node) {
        node.next.previous = node.previous;

        size--;
        return true;
    }
    private boolean removeLast(Node node) {

        node.previous.next = node.next;
        size--;
        return true;
    }
}