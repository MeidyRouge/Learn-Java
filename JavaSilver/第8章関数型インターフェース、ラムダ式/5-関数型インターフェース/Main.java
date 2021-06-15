package com.company;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args){
        List<Sample>List = Arrays.asList(new Sample(10),
                                        new Sample(20),
                                        new Sample(30));
        //predicate:boolean型の値を返すための関数型インターフェース
        Predicate<Sample> x =   s -> List.contains(s);
        if(x.test(new Sample(20))){
            System.out.println("ok");
        }
    }
}


class Sample{
    private int num;
    public Sample(int num){
        this.num = num;
    }
    public boolean equals(Object obj){
        if (obj instanceof Sample == false){
            return false;
        }
        if (this.num == ((Sample)obj).num){
            return true;
        }
        return false;
    }
}

//関数型インターフェース
//Consumer<T>：引数を受取、処理をする。結果を返さない。引数を消費するので、Consumer
//Suppier<T>：何も受け取らず結果だけを返す。「供給者」
//Predicate<T>：引数を受け取って評価する。「断定」
//Funciton<T>：引数を受け取って指定された型の結果を返す。