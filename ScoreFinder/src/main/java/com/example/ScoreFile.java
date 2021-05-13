package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

class ScoreFile {
    private List<Score> scoreList;

    public ScoreFile() {
        scoreList = new ArrayList<>();
        setUp();
    }

    // score.csvファイルから点数データを読み込んでリスト化する
    private void setUp() {
        Path path = Path.of("src/main/resources/score.csv");
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                List<String> list = List.of(line.split(","));
                String name = list.get(0);
                int score = Integer.parseInt(list.get(1));
                scoreList.add(new Score(name, score));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // リストの中から名前に合致する行を検索し、合計点を返す
    public int getTotalScore(String name) {
        int total = 0;
        for (Score score : scoreList) {
            String scoreName = score.getName();
            if (name.equals(scoreName)) {
                int point = score.getPoint();
                total = total + point;
            }
        }
        return total;
    }
}
