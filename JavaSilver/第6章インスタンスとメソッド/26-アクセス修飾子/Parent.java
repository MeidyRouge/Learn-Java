package ex26;

public class Parent {
    int num = 10;
}

//numに修飾子なし＝同じpackageに属するクラスからのみ使用可能（ここではex26に属するクラスからのみ使用可能）
//public=全てのクラスからアクセス可能
//protected=同じパッケージまたは継承しているサブクラスからのみアクセス可能