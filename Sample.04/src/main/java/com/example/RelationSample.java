package com.example;

class RelationSample {
    public static void main(String[] args) {
        int score = 67;
        // より大きい
        boolean isGreaterThan50 = score > 50;
        // 以上
        boolean isGreaterThanOrEqualTo50 = score >= 50;
        // より小さい(未満)
        boolean isLessThan50 = score < 50;
        // 以下
        boolean isLessThanOrEqualTo50 = score <= 50;

        // それぞれの結果をコンソールに出力する
        System.out.println(isGreaterThan50); // true
        System.out.println(isGreaterThanOrEqualTo50); // true
        System.out.println(isLessThan50); // false
        System.out.println(isLessThanOrEqualTo50); // false

        // 数値の等しさを確認する
        int amount = 100;
        boolean result1 = amount == 100;
        boolean result2 = amount == 200;
        boolean result3 = amount != 100;
        boolean result4 = amount != 200;

        // それぞれの結果をコンソールに出力する
        System.out.println(result1); // true
        System.out.println(result2); // false
        System.out.println(result3); // false
        System.out.println(result4);// true
    }
}
