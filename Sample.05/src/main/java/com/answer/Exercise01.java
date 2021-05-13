package com.answer;

class Exercise01 {
    public static void main(String[] args) {

        // Studentクラスのコンストラクタやメソッドを呼び出す演習

        // Studentクラスのインスタンスを生成し、変数に代入する（引数は「山田」、81、69、79）
        Student yamada = new Student("山田", 81, 69, 79);

        // 生成したインスタンスを利用して、次のメソッドを呼び出す
        // 戻り値がある場合は変数に代入し、コンソールに出力する
        // 戻り値の有無はStudentクラスのメソッド宣言を確認する

        // getJapaneseScoreメソッド
        int japaneseScore = yamada.getJapaneseScore();
        System.out.println(japaneseScore);

        // setEnglishScore (引数は60)
        yamada.setEnglishScore(60);

        // printName
        yamada.printName();

        // getTotalScoreWithAnother (引数は83)
        int total = yamada.getTotalScoreWithAnother(83);
        System.out.println(total);
    }
}
