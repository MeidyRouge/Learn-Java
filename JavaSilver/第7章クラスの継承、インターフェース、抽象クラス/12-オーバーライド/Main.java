package com.company;

public class Main {
    public static void main(String[] args){
        A a = new A(); //Aクラス型のインスタンス生成
        A b = new B(); //Aクラス型のインスタンス生成
        System.out.print(a.val); //インスタンスaのvalを出力(A)
        System.out.print(b.val); //インスタンスbのvalを出力(B)
        a.print(); //インスタンスaのprintメソッド実行(A)
        b.print(); //インスタンスbのprintメソッド実行(A)
    }
}

