package chap08;

public class PolymorphismMain {

    public static void main(String[] args) {
        Product[] products = {
            new Product("ノート", 150),
            new Book("Java入門", 2800, "山田太郎"),
            new Book("はじめてのSQL", 2200, "鈴木花子"),
            new Food("チョコレート", 350, "2026-12-31"),
        };

        for (Product product : products) {
            product.showInfo(); // 実際に入っているクラスのshowInfoが呼ばれる
        }
    }
}