package com.answer;

import java.util.Scanner;

class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    /**
     * コンソールから入力された整数値を返すメソッド
     * このメソッドを呼び出すと、引数に渡した文字列をコンソールに表示した後、ユーザーからの入力を待機する
     *
     * @param preMessage 入力前に表示する文字列
     * @return コンソールから入力された整数値
     */
    public int nextInt(String preMessage) {
        printPreMessage(preMessage);
        return scanner.nextInt();
    }

    /**
     * コンソールから入力された文字列を受け取る
     * このメソッドを呼び出すと、引数に渡した文字列をコンソールに表示した後、ユーザーからの入力を待機する
     *
     * @param preMessage 入力前に表示する文字列
     * @return コンソールから入力された文字列
     */
    public String nextLine(String preMessage) {
        printPreMessage(preMessage);
        return scanner.nextLine();
    }

    private void printPreMessage(String preMessage) {
        System.out.print(preMessage + " : ");
    }

}
