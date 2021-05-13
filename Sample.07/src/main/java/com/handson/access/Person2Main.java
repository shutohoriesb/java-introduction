package com.handson.access;

public class Person2Main {
    public static void main(String[] args) {
        Person2 person = new Person2("山本", 30);
        person.printMessage();
        person.setAge(50);
        person.printMessage();
        person.setAge(-100);
        person.printMessage();
        // person.age = -100; // コンパイルエラー
    }
}
