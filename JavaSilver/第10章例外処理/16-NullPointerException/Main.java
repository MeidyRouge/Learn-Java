package com.company;

public class Main {
    public static void main(String[] args){
        String str = null;
        if(str.equals("")){
            System.out.println("blank");
        }else{
            System.out.println();
        }
    }
}

//Exception in thread "main" java.lang.NullPointerException
//	at com.company.Main.main(Main.java:8)
//nullの変数に対し、メソッドで呼び出す処理を行うとNullPointerExceptionが発生する。
//IlligalArgumentExceptionは、不正な値を渡したときに発生する例外
//不正な値って？　⇒　例えば、配列なのに要素数として-1を指定した時など。