package com.answer;

import java.util.List;

public class Exercise04 {
    public static void main(String[] args) {

        // 2,8,5,9,10 を要素に持つList型変数listを宣言する
        List<Integer> list = List.of(2, 8, 5, 9, 10);

        // 合計値を表す変数sumを宣言し、0を代入する
        int sum = 0;

        // 繰り返しを使って合計値を求め、sumに代入する
        for (int num : list) {
            sum = sum + num;
        }

        // 合計値(sum)をコンソールに出力する
        System.out.println(sum);

        // (発展) 平均値を求める
        // java.util.ListのAPIリファレンスを使って、リストの要素数を求めるメソッドを探す
        // listの要素数を求めて変数countに代入する
        int count = list.size();

        // 求めた要素数(count)と合計値(sum)を使って平均値(average)を求める
        double average = (double) sum / count;

        // 平均値(average)をコンソールに出力する
        System.out.println(average);
    }
}
