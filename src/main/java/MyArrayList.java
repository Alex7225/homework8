public class MyArrayList {

    int size= 5;
    private Object[] someArray = new Object[size];

    private void add(Object someObject) {

        someArray[size] = someObject;
        size++;
    }

    private void remove(int index) {

        someArray[index] = null;
    }

    private void clear() {
        for (int i = 0; i < someArray.length; i++)
            someArray[i] = null;
    }

    private int size() {
        return size;
    }

    private Object get(int index) {
        return someArray[index];
    }
}
