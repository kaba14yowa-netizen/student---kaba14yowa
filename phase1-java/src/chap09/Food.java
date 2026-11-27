package chap09;

public class Food extends Product implements Discountable {

    private String expirationDate;

    public Food(String name, int price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public void showInfo() {
        System.out.println(getName() + "：" + getPrice() + "円（賞味期限：" + expirationDate + "）");
    }

    @Override
    public int discountedPrice() {
        return getPrice() * 70 / 100; // 期限が近い食品は3割引で売る
    }
}