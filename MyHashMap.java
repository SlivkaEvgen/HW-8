package MyHashMap;

public class MyHashMap<E, T> implements InterHashMap<E, T> {
    public static void main(String[] args) {
        MyHashMap<Integer, String> myHashMap = new MyHashMap<Integer, String>();
        myHashMap.put(123, "Vasa");
        myHashMap.put(456, "Dusia");
        myHashMap.put(789, "Kisa");
        myHashMap.put(369, "Limo");

        System.out.println(myHashMap);

    }

    private Node<E, T> first;
    private Node<E, T> last;
    private int size;

    private static class Node<E, T> {
        E key;
        T value;
        Node<E, T> next;
        Node<E, T> previous;
        int index = 0;

        Node(Object key, Object value) {
            this.key = (E) key;
            this.value = (T) value;
            index++;
        }
    }

    @Override
    public void put(Object key, Object value) {
        size++;
        Node<E, T> node1 = new Node<E, T>(key, value);
        if (first == null) {
            first = last = node1;
            node1.index = size - 1;
            return;
        }
        node1.previous = last;
        last = node1;
        node1.previous.next = node1;
        node1.index = size - 1;
    }

    @Override
    public void remove(Object key) {
        Node<E, T> eNode = first;
        int i = 0;
        while (i <= size) {
            if (first.key.equals(key)) {
                first = eNode.next;
                first.previous = null;
                size--;
                return;
            }
            if (eNode.key.equals(key)) {
                eNode.previous.next = eNode.next;
                size--;
                return;
            }
            eNode = eNode.next;
            i++;
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                this.first = this.last = null;
                size = 0;
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(Object key) {
        Node<E, T> result = first;
        StringBuilder rezult1 = new StringBuilder();
        while (result != null) {
            if (key.equals(result.key)) {
                rezult1.append(result.value);
            }
            result = result.next;
        }
        return rezult1.toString();
    }

    @Override
    public String toString() {
        Node<E, T> rezult = first;
        StringBuilder rezult1 = new StringBuilder();
        while (rezult != null) {
            rezult1.append(rezult.key).append("-").append(rezult.value).append("\n");
            rezult = rezult.next;
        }
        return rezult1.toString();
    }
}
