package com.exercise;

import java.util.List;

public class Exercise04 {
    public static void main(String[] args) {

        // 2,8,5,9,10 を要素に持つList型変数listを宣言する
        List<Integer> list = List.of(2, 8, 5, 9, 10);

        // TODO 合計値を表す変数sumを宣言し、0を代入する
        int sum  = 0;

        // TODO 繰り返しを使って合計値を求め、sumに代入する
        for (Integer num : list) {
            sum += num;
        }

        // TODO 合計値(sum)をコンソールに出力する
        System.out.println(sum);

        // (発展) 平均値を求める
        // TODO java.util.ListのAPIリファレンスを使って、リストの要素数を求めるメソッドを探す
        // TODO listの要素数を求めて変数countに代入する
        int listSize = list.size();

        // TODO 求めた要素数(count)と合計値(sum)を使って平均値(average)を求める
        double average = (double) sum / listSize;

        // TODO 平均値(average)をコンソールに出力する
        System.out.println(average);
    }
}
