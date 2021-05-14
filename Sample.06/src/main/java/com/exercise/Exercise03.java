package com.exercise;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {

        // コンソールから入力された年齢と身長を受け取る
        Scanner scanner = new Scanner(System.in);
        System.out.print("年齢を入力してください : ");
        int age = scanner.nextInt();
        System.out.print("身長を入力してください : ");
        int height = scanner.nextInt();

        // TODO 年齢が6歳以上 かつ 身長が100センチ以上 の場合は
        // 「年齢が6歳以上 かつ 身長が100センチ以上です。」とコンソールに出力する
        if (age >= 6 && height>=100){
            System.out.println("年齢が6歳以上 かつ 身長が100センチ以上です。");
        }

        // TODO 年齢が6歳以下 または 65歳以上 の場合は、
        // 「年齢が6歳以下 または 65歳以上です。」とコンソールに出力する
        if (age <= 6 || age>=65){
            System.out.println("年齢が6歳以下 または 65歳以上です。");
        }
    }
}
