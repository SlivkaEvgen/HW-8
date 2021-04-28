package MyStack;

public interface InterStack<E> {
    void push(Object value);
    void remove(int index);
    void clear();
    int size();
    Object peek();
    void pop();
}
