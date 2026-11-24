package chap08;

public class Book extends Product{
    
    @Override
    public void showInfo() {
        System.out.println(getName() + "：" + getPrice() + "円（著者：" + author + "）");
    }
    
    private String author;
    
    public Book(String name, int price, String author) {
        super(name, price);
        this.author = author;
    }
    
    public String getAuthor() {
        return author;
        
    
    }

}
