package MyLinkedList;

import LinkedList.MyLinkedList;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import static org.testng.AssertJUnit.assertFalse;

public class MyLinkedListTest {



    @DisplayName("Проверяем методы get/add в MyLinkedList")
    @Test
    public void checksIfTheAdditionIsCorrect (){
        MyLinkedList list = new MyLinkedList();
        list.add("Hello");
        list.add("Mort");
        assertEquals("Hello",list.get(0));
    }
    @DisplayName("Проверяем  метод set в MyLinkedList")
    @Test
    public void shouldHaveCorrectSetMethod (){
        MyLinkedList list = new MyLinkedList();
        list.add("Mirr1");
        list.add("Mirr2");
        list.add("Mirr3");
        list.set(2,"Mirr4");
        assertEquals("Mirr4",list.get(2));
    }
    @DisplayName("Проверяем метод size в MyLinkedList")
    @Test
    public void shouldHaveCorrectSizeMethod () {
        MyLinkedList list = new MyLinkedList();
        list.add("Yra");
        list.add("Myrr");
        assertEquals(2,list.size());

    }
    @DisplayName("Проверяем метод isEmpty в MyLinkedList")
    @Test
    public void shouldHaveCorrectIsEmptyMethod () {
        MyLinkedList list = new MyLinkedList();
        list.add("Joni");
        list.add("Joni1");
        assertFalse(list.isEmpty());

    }
    @DisplayName("Проверяем метод contains в MyLinkedList")
    @Test
    public void shouldHaveCorrectContainsMethod() {
        MyLinkedList list = new MyLinkedList();
        list.add("Long");
        list.add("Short");
        assertTrue(list.contains("Long"));
    }
    @DisplayName("Проверяем методы remove в MyLinkedList")
    @Test
    public void shouldHaveCorrectRemoveMethods (){
        MyLinkedList list = new MyLinkedList();
        list.add("Piter");
        list.add("Piter1");
        list.add("Piter2");
        list.remove(2);
        assertNull(list.get(2));
        assertTrue(list.remove("Piter"));
        assertTrue(list.contains("Piter1"));
    }
    @DisplayName("Проверяем метод clear в MylinkedList")
    @Test
    public void shouldHaveCorrectClearMethod () {
        MyLinkedList list = new MyLinkedList();
        list.add("Sim");
        list.add("Sim1");
        list.add("Sim2");
        list.clear();
        assertEquals(0,list.size());
    }
    @DisplayName("Проверяем методы indexOf/lastIndexOf в MyLinkedList")
    @Test
    public void returnsFirstAppropriateIndexOfMethod () {
        MyLinkedList list = new MyLinkedList();
        list.add("Joni1");
        list.add("Joni2");
        list.add("Joni2");
        list.add("Joni3");
        list.add("Joni3");

        assertEquals(0,list.indexOf("Joni1"));
        assertEquals(2,list.lastIndexOf("Joni2"));

    }
}
