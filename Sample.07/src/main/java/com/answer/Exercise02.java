package com.answer;

public class Exercise02 {
    public static void main(String[] args) {
        Input input = new Input();

        String name = input.getString("名前を入力してください");

        int age = input.getInt("年齢を入力してください");

        System.out.println("名前 : " + name);
        System.out.println("年齢 : " + age);

    }
}
