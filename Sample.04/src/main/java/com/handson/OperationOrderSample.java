package com.handson;

class OperationOrderSample {
    public static void main(String[] args) {
        // 優先順位が変わる例
        int sample1 = 1 + 2 * 3;
        int sample2 = (1 + 2) * 3;
        System.out.println(sample1); // 7
        System.out.println(sample2); // 9

        // 優先順位が変わらない例
        int height = 170;
        int weight = 70;
        boolean result1 = height >= 175 && weight <= 80;
        boolean result2 = (height >= 175) && (weight <= 80);
        System.out.println(result1); // false
        System.out.println(result2); // false
    }
}
