package com.answer;

import java.util.List;

class Exercise05 {
    public static void main(String[] args) {
        // 年齢(Integer型)を要素に持つリスト
        List<Integer> ageList = List.of(77, 15, 25, 10, 18, 2);

        // リストが持つそれぞれの要素を用いて、料金を求める
        // 料金の一覧はテキストを参照する
        // コンソールに「(年齢)歳の料金は(料金)円です」と出力する
        for (Integer age : ageList) {
            int fee = 0;
            if (age >= 70) {
                fee = 250;
            } else if (age >= 20) {
                fee = 400;
            } else if (age >= 7) {
                fee = 200;
            }
            System.out.println(age + "歳の料金は" + fee + "円です");
        }
    }
}
