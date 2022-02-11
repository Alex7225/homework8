public class MyArrayList <T>{

    int size = 0;
    protected T[] someArray;
    private T t;
    private int sizeArr =16;

    public MyArrayList(){
        someArray = (T[]) new Object[sizeArr];
    }

    protected void add(T someObject) {
        if (size==sizeArr-1) sizeArr=sizeArr*2;
        someArray[size] = someObject;
        size++;
    }

    protected void remove(int index) {

        someArray[index] = null;
        if (size>0) size--;
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
        T someObject = someArray[index];
        if (someObject==null) {
            throw new ArrayIndexOutOfBoundsException("With index "+index+" No Element in Array!");
        }
        return someObject;
    }
}