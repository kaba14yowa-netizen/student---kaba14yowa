package chap12;

public class StringSample {

    public static void main(String[] args) {
        String productCode = "Book-2800-Java入門";
        
        System.out.println(productCode.length());
        System.out.println(productCode.substring(0, 4));
        System.out.println(productCode.indexOf("2800"));
        System.out.println(productCode.contains("BOOK"));
        System.out.println(productCode.replace("BOOK", "MAGAZINE"));
        System.out.println(productCode.toLowerCase());

        String[] parts = productCode.split("-"); // 区切り文字で分割して配列にする
        System.out.println(parts[0]);
        System.out.println(parts[1]);
        System.out.println(parts[2]);

    }

}
