package chap06;

public class ShippingAfter {

    public static void main(String[] args) {
        
        printBilling(2500);
        printBilling(1200);
        printBilling(2000);
        printBilling(300);
    }
    
    public static int calculateShipping(int orderPrice) {
        if (orderPrice >= 2000) {
            return 0;
        } else {
            return 500;
        }
    }
    
    public static void printBilling(int orderPrice) {
        int shipping = calculateShipping(orderPrice);
        int total = orderPrice + shipping;
        System.out.println("注文金額" + orderPrice + "円、送料" + shipping + "円、請求額" + total + "円");
    }
}