package com.example;

import java.util.List;

class ExceptionSample {
    public static void main(String[] args) {
        List<Integer> scoreList = List.of(74, 71, 92, 68, 58);
        System.out.println(scoreList.get(0)); // 74
        System.out.println(scoreList.get(1)); // 71
        System.out.println(scoreList.get(2)); // 92
        System.out.println(scoreList.get(3)); // 68
        System.out.println(scoreList.get(4)); // 58

        System.out.println(scoreList.get(5)); // ???
    }
}
