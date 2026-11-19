package chap03;

public class TicketPrice {
    public static void main(String[] args) {
        int age = 8;
        boolean isMember = true;

        int price; 

        if (age <= 12 || age >= 65) {
            price = 500;
        } else if (isMember) {
            price = 800;
        } else {
            price = 1000;
        }

        System.out.println("入場料：" + price + "円");
    }
}
