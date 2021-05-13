package com.answer;

class Exercise01 {
    public static void main(String[] args) {

        // 4+9 の演算をするプログラムを記述し、結果をコンソールに出力する
        int ans1 = 4 + 9;
        System.out.println(ans1); // 13

        // 3×6÷2 の演算をするプログラムを記述し、結果をコンソールに出力する
        int ans2 = 3 * 6 / 2;
        System.out.println(ans2); // 9

        // 4,9,5,6,8の平均値(6.4)を求める演算を記述し、結果をコンソールに出力する
        int sum = 4 + 9 + 5 + 6 + 8;
        int count = 5;
        double average = (double) sum / count;
        System.out.println(average); // 6.4

        // 4と9を結合して49にする演算を記述し、結果をコンソールに出力する
        String concat = "4" + "9";
        System.out.println(concat);

        // 整数値の1と2が等しいかどうか確かめる演算を記述し、結果をコンソールに出力する
        boolean result1 = 1 == 2;
        System.out.println(result1); // false

        // 文字列の"Apple"と"りんご"が等しいかどうか確かめる演算を記述し、結果をコンソールに出力する
        boolean result2 = "Apple".equals("りんご");
        System.out.println(result2); // false
    }
}
