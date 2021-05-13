package com.answer;

class Customer {

    // フィールド(name, point)
    private String name;
    private int point;

    // コンストラクタ
    // 引数の値をフィールドに代入する
    // ポイントが0より大きくなければならない(引数の値が0以下の場合は100を代入する)
    public Customer(String name, int point) {
        this.name = name;
        if (point > 0) {
            this.point = point;
        } else {
            this.point = 100;
        }
    }

    // addPointメソッド
    // 引数int型・戻り値なし
    // 引数が0より大きい時のみpointに加算する
    // 0以下の場合はなにもしない
    public void addPoint(int add) {
        if (add > 0) {
            point = point + add;
        }
    }

    // usePointメソッド
    // 引数int型・戻り値int型
    // 引数がpointより小さい場合はpointから引数を引く
    // 引いた後のpointの値を返す
    public int usePoint(int use) {
        if (use <= point) {
            point = point - use;
        }
        return point;
    }

    // getNameメソッド
    // 引数なし・戻り値String型
    // nameの値を返す
    public String getName() {
        return name;
    }

    // getPointメソッド
    // 引数なし・戻り値int型
    // pointの値を返す
    public int getPoint() {
        return point;
    }

}
