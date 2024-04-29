package ru.itsjava.ComparablePractice;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Comparable < Person>, Cloneable {

    private final String name;
    private final String surname;
    private double age;

    @Override
    public int compareTo(Person person) {
        int res = this.surname.compareTo(person.surname);
        if (res== 0){
            res = this.name.compareTo(person.name);
            if (res==0){
                res= (int) (age-person.age);
            }

        }
        return res;



    }
    @Override
    public String toString(){

        return "{"+ "name="+ name  + '\'' + "surname=" + surname  + '\'' + "age=" + age + '}'+ "\n";
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



}
