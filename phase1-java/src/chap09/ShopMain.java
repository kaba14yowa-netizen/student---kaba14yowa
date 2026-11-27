package chap09;

public class ShopMain {

    public static void main(String[] args) {
        Product[]products = {
                new Book("Java入門", 2800, "山田太郎"),
                new Food("チョコレート", 350, "2026-12-31"),
                new Goods("洗剤", 400),
                new Drink("オレンジジュース", 200, 500),
        };
        
        for (Product product : products) {
            product.showInfo();
        }
        
        Discountable[] saleItems = {
                new Food("チョコレート", 350, "2026-12-31"),
                new Goods("洗剤", 400),
                new Drink("オレンジジュース", 200, 500)
        };
        
        for (Discountable item : saleItems) {
            System.out.println("割引後：" + item.discountedPrice() + "円");
        }

     }

 }
