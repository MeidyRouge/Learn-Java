package com.company;

public class Main {
    public static void main(String[] args){
        A a = new B();
        B b = (B) a;    //ダウンキャスト
        b.hello();
    }
}

//Aクラス型で扱っていた変数aをBクラス型にキャスト
//Bクラスのメソッド（hello()）などが使えるようになる
