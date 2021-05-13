package com.handson;

class StringOperationSample {
    public static void main(String[] args) {
        // TODO 文字列の結合
        String firstName = "John";
        String lastName = "Paul";
        String name = firstName+lastName;
        System.out.println(name);

        // TODO 文字列と文字列以外の結合
        int num = 10;
        String suffix = "人";
        String text = num+suffix;
        System.out.println(text);

        // TODO 数値の演算にならない例
        String add1= "2"+"3";
        System.out.println(add1);
        String add2 = 12 + "34";
        System.out.println(add2);

        // TODO 文字列の関係を調べる
        String userName = "Yamada";
        boolean isSame1 = userName.equals("Yamada");
        boolean isSame2 = userName.equals("Tanaka");
        boolean isDifferent1 = !userName.equals("Tanaka");
        boolean isDifferent2 = !userName.equals("Yamada");

        // TODO それぞれの結果をコンソールに出力する
        System.out.println(isSame1);
        System.out.println(isSame2);
        System.out.println(isDifferent1);
        System.out.println(isDifferent2);

    }
}
