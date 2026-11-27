package chap13;

public class Calc {

    // 税込価格を計算する（消費税10%、1円未満切り捨て）
    public static int taxIncluded(int price) {
        return price * 110 / 100;
    }

    // 送料を計算する（注文金額2000円以上は無料）
    public static int shipping(int orderPrice) {
        if (orderPrice >= 2000) {
            return 0;
        }
        return 500;
    }
}