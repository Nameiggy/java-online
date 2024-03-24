package ru.itsjava.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.Person.Person;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс Person должен")
public class PersonTest {

    public static final int DEFUALT_AGE = 20;
    public static final String NEW_PERSON = "Mihail";
    public static final int NEW_AGE = 16;
    private static final String DEFUALT_NAME = "Igor ";

    @DisplayName("корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructor() {
        Person actualPerson = new Person(DEFUALT_NAME, DEFUALT_AGE );
        Person actualPerson2 = new Person("Igor", 20);
        //AssertEquals(DEFUALT_AGE, actualPerson2.getAge()));
        //Assertions.assertEquals(DEFUALT_NAME, actualPerson.getName());


        assertAll("actualPerson", ()-> assertEquals(DEFUALT_NAME, actualPerson.getName()),
                ()->assertEquals(DEFUALT_AGE, actualPerson.getAge()));


    }
    @DisplayName("корреткно менять имя")
    @Test
    public void shouldHaveCorrectUpdatePerson(){
        Person actualPerson = new Person(DEFUALT_NAME, DEFUALT_AGE );
        actualPerson.setName(NEW_PERSON);

        assertEquals(NEW_PERSON, actualPerson.getName());

    }
    @DisplayName("корректно считать возраст")
    @Test
    public void shouldHaveCorrectCalculateAge(){
        Person actualPerson = new Person("Igor", 25 );
        Person actualPerson2 = new Person("Mihail", 17);

        actualPerson.birthday();
        actualPerson2.birthday();




        assertAll("Method birthday", ()-> assertEquals(26, actualPerson.getAge()),
                ()->assertEquals(18, actualPerson2.getAge()));
    }
    @DisplayName("корректно разрешать продажу пива")
    @Test
    public void shouldHaveGiveBeer(){
        Person actualPerson = new Person("Igor", 25 );
        Person actualPerson2 = new Person("Mihail", 17);

        assertFalse(actualPerson2.takeBeer());
        assertTrue(actualPerson.takeBeer());

    }


}
