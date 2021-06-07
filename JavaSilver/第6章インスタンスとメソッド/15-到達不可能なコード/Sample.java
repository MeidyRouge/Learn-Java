package com.company;

public class Sample {
    public void method(int num){
        if(num<0) return;
        System.out.println("A");
        return;
        //↑強制return　↓到達不能なコードがある場合、コンパイルエラー
        System.out.println("B");
    }
}


