package com.company;

public class Sample {
    Sample(){
        System.out.println("A");
    }
    {   //初期化子
        System.out.println("B");
    }
}

//初期化子はコンストラクタが実行される前に実行される。
//上記Sampleメソッドが呼び出された際には、まず初期化子の処理（B出力）を行った後、コンストラクタ（A出力）が行われる。