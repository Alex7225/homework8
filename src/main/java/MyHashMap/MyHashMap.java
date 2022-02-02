package MyHashMap;

public class MyHashMap {
    Node[] table;
    int size;

    public MyHashMap() {
        table = new Node[16];
    }

    public static int myHash(int v, int length) {
        return v & (length - 1);
    }

    public void put(Object key, Object value) {
        Node newNode = new Node();
        newNode.hash = myHash(key.hashCode(), table.length);
        newNode.value = value;
        newNode.key = key;
        newNode.next = null;

        Node temp = table[newNode.hash];

        Node iterLast = null;
        boolean keyRepeat = false;
        if (temp == null) {
            table[newNode.hash] = newNode;
            size++;
        } else {
            while (temp != null) {

                if (temp.key != null && temp.key.equals(key)) {
                    keyRepeat = true;
                    System.out.println("ключ дублирован");
                    temp.value = value;
                    break;
                } else {

                    iterLast = temp;
                    temp = temp.next;

                }

            }
            if (keyRepeat == false) {
                iterLast.next = newNode;
                size++;
            }
        }
    }

    public int size() {
        return size;
    }

    public Object get(Object key) {

        int hash = myHash(key.hashCode(), table.length);
        Object value = null;
        if (table[hash] == null) {
            return null;

        } else {
            Node temp = table[hash];
            while (temp != null) {
                if (temp.key.equals(key)) {

                    value = temp.value;
                    break;
                } else {
                    temp = temp.next;
                }
            }
        }
        return value;

    }

    public void remove(Object key) {
        int hash = myHash(key.hashCode(), table.length);
        Node temp = table[hash];
        if (temp.key.equals(key)) {
            table[hash] = null;
            size--;
        }

    }

    public void clear() {
        for (int i = 0; i < table.length - 1; i++) {
            table[i] = null;
        }
        size = 0;
    }
}