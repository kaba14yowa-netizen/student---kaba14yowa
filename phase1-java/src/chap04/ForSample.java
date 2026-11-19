package chap04;

public class ForSample {

    public static void main(String[] args) {
        for (int i =1; i <= 5; i++) {
            System.out.println(i);
        }
        
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            total = total +i;
        }
        System.out.println("1から100の合計：" + total);
    }
}
