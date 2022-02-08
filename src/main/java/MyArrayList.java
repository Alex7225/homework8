public class MyArrayList <T>{

    int size = 0;
    protected T[] someArray;
    private T t;

    public MyArrayList(){
        someArray = (T[]) new Object[20];
    }

    protected void add(T someObject) {
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

    protected T get(int index) {
        Object someObject = someArray[index];
        return (T)someObject;
    }
}