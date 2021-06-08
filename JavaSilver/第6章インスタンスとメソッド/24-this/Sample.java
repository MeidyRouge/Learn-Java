package com.company;

public class Sample {
    public Sample(){
        this(null,0);
    }
    public Sample(String str,int num){
        System.out.println("ok.");
    }
}

//コンストラクタはオーバーロードして複数定義も可能
//オーバーロードされたコンストラクタから別のコンストラクタを呼ぶときにはthisを使う
//thisには①オーバーロードされた別のコンストラクタを呼ぶ　②インスタンスそのものを表す参照を入れる変数として使う　の2パターンある