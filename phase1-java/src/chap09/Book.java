package chap09;

public class Book extends Product {

    private String author;

    public Book(String name, int price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public void showInfo() {
        System.out.println(getName() + "：" + getPrice() + "円（著者：" + author + "）");
    }
}