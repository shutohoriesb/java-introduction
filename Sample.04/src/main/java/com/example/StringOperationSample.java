package com.example;

class StringOperationSample {
    public static void main(String[] args) {
        // 文字列の結合
        String firstName = "John";
        String lastName = "Paul";
        String name = firstName + lastName;
        System.out.println(name); // JohnPaul

        // 文字列と文字列以外の結合
        int num = 10;
        String suffix = "人";
        String text = num + suffix;
        System.out.println(text); // 10人

        // 数値の演算にならない例
        String add1 = "2" + "3";
        System.out.println(add1); // 23
        String add2 = 12 + "34";
        System.out.println(add2); // 1234

        // 文字列の関係を調べる
        String userName = "Yamada";
        boolean isSame1 = userName.equals("Yamada");
        boolean isSame2 = userName.equals("Tanaka");
        boolean isDifferent1 = !userName.equals("Tanaka");
        boolean isDifferent2 = !userName.equals("Yamada");
        // それぞれの結果をコンソールに出力する
        System.out.println(isSame1); // true
        System.out.println(isSame2); // false
        System.out.println(isDifferent1); // true
        System.out.println(isDifferent2); // false
    }
}
