package com.example;

class ObjectSample {
    public static void main(String[] args) {

        // インスタンスを生成する
        Car fit = new Car();
        Car prius = new Car();

        // 名前を設定するCarクラスのメソッドを呼び出す
        fit.setName("フィット");
        prius.setName("プリウス");

        // 名前を取得するCarクラスのメソッドを呼び出す
        String fitName = fit.getName();
        String priusName = prius.getName();

        // 取得した名前を表示する
        System.out.println(fitName); // フィット
        System.out.println(priusName); // プリウス
    }
}
