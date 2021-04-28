package MyArrayList;

public interface MyList1<T> {
    void add(T element);
    void remove(int index);
    void clear();
    int size();
    T get(int index);
}