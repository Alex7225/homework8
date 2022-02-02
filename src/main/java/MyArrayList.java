public class MyArrayList {

    int size = 0;
    protected Object[] someArray = new Object[20];

    protected void add(Object someObject) {
        someArray[size] = someObject;
        size++;
    }

    protected void remove(int index) {

        someArray[index] = null;
        size--;
    }

    protected void clear() {
        int count = size;
        for (int i = 0; i < count; i++) {
            someArray[i] = null;
            size--;
        }
    }

    protected int size() {
        return size;
    }

    protected Object get(int index) {
        return someArray[index];
    }
}