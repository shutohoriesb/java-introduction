package com.handson.access;

public class PersonMain {
    public static void main(String[] args) {
        // TODO 6行目と9行目を削除してから実行する
        Person person = new Person("斎藤", 20);
        person.printMessage();

//         person.getMessage(); // コンパイルエラー
    }
}
