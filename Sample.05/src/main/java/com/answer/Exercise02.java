package com.answer;

import java.util.Scanner;

class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // APIリファレンスを参照して、java.util.ScannerクラスのnextIntメソッドの引数と戻り値を確認する
        // nextIntメソッドを呼び出し、コンソールからの入力値を受け取る
        // 受け取った入力値は適切な型の変数に代入する
        int num = scanner.nextInt();

        // 受け取った入力値を「入力値 : (値)」の形式でコンソールに出力する
        System.out.println("入力値 : " + num);
    }
}
