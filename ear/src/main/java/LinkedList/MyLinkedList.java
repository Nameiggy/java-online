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
            return false;//если пустой список, возвращать ничего не надо

        }
        if (head.getValue().equals(o)){//если совпал элемент в head, переместить указатель на след элемент
            head= head.getNext();
            return true;
        }
        if (head.getNext() == null) {//Проверяем есть ли дальше объект за head
            return false;
        }
        Node curNode = head;
        Node ruNode = head;
        while ((curNode= curNode.getNext())!= null){ //проверяем в curNode есть элемент или нет
            if (curNode.getValue().equals(o)){// есди нет перемещаем curNode и prevNode дальше
                break;
            }
            ruNode=ruNode.getNext();
        }
        if (curNode== null){// проверка curNode на null
            return false;
        }
        ruNode.setNext(curNode.getNext()); //если нашли эл-т, ruNode setNext
        curNode.setNext(null);//убираем ссылку
        return true;

    }

    public void clear() {
        while (head!=null){
            Node temp = head;// Сохраняем текущий узел
            head= head.next;// Обновляем head на следующий узел
            temp.next= null;// Разрываем связь с следующим узлом
        }
        head=null; // В конце обнуляем head


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
    //СТРОКА1 -> null
    //СТРОКА1 -> СТРОКА2 -> СТРОКА3-> null
    public Object remove(int index) {
        checkIndex (index);// проверяем корректный индекс или нет. Если он корректный, значит 1 элемент есть (это head)
        if (index==0) {// если индекс = 0, удаляем head
            Object resValue = head.getValue();
            if (head.getNext()== null){// если есть только head, присваиваем null
                head=null;
            }else {
                head=head.getNext();// если нет, то передвиганм ссылку head на след элемент и рассматриваем только ее
            }
            return resValue;
        }
        // если мы не вернули ничего, значит есть минимум 2 элемента
        Node curNode = head;//элемент который хотим удалить
        Node rubNode = head;//предыдущий элемент
        int count = 0;
        while ((curNode=curNode.getNext())!=null) {
            count++;//пробегаемся по листу
            if (count==index) { //проверка на выход
                break;
            }
            rubNode=rubNode.getNext();//если мы не вышли, то перемещаем prevNode
        }
        if (curNode == null) return null;
        Object resValue = curNode.getValue();

        if (curNode.getNext()==null){ // если хотим удалить элемент с конца (строка3)
            rubNode.setNext(null); // предыдущему эл-ту (строка2) присваиваем null
        }else { // если это не последний ->
            rubNode.setNext(curNode.getNext());// если хотим удалить посередине, нужно перекинуть ссылку и (строка2) присвоить null
            // rubNode(строка1).setnext (ссылка) curNode.getNext (строка3)
            curNode.setNext(null);// у текущего элемента делем ссылку null
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
        int i =-1;
        int index = -1;

        while (curNode!=null){
            i++;
            if (curNode.getValue().equals(o)){
                index = i;
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
