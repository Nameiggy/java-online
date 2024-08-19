package LinkedList;


import java.sql.PreparedStatement;

public class MyLinkedList {

    private Node head;




    public int size() {
        if (head == null) {
            return 0;
        }
        int size =1 ;
        Node curNode = head;
        while (curNode.getNext() != null){
            curNode = curNode.getNext();
            size++;
        }
        return size;

    }

    public boolean isEmpty() {
        if (head != null){
            return false;
        }else {
            return true;
        }
    }

    public boolean contains(Object o) {
        Node i;
        for (i=head; i != null; i= i.getNext()){
            if (i.getValue().equals(o)){
                return true;
            }
        }
        return false;
    }

    public boolean add(Object o) {
        Node resNode = new Node(o,null);
        if (head == null){
            head= resNode;

        }else {
            Node curNode = head;
        while (curNode.getNext() != null){
            curNode = curNode.getNext();
        }

        curNode.setNext(resNode);
        }

        return true;
    }

    public boolean remove(Object o) {
        if (head == null){
            return false;
        }
        if (head.getValue().equals(o)){
            head= head.getNext();
            return true;
        }
        if (head.getNext() == null) {
            return false;
        }
        Node curNode = head;
        Node ruNode = head;
        while ((curNode= curNode.getNext())!= null){
            if (curNode.getValue().equals(o)){
                break;
            }
            ruNode=ruNode.getNext();
        }
        if (curNode== null){
            return false;
        }
        ruNode.setNext(curNode.getNext());
        curNode.setNext(null);
        return true;

    }

    public void clear() {
        head = null;

    }

    public Object get(int index) {
        if (isEmpty()) {
            return null;
        }
        if (index<0|| index> size()){
            return null;
        }
        int b = 0;
        Node curNode = head;
        while (curNode!=null){
            if (b== index){
                return curNode.getValue();
            }
            curNode=curNode.getNext();
            b++;
        }
        return null;
    }

    public Object set(int index, Object element) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
        Node curNode = head;
        int b = 0 ;
        while (b< index){
            curNode= curNode.getNext();
            b++;
        }
        Object rusNode = curNode.getValue();
        curNode.setValue(element);
        return rusNode;
    }

    public void add(int index, Object element) {


    }

    public Object remove(int index) {
        checkIndex (index);
        if (index==0) {
            Object resValue = head.getValue();
            if (head.getNext()== null){
                head=null;
            }else {
                head=head.getNext();
            }
            return resValue;
        }
        Node curNode = head;//элемент который хотим удалить
        Node rubNode = head;//элемент который хотим удалить
        int count = 0;
        while ((curNode=curNode.getNext())!=null) {
            count++;
            if (count==index) { //проверка на выход
                break;
            }
            rubNode=rubNode.getNext();//если мы не вышли, то перемещаем prevNode
        }
        if (curNode == null) return null;
        Object resValue = curNode.getValue();

        if (curNode.getNext()==null){ // если хотим удалить элемент с конца (строка3)
            rubNode.setNext(null); // предыдущему эл-ту (строка2) присваиваем null
        }else {
            rubNode.setNext(curNode.getNext());
            curNode.setNext(null);
        }
        return resValue;
    }
    private void checkIndex(int index) {
        if (!isCorrectIndex(index)){
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }
    private boolean isCorrectIndex(int index){
        if (index > -1 && index < size()){
            return true;
        }
        return false;
    }

    public int indexOf(Object o) {
        if (isEmpty()){
            return -1;
        }
        Node curNode = head;
        int d = -1;
        while (curNode!=null){
            d++;
            if (curNode.getValue().equals(o)){
                return d;
            }
            curNode=curNode.getNext();
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        if (isEmpty()){
            return -1;
        }
        Node curNode = head;
        int i =-1, index = -1;
        while (curNode!=null){
            i++;
            if (curNode.getValue().equals(o)){
                return i;
            }
            curNode=curNode.getNext();
        }
        return index;
    }


    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
