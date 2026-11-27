package chap12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReceiptTask {
    public static void main(String[] args) {
        String[] orders = {"ノート,150,3", "ペン,100,5", "はさみ,300,1"};

        StringBuilder receipt = new StringBuilder();
        int total = 0;

        for (String order : orders) {
            String[] parts = order.split(",");
            String name = parts[0];
            int price = Integer.parseInt(parts[1]);
            int count = Integer.parseInt(parts[2]);

            int subtotal = price * count;
            total += subtotal;

            receipt.append(name).append("：").append(subtotal).append("円\n");
        }
        receipt.append("合計：").append(total).append("円");

        System.out.println(receipt.toString());

        LocalDate issueDate = LocalDate.now();
        LocalDate dueDate = issueDate.plusDays(14);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日");

        System.out.println("発行日：" + issueDate.format(formatter));
        System.out.println("支払期限：" + dueDate.format(formatter));
    }
}
