package chap08;

public class Food extends Product{
    
    @Override
    public void showInfo() {
        System.out.println(getName() + "：" + getPrice() + "円（賞味期限：" + date + "）");
    }
    
    private String date;
    
    public Food(String name, int price, String date) {
        super(name, price);
        this.date = date;
    }
    
    public String getAuthor() {
        return date;
        
    
    }

}
