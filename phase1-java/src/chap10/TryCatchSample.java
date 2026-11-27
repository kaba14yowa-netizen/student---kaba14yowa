package chap10;

public class TryCatchSample {

    public static void main(String[] args) {
        String input = "12a"; // 利用者が入力した想定の文字列

        try {
            int number = Integer.parseInt(input);
            System.out.println(number * 2);
        } catch (NumberFormatException e) {
            System.out.println("数値に変換できません：" + input);
        }

        System.out.println("処理を続けられます");
    }
}