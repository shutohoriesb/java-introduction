package com.exercise;

import java.io.IOException;

class Exercise02 {

    public static void main(String[] args) {

        // (1) このプログラムを何度か実行する
        // (2) 実行ごとに、どの行が実行されたかを出力から読み取る
        // (3) 実行ごとに、以下のどれに当てはまるかを選ぶ
        //     ■ 例外が発生しなかった
        //     ■ catchブロックに対応する例外が発生した
        //     ■ catchブロックに対応しない例外が発生した
        System.out.println("1 プログラム開始");
        try {
            ExceptionExercise sample = new ExceptionExercise();
            sample.testIO();
            sample.testNPE();
            System.out.println("4 tryブロックの終わり");
        } catch (IOException e) {
            System.out.println("5 IOExceptionが発生");
        }
        System.out.println("6 プログラム終了");

    }
}
