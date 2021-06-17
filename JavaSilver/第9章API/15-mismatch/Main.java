package com.company;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String[] a = {"b","c"};
        String[] b = {"a","b","c"};

        //mismatchメソッド：一致しない要素の数を返す
        System.out.println(Arrays.mismatch(a,b));
    }
}
//1つ目、bとaを比較した結果、不一致なので0番目の要素数である「0」を返す
//なお、全て一致しない場合「-1」を返す




