package com.example;

class Main {

    public static void main(String[] args) {
        Input input = new Input();
        String name = input.getInputName();
        ScoreFile scoreFile = new ScoreFile();
        int totalScore = scoreFile.getTotalScore(name);
        System.out.println(name + "さんの点数は " + totalScore + " 点です");
    }
}
