package com.handson;


class ObjectSample {
    public static void main(String[] args) {

        // TODO インスタンスを生成する
        Car fit = new Car();
        Car prius = new Car();

        // TODO 名前を設定するCarクラスのメソッドを呼び出す
        fit.setName("フィット");
        prius.setName("プリウス");

        // TODO 名前を取得するCarクラスのメソッドを呼び出す
        String fitName = fit.getName();
        String priusName = prius.getName();

        // TODO 取得した名前を表示する
        System.out.println(fitName);
        System.out.println(priusName);

    }
}
