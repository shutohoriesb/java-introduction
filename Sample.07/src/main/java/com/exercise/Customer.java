package com.exercise;

class Customer {

    // TODO フィールド(name, point)
    private String name;
    private int point;

    // TODO コンストラクタ
    // 引数の値をフィールドに代入する
    // ポイントが0より大きくなければならない(引数の値が0以下の場合は100を代入する)
    Customer(String name, int point) {
        this.name = name;
        this.point = point;
    }

    // TODO addPointメソッド
    // 引数int型・戻り値なし
    // 引数が0より大きい時のみpointに加算する
    // 0以下の場合はなにもしない
    public void addPoint(int point){
        if (point > 0) {
            this.point += point;
        }
    }

    // TODO usePointメソッド
    // 引数int型・戻り値int型
    // 引数がpointより小さい場合はpointから引数を引く
    // 引いた後のpointの値を返す
    public int usePoint(int point){
        this.point -= point;
        return this.point;
    }

    // TODO getNameメソッド
    // 引数なし・戻り値String型
    // nameの値を返す
    public String getName(){
        return name;
    }

    // TODO getPointメソッド
    // 引数なし・戻り値int型
    // pointの値を返す
    public int getPoint(){
        return this.point;
    }


}
