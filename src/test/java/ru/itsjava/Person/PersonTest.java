package ru.itsjava.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс Person должен")
public class PersonTest {
    public static final String DEFAULT_NAME = "Иван";
    public static final int DEFAULT_AGE = 30;
    public static final String NEW_NAME = "MAXIM";
    public static final int NEW_AGE = 17;
    @DisplayName("Корректно создаваться конструктором ")
    @Test
    public void shouldCreateConstructor() {
        Person person = new Person(DEFAULT_NAME, DEFAULT_AGE);
        assertEquals(DEFAULT_NAME, person.getName());
        assertEquals(DEFAULT_AGE, person.getAge());
    }
    @DisplayName("Корректно прибавлять год на День Рождения")
    @Test
    public void shouldHaveCorrectBirthday() {
        Person person = new Person(DEFAULT_NAME, DEFAULT_AGE);
        person.birthday();
        assertEquals(DEFAULT_AGE + 1, person.getAge());

    }
    @DisplayName("Корректно проверять возраст для допуска к алкоголю")
    @Test
    public void shouldHaveCorrectTakeBeer() {
        Person person = new Person(DEFAULT_NAME, DEFAULT_AGE);
        assertTrue(person.takeBeer());
        person.setAge(17);
        assertFalse(person.takeBeer());
    }








}
