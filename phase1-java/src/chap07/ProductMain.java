package chap07;

public class ProductMain {
    public static void main(String[] args) {
        Product note = new Product("ノート", 150, 2);
        note.showInfo();

        System.out.println("【販売テスト】");
        note.sell();
        note.sell();
        note.sell();

        System.out.println("【価格チェックテスト】");
        note.setPrice(-100);
        note.showInfo();
    }
}
