package com.exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

class PointList {

    private List<Integer> pointList;

    public PointList() {
        pointList = new ArrayList<>();
        setUp();
    }

    private void setUp() {
        try {
            List<String> lines = Files.readAllLines(Path.of("src/main/resources/points.csv"));
            for (String line : lines) {
                int point = Integer.parseInt(line);
                pointList.add(point);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getTotalPoint() {
        int sum = 0;
        for (int point : pointList) {
            sum = sum + point;
        }
        return sum;
    }

    public double getAverage() {
        return (double) getTotalPoint() / pointList.size();
    }

}
