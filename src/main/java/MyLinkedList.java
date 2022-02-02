public class MyLinkedList {
    private Node first;
    private Node last;
    private int size;

    private static class Node {
        Object element;
        Node next;
        Node previous;

        public Node(Object element) {
            this.element = element;
        }
    }

    public int size() {
        return size;
    }

    public void add(Object element) {
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

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node result = first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }

        return result.element;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        return false;
    }
}