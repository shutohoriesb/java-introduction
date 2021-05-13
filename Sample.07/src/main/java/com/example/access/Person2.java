package com.example.access;

public class Person2 {

    // フィールドname(String型), age(int型)を宣言する
    private String name;
    private int age;

    // コンストラクタを宣言する
    // nameとageに引数の値を代入する
    // ageの値が0未満にならないよう分岐する
    public Person2(String name, int age) {
        this.name = name;
        if (age >= 0) {
            this.age = age;
        }
    }

    // ageに引数の値を代入するメソッドを宣言する
    // メソッド名 : setAge
    // 引数int型・戻り値なし
    // ageの値が0未満にならないよう分岐する
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    // ageの値を返すメソッドを宣言する
    // メソッド名 : getAge
    // 引数なし・戻り値int型
    public int getAge() {
        return age;
    }

    public void printMessage() {
        String message = getMessage();
        System.out.println(message);
    }

    private String getMessage() {
        return "名前は" + name + "です。年齢は" + age + "歳です。";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
