package com.handson.constructor;

class CarMain {
    public static void main(String[] args) {
        // デフォルトコンストラクタを呼び出す
        Car1 car1 = new Car1();

        // デフォルトコンストラクタを呼び出せない(デフォルトコンストラクタが無効のため)
        // Car2 car2 = new Car2();

        // 定義したコンストラクタを呼び出す
        Car2 car2 = new Car2("プリウス");
    }
}
