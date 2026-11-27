package chap09;

public class Drink extends Product implements Discountable {

    private int capacity;

    public Drink(String name, int price,  int capacity) {
        super(name, price);
        this.capacity = capacity;
    }

    @Override
    public void showInfo() {
        System.out.println(getName() + "：" + getPrice() + "円（" + capacity + "ml）");
    }

    @Override
    public int discountedPrice() {
        return getPrice() * 90 / 100; 
    }
}

