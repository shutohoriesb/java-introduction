package com.example;

import java.util.Scanner;

class Input {

    // コンソールから入力された文字列を返すメソッド
    public String getInputName() {
        System.out.print("名前を入力してください : ");
        Scanner reader = new Scanner(System.in);
        return reader.nextLine();
    }

}
