package com.answer;

class Exercise01 {

    public static void main(String[] args) {

        // このクラスのコンパイルエラーがなくなるようにCustomerクラスを宣言する
        // 宣言するときの仕様
        // (A) カプセル化の原則に従う
        // (B) インスタンス化するときのポイントは0より大きくなければならない
        //     0以下の場合は100を初期値とする
        // (C) ポイントは0以下にならない
        //     = ポイントを使用する時の上限は現在所持しているポイント数

        // (1) インスタンス化
        Customer tanaka = new Customer("田中", 1000);

        // (2) ポイント加算
        tanaka.addPoint(100);

        // (3) ポイントを利用し、残りポイントを取得する
        // 残りポイントはコンソールに出力する
        int current = tanaka.usePoint(200);
        System.out.println(current);

        // (4) 名前と現在のポイント数をコンソールに出力する
        String name = tanaka.getName();
        int point = tanaka.getPoint();
        System.out.println(name + " 様 (" + point + " ポイント)");
    }
}
