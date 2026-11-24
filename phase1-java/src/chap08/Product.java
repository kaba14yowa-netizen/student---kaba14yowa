package chap08;

public class Product {
    
    private String name;
    private int price;
    
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        if(price < 0) {
            System.out.println("価格には0以上を指定してください：" + price);
        }
        this.price = price;
    }
    
    public void showInfo() {
        System.out.println(name + "：" + price + "円");
    }

}
