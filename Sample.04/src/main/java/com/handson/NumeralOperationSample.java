package com.handson;

class NumeralOperationSample {
    public static void main(String[] args) {
        // TODO 足し算
        int foodPrice = 10;
        int clothPrice = 20;
        int sum = foodPrice+clothPrice;
        System.out.println(sum);

        // TODO 値と変数の演算
        int input = 5;
        int add = input+10;
        System.out.println(add);

        // TODO 引き算
        int all = 10;
        int used = 5;
        int remaining = all-used;
        System.out.println(remaining);

        // TODO 掛け算
        int unit = 20;
        int amount = 5;
        int total = unit*amount;
        System.out.println(total);

        // TODO 割り算
        int sumOfAge = 100;
        int numOfPeople = 5;
        int average = sumOfAge/numOfPeople;
        System.out.println(average);

        // TODO 剰余の演算(割り算の余りを求める演算)
        int odd = 19;
        int even = 20;
        int rem1 = odd%2;
        int rem2 = even%2;
        System.out.println(rem1);
        System.out.println(rem2);
    }
}
