package chap02;

public class PriceCalculation {

    public static void main(String[] args) {
        String name = "鶏肉";
        int price =  456;
        int count = 3;
        double height = 156.5;
        int totalprice = price * count;
        
        System.out.println("商品名：" + name);
        System.out.println("合計金額：" + totalprice + "円");
        
        int tax = (int)(totalprice * 110 / 100);
        System.out.println("税込" + tax + "円");

        double totalheight = (double)(height * count);
        System.out.println("合計の重さ：" + totalheight + "kg");
    }

}
