package ArrayList;

import java.util.Arrays;

public class MyArrayList  {

    public static final int DEFAULT_CAPACITY = 10;
    private int realSize;
    private Object[] array;
    


    public MyArrayList() {
        array= new Object[DEFAULT_CAPACITY];
        realSize = 0;

    }


    public int size() {
        return realSize;
    }

    public boolean isEmpty() {

        return realSize == 0;
    }

    public boolean contains(Object o) {
        for (int i = 0; i <realSize ; i++) {
            if (array[i].equals(o)){

            }


        }
        return false;
    }

    public boolean add(Object o) {
        if (realSize == array.length){

            Object[] resArray = new Object[array.length * 3/2 +1];
            System.arraycopy(array, 0, resArray, 0, array.length);
            array= resArray;


        }
        array[realSize++]=o;




        return true;
    }

    public boolean remove(Object o) {
        for (int i = 0; i < realSize; i++) {
            if (array[i].equals(o)) {
                System.arraycopy(array, i + 1, array, i, realSize - i - 1);
                array[--realSize] = null; // Удаляем ссылку
                return true;
            }
        }
        return false;
    }

    public void clear() {
        Arrays.fill(array, null);// Заполняем массив null
        realSize =0 ; //Сбрасываем размер
        System.out.println(realSize );

    }

    public Object get(int index) {
        if (index < 0 || index >= realSize) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + realSize);
        }
        return array[index];
    }

    public Object set(int index, Object element) {
        if (index < 0 || index >= realSize) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + realSize);
        }
        Object oldValue = array[index];
        array[index] = element;
        return oldValue;
    }

    public void add(int index, Object element) {
        if (index < 0 || index > realSize) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + realSize);
        }
        if (realSize == array.length) {
            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            System.arraycopy(array, 0, resArray, 0, index);
            System.arraycopy(array, index, resArray, index + 1, realSize - index);
            array = resArray;
        } else {
            System.arraycopy(array, index, array, index + 1, realSize - index);
        }
        array[index] = element;
        realSize++;
    }

    public Object remove(int index) {
        if (index < 0 || index >= realSize) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + realSize);
        }
        Object removedElement = array[index];
        System.arraycopy(array, index + 1, array, index, realSize - index - 1);
        array[--realSize] = null; // Удаляем ссылку
        return removedElement;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < realSize; i++) {
            if (array[i].equals(o)) {
                return i;
            }
        }
        return -1; // Если элемент не найден
    }
 @Override
    public String toString() {
        
//        return "MyArrayList{" +
//                "realSize" + realSize +
//                ", array=" + Arrays.toString(array) +
//                "}";
     StringBuilder stringBuilder = new StringBuilder("MyArrayList");
     for (int i = 0; i <realSize ; i++) {
         stringBuilder.append(array[i]).append(" ");
     }
     stringBuilder.append("}");
     return stringBuilder.toString();


    }

}
