package com.company;

public class Main {

    public static void main(String[] args) {
        Sample s = new Sample();
        int result = s.method(2);
        System.out.println(result);
    }
}

//正解：コンパイルエラー
//理由：Sample.methodで引数を2つ宣言しているにも関わらず、呼び出し元では1つしか引数を渡していないから。
//本質：呼び出し元メソッドの引数は、メソッドで宣言されている種類・数を一致させなければならない。
//追加情報：ソフトウェア設計の際には引数が多いほどメソッドは使いにくくなる。たくさんの引数をフィールドに持つ1つのオブジェクトを引数に受け取るようにした方が、簡潔で変更に強くなる。
