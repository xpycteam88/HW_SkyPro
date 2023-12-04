package javacore;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ляпис", "Трубицкой");
        System.out.println(person.toString());
        person.changePerson(person);
        System.out.println(person.toString());

    }

    public static void changeValue(Integer[] value) {
        value[0] = 99;

    }
}
