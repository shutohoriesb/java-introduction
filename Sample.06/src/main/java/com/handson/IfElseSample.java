package com.handson;

import java.util.Scanner;

class IfElseSample {

    public static void main(String[] args) {
        System.out.print("今日の最高気温を入力してください:");
        Scanner scanner = new Scanner(System.in);
        int maxTemperature = scanner.nextInt();
        System.out.println("今日の最高気温は" + maxTemperature + "度です。");

        // TODO maxTemperatureの値によって表示するメッセージを変える
        // 35以上：今日は猛暑日です。
        // 30以上：今日は真夏日です。
        // 25以上：今日は夏日です。
        // その他：今日は猛暑日・真夏日・夏日ではない日です。
        if (maxTemperature >= 35) {
            System.out.println("今日は猛暑日です。");
        } else {
            System.out.println("今日は猛暑日ではありません。");
        }
        if (maxTemperature >= 30) {
            System.out.println("今日は真夏日です。");
        }
        else {
            System.out.println("今日は真夏日ではありません。");
        }
        if (maxTemperature >= 25) {
            System.out.println("今日は夏日です。");
        } else {
            System.out.println("今日は夏日ではありません。");
        }









    }
}
