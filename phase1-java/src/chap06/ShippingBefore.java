package chap06;

public class ShippingBefore {

    public static void main(String[] args) {
        int orderPrice1 = 2500;
        int shipping1;
        if (orderPrice1 >= 2000) {
            shipping1 = 0;
        } else {
            shipping1 = 500;
        }
        System.out.println("注文金額" + orderPrice1 + "円、送料" + shipping1 + "円、請求額" + (orderPrice1 + shipping1) + "円");

        int orderPrice2 = 1200;
        int shipping2;
        if (orderPrice2 >= 2000) {
            shipping2 = 0;
        } else {
            shipping2 = 500;
        }
        System.out.println("注文金額" + orderPrice2 + "円、送料" + shipping2 + "円、請求額" + (orderPrice2 + shipping2) + "円");

        int orderPrice3 = 2000;
        int shipping3;
        if (orderPrice3 >= 2000) {
            shipping3 = 0;
        } else {
            shipping3 = 500;
        }
        System.out.println("注文金額" + orderPrice3 + "円、送料" + shipping3 + "円、請求額" + (orderPrice3 + shipping3) + "円");
    }
}