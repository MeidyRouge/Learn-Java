package com.company;

public class Main {
    public static void main(String[] args){
        try {
            sample();
            sub();
            //sub()によりSubSampleExceptionがスローされる
            //そのスローと、1つ目のcatch：SampleExceptionが対応しているかを判定する
            //SubSampleExceptionはSampleExceptionを継承しているので、1つ目のcatchで対応していると判断してしまう
            //よって、2つ目のcatchには到達不可能であり、到達不可能なコードが記載されているとコンパイルエラーが発生する
        }catch(SampleException e){
            System.out.println("A");
        }catch (SubSampleException e){
            System.out.println("B");
        }
    }

    private static void sample() throws SampleException{
        throw new SampleException();
    }

    private static void sub() throws SubSampleException{
        throw new SubSampleException();
    }
}




