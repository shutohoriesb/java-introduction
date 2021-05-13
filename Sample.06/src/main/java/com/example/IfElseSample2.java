package com.example;

import java.util.Scanner;

class IfElseSample2 {

    public static void main(String[] args) {
        System.out.print("今日の最高気温を入力してください:");
        Scanner scanner = new Scanner(System.in);
        int maxTemperature = scanner.nextInt();
        System.out.println("今日の最高気温は" + maxTemperature + "度です。");

        String summerDay = "猛暑日・真夏日・夏日ではない日";
        if (maxTemperature >= 35) {
            summerDay = "猛暑日";
        } else if (maxTemperature >= 30) {
            summerDay = "真夏日";
        } else if (maxTemperature >= 25) {
            summerDay = "夏日";
        }
        System.out.println("今日は" + summerDay + "です。");
    }
}
