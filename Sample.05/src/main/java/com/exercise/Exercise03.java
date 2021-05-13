package com.exercise;

class Exercise03 {
    public static void main(String[] args) {

        // Inputクラスを利用する演習
        // ※ Inputクラスは同じパッケージ内に宣言されている

        // TODO Inputクラスのインスタンスを生成する
        Input input = new Input();

        // TODO コンソールから入力された名前(文字列)を受け取り、変数に代入する
        String name = input.nextLine("名前を入力して下さい");

        // TODO コンソールから入力された年齢(整数値)を受け取り、変数に代入する
        String age = input.nextLine("年齢を入力して下さい");

        // TODO 「名前 : (名前) 年齢 : (年齢)」の形式でコンソールに出力する
        System.out.println("名前 : " + name  + " 年齢 : " + age);
    }
}
