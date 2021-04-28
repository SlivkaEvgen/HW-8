package MyLinkedList;

public class MyLinkedListTest<E> implements MyList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;


    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> previous;
        int index;

        Node(E item) {
            this.item = item;
            index++;
        }
    }

    public void add(E element) {
        size++;
        Node<E> node2 = new Node<>(element);
        if (first == null) {
            first = last = node2;
            return;
        }
        node2.previous = last;
        last = node2;
        node2.previous.next = node2;
        node2.index++;
    }

    public void remove(int index) {
        Node<E> eNode = first;

        if (index == 0) {
            first = eNode.next;
            first.previous = null;
            size--;
            return;
        }
        int i = 0;
        while (i != index - 1) {
            eNode = eNode.next;
            i++;
        }
        eNode.next = eNode.next.next;
        last = eNode;
        size--;

    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                this.first = this.last = null;
                size = 0;
            }
        }
    }

    public E get(int index) {
        Node<E> eNode = first;
        E result = first.item;
        if (size == index) {
            result = last.item;
        }
        for (int i = 0; i < size; i++) {
            if (i == index) {
                result = eNode.item;
            }
            eNode = eNode.next;
        }
        return result;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        Node<E> rezult = first;
        StringBuilder rezult1 = new StringBuilder();
        while (rezult != null) {
            rezult1.append(rezult.item);
            rezult = rezult.next;
        }
        return rezult1.toString();
    }

    public static void main(String[] args) {
        MyLinkedListTest<Integer> item1 = new MyLinkedListTest<>();
        item1.add(1);
        item1.add(2);
        item1.add(3);
        item1.add(4);
        item1.add(5);
        System.out.println(item1.get(0));
        System.out.println(item1);
        item1.remove(0);
        System.out.println(item1);
        item1.remove(0);
        System.out.println(item1);
        item1.remove(2);
        System.out.println(item1);
        item1.remove(0);
        System.out.println(item1);

    }
}

