package chap07;

public class Product {
    private String name;
    private int price;
    private int stock; 

    public Product(String name, int price, int stock) {
        this.name = name;
        setPrice(price); 
        if (stock >= 0) {
            this.stock = stock;
        } else {
            this.stock = 0;
        }
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            System.out.println("価格は0円以上にしてください");
            return;
        }
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void sell() {
        if (stock >= 1) {
            stock--;
            System.out.println(name + "が1つ売れました（残り" + stock + "個）");
        } else {
            System.out.println(name + "は在庫切れです");
        }
    }

    public void showInfo() {
        System.out.println(name + "：" + price + "円（在庫" + stock + "個）");
    }
}

