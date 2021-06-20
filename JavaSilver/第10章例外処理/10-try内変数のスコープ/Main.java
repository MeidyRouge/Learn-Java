package com.company;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args){
        try (FileInputStream is = new FileInputStream("sample.txt")){
            throw new FileNotFoundException();
            String test;
            test = "test";
        }catch (Exception e){
            System.out.println("A");
            test = "test";
        }finally {
            if (is != null){
                is.close();
            }
            test = "test";
            System.out.println("B");
        }
    }
}
//変数isの範囲はtryの中のみ。finallyで参照した際にエラーが生じる
//同じくtry内で変数testを作成し、tyr-catch-finallyの中で値を代入してみる
//結果、catch、finallyでやはり変数testが見つからない旨のエラー
//try内部で宣言された変数の範囲は、try内部のみということ。



