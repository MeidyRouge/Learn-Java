package com.company;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        try {
            //要素数0の配列生成
            int[] array = {};

            //1番目の要素に10を格納（エラーなのでcatch先のprintlnメソッドが実行）
            array[0] = 10;
            System.out.println("finish");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("error");
        }
    }
}




