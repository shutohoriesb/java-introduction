package com.handson.field;

class Person {

    // TODO フィールドを宣言する
    private String name;
    private int age;


    public String getMessage() {
        // ローカル変数messageを宣言する
        // TODO nameとageはフィールドを参照する
        String message = "名前は" + name + "です。年齢は" + age + "歳です。";
        return message;
    }

    public void growOld() {
        // TODO フィールドに値を代入する

    }

    public void printMessage() {
        // getMessageメソッド内のローカル変数は参照できない
        // System.out.println(message); // コンパイルエラー
        // TODO メソッドを呼び出して変数に代入する
        String message = getMessage();
        System.out.println(message);

    }

    public void setName(String name) {
        // TODO コメントアウトを解除する
         this.name = name;
    }

    public void setAge(int age) {
        // TODO コメントアウトを解除する
         this.age = age;
    }
}
