package com.handson.method;

public class Person {

    // TODO 戻り値を返すメソッドを宣言する
    public String getMessage() {
        String message = "名前は山本です。年齢は30歳です。";
        return message;
    }

    // TODO 戻り値を返さないメソッドを宣言する
    public void printAge() {
        System.out.println("私の年齢は30歳です。");
    }

    // TODO メソッドの中でメソッドを呼び出す
    public void printMessage() {
        String message = getMessage();
        System.out.println(message);

    }
}
