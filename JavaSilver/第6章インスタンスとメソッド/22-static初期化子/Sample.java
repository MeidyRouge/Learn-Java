package com.company;

public class Sample {
    static int num;
    {
        num = 10;
    }
    public Sample(){
        num = 100
    }
}

//System.out.println(Sample.num);した場合
//コンストラクタや初期化子はインスタンス化しないと実行されない。
//よって、メソッドを呼び出す前にインスタンス化をしていれば、初期値num = 10
//Sampleメソッドを実行した際に、num = 100
//100が出力される。
//もしくは、static初期化子を使うことで、クラスロードに初期化が可能。