package MyLinkedList;

public interface MyList<E> {
    void add(E element);
    void remove(int index);
    void clear();
    E get(int index);
    int size();
}
