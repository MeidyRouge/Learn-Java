package com.company;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(new Integer[]{1,2,3});

        //compareToメソッド：与えられた引数を比較し、第一引数を前にするなら-1、第2引数を前にするなら1、並び順を変更しないなら0を返す
        //1,2,3を3,2,1に並べ変えるには、compareToにマイナス符号をつけて判定結果の数値の符号を逆にする
        list.sort ((a,b) -> -a.compareTo(b));
        for(Integer num : list){
            System.out.println(num);
        }
    }
}




