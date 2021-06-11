package com.company;

public class Main {
    public static void main(String[] args){
        //(変数) -> {処理};
        //データ型の指定を省略することができる
        Algorithm algorithm = (name) -> {
            System.out.println("hello, " + name);
        };
        Service s = new Service();
        s.setLogic(algorithm);
        s.doProcess("Lambda");
    }
}

//8行目で変数nameを使用している以上、ラムダ式の変数宣言でnameを宣言し、渡す必要がある
//データ型は省略が可能
//(変数) -> {処理};という形で実装を行う

