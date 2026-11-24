package chap08;

public class InheritanceMain {
    
    public static void main(String[] args) {
        Book book = new Book("Java入門", 2800, "山田太郎");
        
        book.showInfo();
        
        book.setPrice(2500);
        book.showInfo();
        
        }
    }
