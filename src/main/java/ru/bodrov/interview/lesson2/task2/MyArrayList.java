package ru.bodrov.interview.lesson2.task2;

public class MyArrayList<T> {

    private final int DEFAULT_SIZE = 16;
    private final int CUT_INDEX = 4;
    private Object[] arr = new Object[DEFAULT_SIZE];
    private int sizeCheck = 0;

    public void add(T item) {
        if(sizeCheck == arr.length-1)
            resize(arr.length*2);
        arr[sizeCheck++] = item;
    }

    public T get(int index) {
        return (T) arr[index];
    }

    public void remove(int index) {
        for (int i = index; i<sizeCheck; i++)
            arr[i] = arr[i+1];
        arr[sizeCheck] = null;
        sizeCheck--;
        if (arr.length > DEFAULT_SIZE && sizeCheck < arr.length / CUT_INDEX)
            resize(arr.length/2);
    }

    public int size() {
        return sizeCheck;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(arr, 0, newArray, 0, sizeCheck);
        arr = newArray;
    }

}
