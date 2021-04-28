package MyHashMap;

public interface InterHashMap<E,T> {
    void put(Object key, Object value);
    void remove(Object key);
    void clear();
    int size();
    T get(E key);
}
