package com.company;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String[] a = {"b","a"};
        String[] b = {"a","b","c"};

        //compareメソッド：2つの配列を辞書順に並べた時の並び順を比較し、a>bの時-1　a=bの時0　a<bの時1を返す
        System.out.println(Arrays.compare(a,b));
    }
}

//配列aの1つ目の要素"b"と配列bの1つ目の要素"a"を比較する
//辞書順で比較すると、b < a、aの方がbより先の単語のため、1を返す




