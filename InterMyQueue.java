package MyQueue;

public interface InterMyQueue<E> {
    void add(E element);
    void remove(int index);
    void clear();
    int size();
    Object peek();
    void poll();
}
