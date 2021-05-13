package com.handson;

class RelationSample {
    public static void main(String[] args) {
        int score = 67;
        // TODO より大きい
        boolean isGreaterThan50 = score > 50;

        // TODO 以上
        boolean isGreaterThanOrEqualTo50 = score >= 50;

        // TODO より小さい(未満)
        boolean isLessThan50 = score < 50;

        // TODO 以下
        boolean isLessThanOrEqualTo50 = score <= 50;

        // TODO それぞれの結果をコンソールに出力する
        System.out.println(isGreaterThan50);
        System.out.println(isGreaterThanOrEqualTo50);
        System.out.println(isLessThan50);
        System.out.println(isLessThanOrEqualTo50);

        // TODO 数値の等しさを確認する
        int amount = 100;
        boolean result1 = amount==100;
        boolean result2 = amount==200;
        boolean result3 = amount !=100;
        boolean result4 = amount !=200;

        // TODO それぞれの結果をコンソールに出力する
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);





    }
}
