package ru.bodrov.interview.lesson1.task1;

public class Main {

    public static void main(String[] args) {
        Person person = new Person.Builder()
                .setNestedFirstName("Ivan")
                .setNestedLastName("Ivanov")
                .build();
        Person person1 = new Person.Builder()
                .setNestedFirstName("Ivan")
                .setNestedLastName("Ivanov")
                .setNestedAge(30)
                .build();

        System.out.println(person.getFirstName() + ' ' + person.getLastName());
        System.out.println(person1.getFirstName() + ' ' + person1.getLastName() + ' ' + person1.getAge());
    }
}
