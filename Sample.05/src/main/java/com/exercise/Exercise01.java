package com.exercise;
//import com.exercise.Student;

import java.time.chrono.JapaneseChronology;

class Exercise01 {
    public static void main(String[] args) {

        // Studentクラスのコンストラクタやメソッドを呼び出す演習

        // TODO Studentクラスのインスタンスを生成し、変数に代入する（引数は「山田」、81、69、79）
        Student student = new Student("山田", 81,69,79);

        // 生成したインスタンスを利用して、次のメソッドを呼び出す
        // 戻り値がある場合は変数に代入し、コンソールに出力する
        // 戻り値の有無はStudentクラスのメソッド宣言を確認する

        // TODO getJapaneseScoreメソッド
        System.out.println(student.getJapaneseScore());

        // TODO setEnglishScore (引数は60)
        student.setEnglishScore(60);

        // TODO printName
        student.printName();

        // TODO getTotalScoreWithAnother (引数は83)
        int TotalScore = student.getTotalScoreWithAnother(83);
        System.out.println(TotalScore);
    }
}
