package com.exercise;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {

        // 発展問題
        // コンソールから入力された年齢を受け取る
        Scanner scanner = new Scanner(System.in);
        System.out.print("年齢を入力してください : ");
        int age = scanner.nextInt();

        int fee;

        // TODO 以下の料金表を条件分岐で表現し、料金を変数feeに代入する
        if (age>=60) {
            fee = 100;
        } else if (age>=10) {
            fee = 200;
        } else {
            fee = 0;
        }
        // 10歳以上 200円
        // 60歳以上 100円
        // それ以外 0円

        // TODO 「年齢 : (age), 料金 : (fee)」の形式でコンソールに出力する
        System.out.println("年齢 : " + age +  ", 料金 : " + fee);
    }
}
