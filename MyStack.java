package MyStack;

import java.util.Arrays;

public class MyStack<E> implements InterStack<E> {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<Integer>();
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        myStack.pop();
        System.out.println(myStack);

    }

    private int size;
    private Object[] array = new Object[10];

    public MyStack() {
    }

    @Override
    public void push(Object value) {
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 3 / 2 + 1];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = value;
    }

    @Override
    public void remove(int index) {
        Object[] newArray = new Object[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        array = newArray;
        size--;
    }

    @Override
    public void clear() {
        Object[] newArray = new Object[array.length - 1];
        System.arraycopy(newArray, 0, array, 0, newArray.length);
        array = newArray;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object peek() {
        return array[size - 1];
    }

    @Override
    public void pop() {
        System.out.println(array[size - 1]);
        remove(size - 1);
    }

    @Override
    public String toString() {
        Object[] newArray = new Object[size];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
        return Arrays.toString(array);
    }
}
