package javacore;

public class Person {
    String name;
    String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " " + "\nФамилия: " + surname;
    }

    public void changePerson(Person person) {
        name = "Илья";
        surname = "Лагутенко";
    }
}
