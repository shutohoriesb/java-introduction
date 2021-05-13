package com.example.constructor;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getMessage() {
        // ローカル変数messageを宣言する
        // nameとageはフィールドを参照する
        String message = "名前は" + name + "です。年齢は" + age + "歳です。";
        return message;
    }

    public void growOld() {
        // フィールドに値を代入する
        age = age + 1;
    }

    public void printMessage() {
        // getMessageメソッド内のローカル変数は参照できない
        // System.out.println(message); // コンパイルエラー
        // メソッドを呼び出して変数に代入する
        String message = getMessage();
        System.out.println(message);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
