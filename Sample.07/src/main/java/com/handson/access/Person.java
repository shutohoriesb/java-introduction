package com.handson.access;

class Person {

    // TODO フィールドname(String型), age(int型)を宣言する
    private String name;
    private int age;

    // TODO コンストラクタを宣言する
    // nameとageに引数の値を代入する
    // ageの値が0未満にならないよう分岐する
    public Person(String name, int age) {
        this.name = name;
        if (age >= 0) {
            this.age = age;
        }
    }

    // TODO コンソールに文字列を出力するメソッドを宣言する
    // メソッド名 : printMessage
    // 引数なし・戻り値なし
    // getMessageメソッドを呼び出し、戻り値をコンソールに出力する
    public void printMessage() {
        String message = getMessage();
        System.out.println(message);
    }

    // TODO コンソールに出力する文字列を返すメソッドを宣言する
    // メソッド名 : getMessage
    // 引数なし・戻り値String型
    // "名前は(name)です。年齢は(age)円です。"　という文字列を返す
    private String getMessage() {
        return "名前は" + name + "です。年齢は" + age + "歳です。";
    }



}
