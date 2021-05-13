package com.example;

class TypeSample {
    public static void main(String[] args) {
        // 平均年齢を計算する
        int sumOfAge = 68 + 41 + 53 + 62 + 20;
        int numOfPeople = 5;
        // 変数sumOfAgeの型をdoubleにキャストする
        double average = (double) sumOfAge / numOfPeople; // 244 ÷ 5 = 48.8
        System.out.println(average); // 48.8
    }
}
