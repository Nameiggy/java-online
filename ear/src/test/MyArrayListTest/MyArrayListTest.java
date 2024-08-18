package MyArrayListTest;
import ArrayList.MyArrayList;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import static org.testng.AssertJUnit.assertFalse;


public class MyArrayListTest {




    @DisplayName("Проверяем методы get/add в MyArrayList")
    @Test
    public void checksIfTheAdditionIsCorrect () {
        MyArrayList list = new MyArrayList();
        list.add("list1");
        list.add("list2");
        assertEquals("list1", list.get(0));
    }
    @DisplayName("Проверяем метод set в MyArrayList")
    @Test
    public void shouldHaveCorrectSetMethod () {
        MyArrayList list = new MyArrayList();
        list.add("List1");
        list.add("List2");
        list.set(1,"list34");
        assertEquals("list34", list.get(1));
    }
    @DisplayName("Проверяем метод size в MyArrayList")
    @Test
    public void shouldHaveCorrectSizeMethod () {
        MyArrayList list = new MyArrayList();
        list.add("list1");
        list.add("list2");
        assertEquals(2, list.size());
    }
    @DisplayName("Проверяем метод isEmpty в MyArrayList")
    @Test
    public void shouldHaveCorrectIsEmptyMethod (){
        MyArrayList list = new MyArrayList();
        list.add("List1");
        list.add("List2");
        assertFalse(list.isEmpty());
    }
    @DisplayName("Проверяем метод contains в MyArrayList")
    @Test
    public void shouldHaveCorrectContainsMethod (){
        MyArrayList list = new MyArrayList();
        list.add("list1");
        list.add("list2");
        assertTrue(list.contains("list1"));

    }
    @DisplayName("Проверяем методы remove в MyArrayList")
    @Test
    public void shouldHaveCorrectRemoveMethods (){
        MyArrayList list = new MyArrayList();
        list.add("List1");
        list.add("List2");
        list.add("List3");
        list.remove(2);
        assertNull(list.get(2));
        assertTrue(list.remove("List1"));




    }
    @DisplayName("Проверяем метод clear в MyArrayList")
    @Test
    public void shouldHaveCorrectClearMethod (){
        MyArrayList list= new MyArrayList();
        list.add("List1");
        list.add("List2");
        list.add("List3");
        list.clear();
        assertNull(null,"size () = 0");

    }
    @DisplayName("Проверяем методы indexOf/lastIndexOf в MyArrayList")
    @Test
    public void shouldHaveCorrectIndexOfMethod (){
        MyArrayList list = new MyArrayList();
        list.add("List1");
        list.add("List2");
        list.add("List3");
        assertEquals(0,list.indexOf("List1"));
        assertEquals(1,list.lastIndexOf("List2"));
    }








}



