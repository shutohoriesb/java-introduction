package com.answer;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public int getInt(String preMessage) {
        printPreMessage(preMessage);
        return scanner.nextInt();
    }

    public String getString(String preMessage) {
        printPreMessage(preMessage);
        return scanner.nextLine();
    }

    private void printPreMessage(String preMessage) {
        System.out.print(preMessage + " : ");
    }
}
