package com.example.field;

class CounterMain {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.print(); // countLocal : 1, countField : 1
        counter.print(); // countLocal : 1, countField : 2
        counter.print(); // countLocal : 1, countField : 3
    }
}
