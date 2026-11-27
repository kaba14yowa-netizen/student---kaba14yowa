package chap10;

public class FirstExceptionSample {

    public static void main(String[] args) {
        int[] scores = {80, 65, 92};

        System.out.println("処理を始めます");
        System.out.println(scores[3]); // 3番の要素は存在しない（0・1・2番まで）
        System.out.println("処理が終わりました");
    }
}