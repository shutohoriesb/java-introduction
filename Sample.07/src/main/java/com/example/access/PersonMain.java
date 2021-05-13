package com.example.access;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("斎藤", 20);
        person.printMessage();
        // person.getMessage(); // コンパイルエラー
    }
}
