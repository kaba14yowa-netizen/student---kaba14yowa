package chap06;

public class TaxAfter {

    public static void main(String[] args) {
        printTaxIncluded("ノート", 150);
        printTaxIncluded("ペン", 100);
        printTaxIncluded("はさみ", 300);
    }

    static void printTaxIncluded(String name, int price) {
        int taxIncluded = price * 110 / 100;
        System.out.println(name + "：" + taxIncluded + "円");
    }
}

