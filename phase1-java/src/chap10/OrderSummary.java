package chap10;

public class OrderSummary {

    public static void main(String[] args) {
        String[] items = {"ノート", "ペン", "はさみ"};
        int[] prices = {150, 100, 300};

        int total = 0;
        for (int i = 0; i <= items.length; i++) {
            System.out.println(items[i] + "：" + prices[i] + "円");
            total = total + prices[i];
        }
        System.out.println("合計：" + total + "円");
    }
}