package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        //asListメソッドを用いた固定長のリスト生成と要素の追加
        Integer[] array = {1,2,3};
        var list = Arrays.asList(array);
        list.add(9);
        list.remove(1);
        //実行すると実行時エラー。理由）asListを使って生成したインスタンスは固定長のため、addができない

        //ofメソッドを用いた固定長のリスト生成と要素の追加
        var list2 = List.of(1,2,3);
        list2.add(9);
        //1~3の要素を持つリストを生成。asListと同様、実行時エラー
    }
}





