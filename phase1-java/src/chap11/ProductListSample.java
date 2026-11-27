package chap11;

import java.util.ArrayList;

public class ProductListSample {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        
        products.add(new Product("ノート", 150));
        products.add(new Product("ペン", 100));
        products.add(new Product("消しゴム", 80));
        products.add(new Product("チョコレート", 150));
        products.add(new Product("クッキー", 100));
        
        System.out.println("商品数：" + products.size() + "件");
        
        for (Product product : products) {
            product.showInfo();
        }
        
        int total = 0;
        for (Product product : products) {
            total = total + product.getPrice();
        }
        System.out.println("合計：" + total + "円");
        
        Product maxProducts = products.get(0);
        for (Product product : products) {
            if (product.getPrice() > maxProducts.getPrice()) {
                maxProducts = product;
            }
        }
        System.out.println("最高額：" + maxProducts.getName() + "（" + maxProducts.getPrice() + "円）");
        
        String searchName = "ペン";
        boolean isFound = false;
        for (Product product : products) {
            if (product.getName().equals(searchName)) {
                isFound = true;
            }
        }
        System.out.println(searchName + "はありますか：" + isFound);
    }
}