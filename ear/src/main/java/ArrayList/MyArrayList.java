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
        return false;
    }

    public void clear() {
        Arrays.fill(array, null);// Заполняем массив null
        realSize =0 ; //Сбрасываем размер
        System.out.println(realSize );

    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
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
