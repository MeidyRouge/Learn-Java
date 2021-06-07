package com.company;

public class Sample {
    //コンパイルエラー
    //他の言語では引数を受け取らないことを（void）と書くこともあるが、Javaは()と書くため
    void method(void){}

    //コンパイルエラー
    //可変長引数を宣言しているが、「...」はデータ型の後ろに記述しないといけないため
    void method(int values...){}

    //コンパイルエラー
    //可変長引数は引数の最後に宣言しなくてはならないため
    void method(int... values, String name){}

    //コンパイルエラー
    //可変長引数は引数の最後に宣言しなくてはならないため。よって全てコンパイルエラー。
    void method(int... a, int...b)

    //正しい可変長引数を持つメソッド宣言
    //ポイント：可変長引数は最後に宣言、「...」はデータ型の後
    void sample(int... num){
        //do something
    }
}


