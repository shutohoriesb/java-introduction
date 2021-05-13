package com.example;

class VariableSample {
    public static void main(String[] args) {
        // int型の変数countを宣言する
        int count;

        // countの中身に1を代入する
        count = 1;

        // 変数countの中身をコンソールに出力する
        System.out.println(count);

        // countという文字列をコンソールに出力する
        System.out.println("count");

        // 変数countの中身を2に書き換える
        count = 2;
        System.out.println(count);

        // 別の変数ageを宣言し、宣言と同時に3を代入する
        int age = 3;
        System.out.println(age);

        // ageの中身をcountの中身で上書きする
        age = count;
        System.out.println(age);
        System.out.println(count);
    }
}
