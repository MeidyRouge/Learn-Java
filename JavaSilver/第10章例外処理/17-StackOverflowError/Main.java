package com.company;

public class Main {
    public static void main(String[] args){
        main(args);
    }
}
//Exception in thread "main" java.lang.StackOverflowError
//原因：mainを延々と再帰呼び出しし、スタック領域が足りなくなったから
//JVMはスタック領域が足りない事を検知すると上記エラーをスローする