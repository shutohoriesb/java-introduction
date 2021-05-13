package com.exercise;

import java.util.Scanner;

class Input {
    // コンソールから入力された文字列を返すメソッド
    public String getInputPostalCode(){
        System.out.print("郵便番号を入力してください : ");
        Scanner reader = new Scanner(System.in);
        return reader.nextLine();
    }

}
