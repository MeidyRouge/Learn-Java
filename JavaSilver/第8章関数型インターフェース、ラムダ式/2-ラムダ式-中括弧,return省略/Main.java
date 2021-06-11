package com.company;

public class Main {
    public static void main(String[] args){
        Test t = () -> "hello!";
        System.out.println(t.process());
    }
}
//{}なし・・・処理が１つだけの時。return省略
//{}あり・・・複数の処理の時。return必要

