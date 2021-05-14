package com.exercise;

import java.util.Scanner;

public class Input{
    Scanner sc = new Scanner(System.in);
    String inputString;
    int inputInt;

    public String getString(String message){
        System.out.print(message + "：");
        inputString = sc.nextLine();

        return inputString;
    }

    public int getInt(String message){
        System.out.print(message + "：");
        inputInt = sc.nextInt();

        return inputInt;
    }
}
