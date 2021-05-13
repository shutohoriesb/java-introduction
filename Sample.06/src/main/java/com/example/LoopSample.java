package com.example;

import java.util.List;

class LoopSample {
    public static void main(String[] args) {
        // 繰り返し処理したい対象(リスト)
        List<Integer> scoreList = List.of(74, 71, 92, 68, 58);

        // 単純な繰り返し処理
        for (int score : scoreList) {
            System.out.println(score);
        }

        // ブロックには複数の命令を記述できる
        int sum = 0;
        for (int score : scoreList) {
            sum = sum + score;
            System.out.println("score : " + score);
        }
        System.out.println("合計点 : " + sum);

        // 処理をネストする
        // 受けていない試験の得点を−1で示す
        List<Integer> scores = List.of(74, 71, 92, -1, 58);
        int sum2 = 0;
        for (int score : scores) {
            if (score >= 0) {
                sum2 = sum2 + score;
            } else {
                System.out.println("受験していないため加算しませんでした");
            }
        }
        System.out.println("合計点 : " + sum2);

    }
}
