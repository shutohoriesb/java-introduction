package com.example;

class BooleanOperationSample {
    // 年齢が6歳以下または65歳以上なら料金を無料にするプログラム(一部)
    public static void main(String[] args) {
        int age = 40;

        // ageが6以下または65以上
        boolean free = age <= 6 || age >= 65; // false

        // ageが6より大きい、かつ65未満
        boolean paid = age > 6 && age < 65; // true

        // それぞれの結果をコンソールに出力する
        System.out.println(free);
        System.out.println(paid);
    }
}
