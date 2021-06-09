package com.company;
import ex26.Parent;

class Child extends Parent {
    public static void main(String[] args) {
        System.out.println(num);
    }
}

//numを出力
//…が、Parent.javaのnumの修飾子がない＝同じパッケージに属するクラスからのみアクセスが可能なので
//ここでコンパイルエラー