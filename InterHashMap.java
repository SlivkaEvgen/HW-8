package MyHashMap;

public interface InterHashMap<E,T> {
    void put(Object key, Object value);     //добавляет пару ключ + значение
    void remove(Object key);              //удаляет пару по ключу
    void clear();                        //очищает коллекцию
    int size();                          //возвращает размер коллекции
    T get(E key);                 //возвращает значение(Object value) по ключу
}
