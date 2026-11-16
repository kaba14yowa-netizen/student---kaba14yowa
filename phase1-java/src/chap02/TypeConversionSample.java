package chap02;

public class TypeConversionSample {

    public static void main(String[] args) {
        int quantity = 3;
        double weight = 1.5;
        double totalWeight = quantity * weight; // intとdoubleの計算結果はdoubleになる
        System.out.println(totalWeight);

        double average = 76.8;
        int rounded = (int) average; // 小数点以下は四捨五入ではなく切り捨て
        System.out.println(rounded);

        System.out.println(10 / 4);   // int同士の割り算は小数点以下が切り捨てられる
        System.out.println(10.0 / 4); // どちらかがdoubleなら小数も残る
        System.out.println(10 % 4);   // 割り算の余り

        int price = 1500;
        System.out.println("価格は" + price + "円です"); // 数値をつなぐと自動で文字になる
    }
}