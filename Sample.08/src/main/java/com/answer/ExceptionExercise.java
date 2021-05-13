package com.answer;

import java.io.IOException;

class ExceptionExercise {

    public void testIO() throws IOException {
        System.out.println("2 testIOメソッドを実行");
        if (Math.random() > 0.5) {
            throw new IOException();
        }
    }

    public void testNPE() throws NullPointerException {
        System.out.println("3 testNPEメソッドを実行");
        if (Math.random() > 0.5) {
            throw new NullPointerException();
        }
    }

}
