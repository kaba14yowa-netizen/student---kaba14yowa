package chap11;

public class productManager {

    private String name;
    private int price;
    
    public productManager(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void showInfo() {
        System.out.println(name + ":" + price + "円");
    }
}