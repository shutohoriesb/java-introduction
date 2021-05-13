package com.answer;

class Student {
    private String name;
    private int japaneseScore;
    private int mathScore;
    private int englishScore;

    // コンストラクタ
    public Student(String name, int japaneseScore, int mathScore, int englishScore) {
        this.name = name;
        this.japaneseScore = japaneseScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    /**
     * japaneseScoreフィールドの値を返すメソッド
     * @return japaneseScoreフィールドの値
     */
    public int getJapaneseScore() {
        return japaneseScore;
    }

    /**
     * englishScoreフィールドに引数の値を代入するメソッド
     * @param englishScore
     */
    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    /**
     * japaneseScoreとmathScoreとenglishScoreの合計値を返すメソッド
     * @return 合計値
     */
    public int getTotalScore() {
        return japaneseScore + mathScore + englishScore;
    }

    /**
     *  japaneseScoreとmathScoreとenglishScoreと引数の値の合計値を返すメソッド
     * @param anotherScore
     * @return 合計値
     */
    public int getTotalScoreWithAnother(int anotherScore) {
        return getTotalScore() + anotherScore;
    }

    /**
     * nameフィールドの中身をコンソールに出力するメソッド
     */
    public void printName() {
        System.out.println("name : " + name);
    }
}
