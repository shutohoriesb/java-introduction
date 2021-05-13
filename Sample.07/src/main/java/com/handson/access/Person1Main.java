package com.handson.access;

public class Person1Main {
    public static void main(String[] args) {
        Person1 person = new Person1("山本", 30);
        person.age = -10;
        person.printMessage(); // 名前は山本です。年齢は-10歳です。
    }
}
