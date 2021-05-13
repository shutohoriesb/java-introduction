package com.answer;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        // コンソールから入力された年齢を受け取る
        Scanner scanner = new Scanner(System.in);
        System.out.print("年齢を入力してください : ");
        int age = scanner.nextInt();

        // 料金を表す変数feeを宣言し、0を代入する
        int fee = 0;

        // 以下の料金表を条件分岐で表現し、料金をfeeに代入する
        // 65歳以上 200円
        // 20歳以上 300円
        // 7歳以上かつ19歳以下 100円
        // 6歳以下  0円
        if (age >= 65) {
            fee = 200;
        } else if (age >= 20) {
            fee = 300;
        } else if (age >= 7 && age <= 19) {
            fee = 100;
        } else if (age <= 6) {
            fee = 0;
        }

        // 「年齢 : (age), 料金 : (fee)」の形式でコンソールに出力する
        System.out.println("年齢 : " + age + ", 料金 : " + fee);
    }
}
