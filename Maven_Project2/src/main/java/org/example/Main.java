package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(37);
        person.setName("Oleksiy");
        person.setWeight(90);
        System.out.println(person.getName());
    }
}
