package com.example.access;

class Person {

    // フィールドname(String型), age(int型)を宣言する
    private String name;
    private int age;

    // コンストラクタを宣言する
    // nameとageに引数の値を代入する
    // ageの値が0未満にならないよう分岐する
    public Person(String name, int age) {
        this.name = name;
        if (age >= 0) {
            this.age = age;
        }
    }

    public void printMessage() {
        String message = getMessage();
        System.out.println(message);
    }

    private String getMessage() {
        return "名前は" + name + "です。年齢は" + age + "歳です。";
    }
}
