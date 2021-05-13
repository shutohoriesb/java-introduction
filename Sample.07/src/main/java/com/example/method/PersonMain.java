package com.example.method;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        String message = person.getMessage();
        System.out.println("getMessageメソッドの戻り値 : " + message);
        person.printAge();
        person.printMessage();
    }
}
