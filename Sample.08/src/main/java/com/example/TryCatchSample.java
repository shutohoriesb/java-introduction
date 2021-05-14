package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class TryCatchSample {
    public static void main(String[] args) {
        try {
            // resourcesフォルダのscores.txtファイルからすべての行を読み込む
            List<String> lines = Files.readAllLines(Path.of("src/main/resources/scores.txt"));
            int sum = 0;
            for (String tempLine : lines) {
                // 読み込んだ文字列をint型に変換する
                int score = Integer.parseInt(tempLine);
                sum = sum + score;
            }
            System.out.println("合計点は" + sum + "点です。");
        } catch (IOException e) {
            System.out.println("ファイルの読み込みに失敗しました。");
            e.printStackTrace();
        }
        System.out.println("プログラムの実行が完了しました。");
    }
}
