//package MyArrayList;
//
//import java.util.Arrays;
//
//class Main extends MyArrayList1 {
//    public static void main(String[] args) {
//        MyArrayList1 temp = new MyArrayList1();
//        temp.add(1); //0
//        temp.add(5); //0
//        temp.add(2); //0
//        temp.add(3); //0
//        temp.add(4); //0
//        //temp.clear();
//        System.out.println(temp.get(1));
//        System.out.println(temp.size());
//        System.out.println(temp.get(2));
////        temp.remove(0);
////        temp.remove(0);
////        temp.remove(0);
////        temp.remove(0);
//        System.out.println(temp);
//    }
//}
//public class MyArrayList1 implements MyList1<Object> {
//    private int size;
//    private Object[] array;
//
//    public MyArrayList1() {
//        size = 0;
//        array = new Object[10];
//    }
//
//    @Override
//    public void add(Object element) {
//        if (size == array.length) {
//            Object[] newArray = new Object[array.length * 3 / 2 + 1];
//            System.arraycopy(array, 0, newArray, 0, array.length);
//            array = newArray;
//        }
//        array[size++] = element;
//    }
//
//    @Override
//    public void remove(int index) {
//        Object[] newArray = new Object[array.length - 1];
//        System.arraycopy(array, 0, newArray, 0, index);
//        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
//        array = newArray;
//        size--;
//    }
//
//    @Override
//    public void clear() {
//        Object[] newArray = new Object[array.length - 1];
//        System.arraycopy(newArray, 0, array, 0, newArray.length);
//        array = newArray;
//        size = 0;
//    }
//
//    @Override
//    public int size() {
//        return size;
//    }
//
//    @Override
//    public Object get(int index) {
//        return array[index];
//    }
//
//    @Override
//    public String toString() {
//        Object[] newArray = new Object[size];
//        System.arraycopy(array, 0, newArray, 0, size);
//        array = newArray;
//        return Arrays.toString(array);
//    }
//}
//
