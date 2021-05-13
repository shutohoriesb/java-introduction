package com.handson;



class VariableSample {
    public static void main(String[] args) {
        // TODO int型の変数countを宣言する
        int count;

        // TODO countの中身に1を代入する
        count = 1;

        // TODO 変数countの中身をコンソールに出力する
        System.out.println(count);

        // TODO countという文字列をコンソールに出力する
        System.out.println("count");

        // TODO 変数countの中身を2に書き換える
        count = 2;
        System.out.println(count);

        // TODO 別の変数ageを宣言し、宣言と同時に3を代入する
        int age = 3;
        System.out.println(age);

        // TODO ageの中身をcountの中身で上書きする
        age = count;
        System.out.println(age);
        System.out.println(count);


    }
}
