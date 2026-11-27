package chap09;

public class Goods extends Product implements Discountable {

    public Goods(String name, int price) {
        super(name, price);
    }

    @Override
    public void showInfo() {
        System.out.println(getName() + "：" + getPrice() + "円");
    }

    @Override
    public int discountedPrice() {
        return getPrice() * 80 / 100; // セール対象の日用品は2割引で売る
    }
}