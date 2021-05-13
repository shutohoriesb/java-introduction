package com.answer;

class Exercise01 {

    public static void main(String[] args) {
        // (1) このクラスを実行する
        // (2) 例外が起きる場合、以下を特定する
        //     - 例外クラス名
        //     - 例外発生箇所(クラス・メソッド・行番号)
        //     ※ PointListクラス・setUpメソッド・22行目でNumberFormatException
        PointList pointList = new PointList();
        int total = pointList.getTotalPoint();
        double average = pointList.getAverage();
        System.out.println("合計 : " + total + ", 平均 : " + average);
    }
}
