package com.example.field;

class Counter {

    private int countField;

    public void print() {
        int countLocal = 0;
        countLocal = countLocal + 1;
        countField = countField + 1;
        System.out.println("countLocal : " + countLocal + ", countField : " + countField);
    }
}
