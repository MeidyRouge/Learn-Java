package com.company;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        //2015年0月1日を指定してインスタンス生成
        //構文上は間違いないが、0月は存在しない月なので実行時エラー（DateTimeException）が発生する
        LocalDate a = LocalDate.of(2015,0,1);
        LocalDate b = LocalDate.parse("2015-01-01");
        System.out.println(a.equals(b));
    }
}

//ofメソッド：日付を指定してインスタンスを生成
//nowメソッド：現在の日付でインスタンスを生成
//parseメソッド：文字列の日付をLocalDateクラスに変換する


