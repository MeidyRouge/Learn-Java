package com.company;

public class Main {
    public static void main(String[] args){
        try {
            try {
                String[] array = {"A","B","C"};
                //ここで例外がスロー、catchとfinallyが実行
                System.out.println(array[3]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("D");
            }finally {
                System.out.println("E");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("F");
        }finally {
            //finallyは最後に必ず実行される。よってDEGの出力
            System.out.println("G");
        }
    }
}




